package launcher;

import model.Adapter;
import java.util.List;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Path path = new Path();
        AdapterFactory aF = new AdapterFactory(scanner);
        Adapter a = aF.getAdapter();

        if (a != null) {
            List<String> data = a.importar(path.ruta(a)); 
            a.exportar(data);
        } else {
            System.out.println("Opción no válida.");
        }
    }
}
