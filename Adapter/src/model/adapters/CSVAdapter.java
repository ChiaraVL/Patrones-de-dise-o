package model.adapters;

import java.util.List;
import model.Adapter;
import model.converters.CSV;

public class CSVAdapter implements Adapter{

    CSV csv = new CSV();
    
    @Override
    public List<String> importar(String ruta){
        System.out.print("- Importando archivo...");
        List<String> csvDta;
        csvDta = csv.importCSV(ruta);
        System.out.println("Archivo csv leído con éxtito.");
        return csvDta;
    }

    @Override
    public void exportar(List<String> lines) {
        System.out.print("- Convirtiendo archivo...");
        String content = csv.convertToJSON(lines);
        System.out.println("Archivo convertido con éxito.");
        System.out.print("- Exportando...");
        csv.exportJSON(content);
        System.out.println("Archivo datacsv.json creado con éxito");
    }
    
}
