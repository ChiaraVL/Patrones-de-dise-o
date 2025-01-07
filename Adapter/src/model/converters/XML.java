package model.converters;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XML {
    public List<String> readFile(String filePath) throws IOException {
        List<String> content = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.add(line);
            }
        }

        return content;
    }
    
    public String convertXMLtoJSON(List<String> xmlContent) {
        // Crear un objeto StringBuilder para construir el JSON
        StringBuilder jsonBuilder = new StringBuilder();
        
        jsonBuilder.append("[");  // Iniciar el arreglo JSON
    
        boolean firstBook = true;
    
        // Procesar las líneas del archivo XML y convertirlas a JSON
        for (String xmlLine : xmlContent) {
            // Ignorar líneas en blanco y líneas de cierre </...>
            if (xmlLine.trim().isEmpty() || xmlLine.trim().startsWith("</")) {
                continue;
            }
    
            // Dividir la línea en etiquetas de apertura y cierre
            String[] parts = xmlLine.trim().split("[<>]");
            if (parts.length >= 3) {
                String elementName = parts[1];
                String elementValue = parts[2];
    
                if (elementName.equals("libro")) {
                    // Iniciar un nuevo objeto JSON para un libro
                    jsonBuilder.append(firstBook ? "{" : ", {");
                    firstBook = false;
                }
    
                // Procesar la línea XML y convertirla a JSON
                jsonBuilder.append("\"").append(elementName).append("\": \"").append(elementValue).append("\", ");
            }
        }
    
        // Eliminar la coma extra del último libro y cerrar el arreglo JSON
        jsonBuilder.delete(jsonBuilder.length() - 2, jsonBuilder.length());
        jsonBuilder.append("]");
    
        return jsonBuilder.toString();
    }
    
    public void writeToFile(String content) throws IOException {
        try (FileWriter fileWriter = new FileWriter("dataxml.json")) {
            fileWriter.write(content);
        }
    }
}
