package launcher;

import model.Adapter;
import model.adapters.*;

public class Path {
    public String ruta(Adapter a) {
        if (a instanceof CSVAdapter) {
            return "C:\\Users\\Chiara\\OneDrive\\Escritorio\\Chiara\\Universidad\\Sexto Semestre\\Patrones de diseño de software\\Adapter\\src\\archivos\\datos.csv";
        } else if (a instanceof TXTAdapter) {
            return "C:\\Users\\Chiara\\OneDrive\\Escritorio\\Chiara\\Universidad\\Sexto Semestre\\Patrones de diseño de software\\Adapter\\src\\archivos\\datos.txt";
        } else if (a instanceof XMLAdapter) {
            return "C:\\Users\\Chiara\\OneDrive\\Escritorio\\Chiara\\Universidad\\Sexto Semestre\\Patrones de diseño de software\\Adapter\\src\\archivos\\datos.xml";
        } else if (a instanceof JSONAdapter) {
            return "C:\\Users\\Chiara\\OneDrive\\Escritorio\\Chiara\\Universidad\\Sexto Semestre\\Patrones de diseño de software\\Adapter\\src\\archivos\\prueba.json";
        } else {
            return null;
        }
    }
}
