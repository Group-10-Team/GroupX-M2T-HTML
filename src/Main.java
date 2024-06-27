
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
        String filePath = "../GroupX-M2T-HTML/src/source.txt";
        StringBuilder sourceContent = new StringBuilder();

        // Lire le fichier source
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                sourceContent.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Analyser le contenu du fichier source
        MyLangParser parser = new MyLangParser(sourceContent.toString());
        Map<String, String> elements = parser.parse();

        // Générer le HTML
        StringBuilder html = new StringBuilder();
        html.append("<!DOCTYPE html>\n<html>\n<head>\n");
        html.append("<title>").append(elements.getOrDefault("titre", "")).append("</title>\n");
        html.append("</head>\n<body>\n");
        html.append("<h1>").append(elements.getOrDefault("grand-titre", "")).append("</h1>\n");
        html.append("<p>").append(elements.getOrDefault("paragraphe", "")).append("</p>\n");
        html.append("</body>\n</html>");

     // Écrire le HTML dans un fichier index.html
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("../GroupX-M2T-HTML/src/index.html"))) {
            bw.write(html.toString());
            System.out.println("Écriture dans le fichier index.html réussie.");
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture dans le fichier index.html : " + e.getMessage());
            e.printStackTrace();
            return;
        }

        // Afficher le HTML généré (optionnel)
        System.out.println(html.toString());
    }

    static class MyLangParser {
        private String source;

        public MyLangParser(String source) {
            this.source = source;
        }

        public Map<String, String> parse() {
            Map<String, String> elements = new HashMap<>();
            String[] lines = source.split("\n");
            for (String line : lines) {
                String[] parts = line.split(":", 2);
                if (parts.length == 2) {
                    String key = parts[0].trim();
                    String value = parts[1].trim().replace("\"", "");
                    elements.put(key, value);
                }
            }
            return elements;
        }
    }
}