package model.adapters;

import java.io.IOException;
import java.util.List;
import model.Adapter;
import model.converters.JSON;

public class JSONAdapter implements Adapter{
    
    JSON json = new JSON();

    @Override
    public List<String> importar(String ruta) {
        System.out.println("- Importando archivo...");
        return json.importJSON(ruta);
    }

    @Override
    public void exportar(List<String> lines) {
        System.out.println("- Convirtiendo archivo...");
        String l = json.convertJSON(lines);
        try {
            System.out.print("- Exportando...");
            json.exportJSON(l);
            System.out.println("Archivo datajson.json creado con éxito");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
