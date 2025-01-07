package launcher;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SQLMenu {

    private Scanner scanner;

    public SQLMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    public int selectSQLLanguage() {
        Map<Integer, String> sqlLanguages = new HashMap<>();
        sqlLanguages.put(1, "MySQL");
        sqlLanguages.put(2, "SQL");
        sqlLanguages.put(3, "Oracle");

        System.out.println("Seleccione el lenguaje SQL:");
        for (Map.Entry<Integer, String> entry : sqlLanguages.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
        return scanner.nextInt();
    }

    public int selectOperation() {
        Map<Integer, String> operations = new HashMap<>();
        operations.put(1, "Crear");
        operations.put(2, "Leer");
        operations.put(3, "Actualizar");
        operations.put(4, "Eliminar");
        operations.put(5, "Búsqueda con filtro");

        System.out.println("Seleccione la operación que desea realizar:");
        for (Map.Entry<Integer, String> entry : operations.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
        return scanner.nextInt();
    }

    public Object createObjetc(){
        System.out.println("Seleccione el tipo de objeto que desea crear:");
        System.out.println("1. Cliente");
        System.out.println("2. Producto");
        System.out.println("3. Empleado");
        System.out.println("4. Pedido");
        System.out.println("5. Proveedor");

        int opcion = scanner.nextInt();

        if (opcion==1) {
            return ClassCreation.solicitarDatosCliente(scanner);
        } else if(opcion==2) {
            return ClassCreation.solicitarDatosProducto(scanner);
        } else if(opcion==3){
            return ClassCreation.solicitarDatosEmpleado(scanner);
        } else if(opcion==4){
            return ClassCreation.solicitarDatosPedido(scanner);
        }else if(opcion==5){
            return ClassCreation.solicitarDatosProveedor(scanner);
        }else{
            System.out.println("Opción no válida. Intente nuevamente.");
            return null;
        }
    }
}
