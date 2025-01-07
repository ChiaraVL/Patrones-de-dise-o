package launcher;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import model.Adapter;
import model.adapters.*;

public class AdapterFactory {
    private Map<Integer, Adapter> adapterMap;
    private Scanner scanner;
    private int choice;

    public AdapterFactory(Scanner s){
        this.scanner = s;
        choice();
    }

    public void choice(){
        adapterMap = new HashMap<>();
        adapterMap.put(1, new CSVAdapter());
        adapterMap.put(2, new TXTAdapter());
        adapterMap.put(3, new XMLAdapter());
        adapterMap.put(4, new JSONAdapter());

        System.out.println("Seleccione el tipo de archivo que tiene:");
        System.out.println("1. CSV");
        System.out.println("2. TXT");
        System.out.println("3. XML");
        System.out.println("4. JSON");

        choice = scanner.nextInt();
    }

    public Adapter getAdapter() {
        return adapterMap.get(choice);
    }
}
