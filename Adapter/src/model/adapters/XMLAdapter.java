package model.adapters;

import java.io.IOException;
import java.util.List;
import model.Adapter;
import model.converters.XML;

public class XMLAdapter implements Adapter{

    XML xml = new XML();

    @Override
    public List<String> importar(String ruta) {
        List<String> c;
        try {
            System.out.print("- Importando archivo...");
            c = xml.readFile(ruta);
            System.out.println("Archivo xml leído con éxtito.");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return c;
    }

    @Override
    public void exportar(List<String> lines) {
        System.out.print("- Convirtiendo archivo...");
        String l = xml.convertXMLtoJSON(lines);
        System.out.println("Archivo convertido con éxito.");
        System.out.print("- Exportando...");
        try {
            xml.writeToFile(l);
            System.out.println("Archivo datacsv.json creado con éxito");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
