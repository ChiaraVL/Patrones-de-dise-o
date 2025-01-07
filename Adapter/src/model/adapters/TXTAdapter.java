package model.adapters;

import java.util.List;

import model.Adapter;
import model.converters.TXT;

public class TXTAdapter implements Adapter{

    TXT txt = new TXT();

    @Override
    public List<String> importar(String ruta) {
        System.out.print("- Importando archivo...");
        List<String> Dta;
        Dta = txt.importTXT(ruta);
        System.out.println("Archivo .txt leído con éxtito.");
        return Dta;
    }

    @Override
    public void exportar(List<String> lines) {
        System.out.print("- Convirtiendo archivo...");
        String l = txt.convertToJSON(lines);
        System.out.println("Archivo convertido con éxito.");
        System.out.print("- Exportando...");
        txt.exportJSON(l);
        System.out.println("Archivo datatxt.json creado con éxito");
   }
    
}
