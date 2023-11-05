package modele;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class TextFileReader implements iFileReader {

    private String fileName;

    public TextFileReader(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    // Méthode pour la lecture du fichier à l'endroit
    @Override
    public String fichieralendroit(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(getFileName()), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Une erreur s'est produite lors de la lecture du fichier : " + e.getMessage());
        }
        return content.toString();
    }
        
    

    // Méthode pour la lecture du fichier à l'envers en termes de lignes
    @Override
    public String fichieralenvers(String filePath) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(getFileName()), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Une erreur s'est produite lors de la lecture du fichier : " + e.getMessage());
        }
        Collections.reverse(lines);
        return String.join("\n", lines);
    }

    // Méthode pour la lecture du fichier de façon palindromique, en inversant les lignes
    @Override
    public String fichierpalindrome(String filePath) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(getFileName()), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(new StringBuilder(line).reverse().toString());
            }
        } catch (IOException e) {
            System.err.println("Une erreur s'est produite lors de la lecture du fichier : " + e.getMessage());
        }
        return String.join("\n", lines);
    }

    // Comparateur de fichiers
public static boolean compareFiles(String filePath1, String filePath2) {
    String lineOne;
    String lineTwo;

    try (BufferedReader reader1 = new BufferedReader(new InputStreamReader(new FileInputStream(filePath1), StandardCharsets.UTF_8));
         BufferedReader reader2 = new BufferedReader(new InputStreamReader(new FileInputStream(filePath2), StandardCharsets.UTF_8))) {

        while ((lineOne = reader1.readLine()) != null && (lineTwo = reader2.readLine()) != null) {

            if (!Objects.equals(lineOne, lineTwo)) {
                return false; // Si une ligne ne correspond pas, retourne false immédiatement
            }
        }

        return true;

    } catch (IOException e) {
        System.err.println("Une erreur s'est produite lors de la comparaison des fichiers : " + e.getMessage());
        return false;
    }
}

    
}
