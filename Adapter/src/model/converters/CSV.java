package model.converters;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class CSV {

    public List<String> importCSV(String csvFilePath){
        try {
            // Crear un lector de archivos
            BufferedReader reader = new BufferedReader(new FileReader(csvFilePath));

            // Leer las líneas del archivo CSV
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

    public String convertToJSON(List<String> csvData) {
        if (csvData.isEmpty()) {
            return "[]";
        }

        StringBuilder jsonContent = new StringBuilder("[");
        String[] headers = csvData.get(0).split(",");

        for (int i = 1; i < csvData.size(); i++) {
            String[] row = csvData.get(i).split(",");
            jsonContent.append("{");
            for (int j = 0; j < headers.length; j++) {
                jsonContent.append("\"").append(headers[j]).append("\":\"").append(row[j]).append("\"");
                if (j < headers.length - 1) {
                    jsonContent.append(",");
                }
            }
            jsonContent.append("}");
            if (i < csvData.size() - 1) {
                jsonContent.append(",");
            }
        }
        jsonContent.append("]");

        return jsonContent.toString();
    }

    public void exportJSON(String jsonContent){
        try (FileWriter fileWriter = new FileWriter("datacsv.json", StandardCharsets.UTF_8)) {
            fileWriter.write(jsonContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
