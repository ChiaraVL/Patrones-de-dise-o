package model.converters;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class JSON {
    
    public List<String> importJSON(String jsonFilePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(jsonFilePath));
            String line;
            List<String> lines = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();
            return lines;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public String convertJSON(List<String> jsonContent) {
        // Combina las líneas del JSON en una sola cadena
        StringBuilder jsonStringBuilder = new StringBuilder();
        for (String line : jsonContent) {
            jsonStringBuilder.append(line);
        }
        return jsonStringBuilder.toString();
    }

    public void exportJSON(String jsonContent) throws IOException {
        try (FileWriter fileWriter = new FileWriter("datajson.json", StandardCharsets.UTF_8)) {
            fileWriter.write(jsonContent);
        }
    }
}
