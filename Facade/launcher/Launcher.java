package launcher;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SQLMenu menu = new SQLMenu(scanner);
        SQLStatementBuilder statementBuilder = new SQLStatementBuilder();
        Object o = menu.createObjetc();

        while (true) {
            int lenguajeSQL = menu.selectSQLLanguage();
            
            if (lenguajeSQL == 0) {
                System.out.println("Saliendo del programa...");
                scanner.close();
                System.exit(0);
            }

            int operacion = menu.selectOperation();
            if (operacion == 0) {
                continue;
            }

            String sentenciaSQL = statementBuilder.buildSQLStatement(lenguajeSQL, operacion, o);
            System.out.println("Sentencia generada:");
            System.out.println(sentenciaSQL);
        }
    }
}
