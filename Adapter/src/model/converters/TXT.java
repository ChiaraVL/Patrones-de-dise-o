package model.converters;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class TXT{
     public List<String> importTXT(String txtFilePath) {
        try {
            // Crear un lector de archivos
            BufferedReader reader = new BufferedReader(new FileReader(txtFilePath));

            // Leer las líneas del archivo TXT
            String line;
            List<String> lines = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

            // Cerrar el lector de archivos
            reader.close();
            return lines;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public String convertToJSON(List<String> txtData) {
        if (txtData.isEmpty()) {
            return "[]";
        }

        StringBuilder jsonContent = new StringBuilder("[");
        String delimiter = "";

        for (String line : txtData) {
            jsonContent.append(delimiter);
            jsonContent.append("{");
            jsonContent.append("\"contenido\":\"").append(escapeJsonString(line)).append("\"");
            jsonContent.append("}");
            delimiter = ",";
        }

        jsonContent.append("]");

        return jsonContent.toString();
    }

    private String escapeJsonString(String input) {
        // Escapar caracteres especiales para que sean JSON válidos
        input = input.replace("\\", "\\\\");
        input = input.replace("\"", "\\\"");
        input = input.replace("\n", "\\n");
        input = input.replace("\r", "\\r");
        input = input.replace("\t", "\\t");
        return input;
    }

    public void exportJSON(String jsonContent) {
        try (FileWriter fileWriter = new FileWriter("datatxt.json", StandardCharsets.UTF_8)) {
            fileWriter.write(jsonContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}