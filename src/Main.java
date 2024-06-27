import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String filePath = "../GroupX-M2T-HTML/src/source.txt";
        List<String> lines = new ArrayList<>();

        // Lire le fichier source avec l'encodage UTF-8 spécifié
        try (BufferedReader br = new BufferedReader(new FileReader(filePath, StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            System.out.println("Lecture du fichier source.txt réussie.");
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier source.txt : " + e.getMessage());
            e.printStackTrace();
            return;
        }

        // Générer le HTML ligne par ligne
        StringBuilder html = new StringBuilder();
        for (String line : lines) {
            String[] parts = line.split(":", 2);
            if (parts.length == 2) {
                String key = parts[0].trim();
                String value = parts[1].trim().replace("\"", "");

                switch (key) {
                    case "titre":
                        html.append("<!DOCTYPE html>\n<html>\n<head>\n");
                        html.append("<meta charset=\"UTF-8\">\n");
                        html.append("<title>").append(value).append("</title>\n");
                        html.append("</head>\n<body>\n");
                        break;
                    case "grand-titre":
                        html.append("<h1>").append(value).append("</h1>\n");
                        break;
                    case "paragraphe":
                        html.append("<p>").append(value).append("</p>\n");
                        break;
                    default:
                        // Ignorer les lignes qui ne sont pas des clés attendues
                        break;
                }
            }
        }

        html.append("</body>\n</html>");
        System.out.println("Génération du HTML réussie.");

        // Écrire le HTML dans un fichier index.html avec l'encodage UTF-8 spécifié
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("../GroupX-M2T-HTML/src/index.html", StandardCharsets.UTF_8))) {
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
}
