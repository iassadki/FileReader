package test;

import modele.iFileReader;
import modele.JsonFileReader;
import modele.TextFileReader;

public class FileReaderMain0 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        // Text File Reader
        String file1 = "C:\\Users\\ilias\\Desktop\\su\\java\\FileReader\\FileReader\\src\\test\\fichier.txt";
        String file2 = "C:\\Users\\ilias\\Desktop\\su\\java\\FileReader\\FileReader\\src\\test\\fichier2.txt";

        TextFileReader fileReader = new TextFileReader(file1);
        String endroit = fileReader.fichieralendroit(file1);
        String envers = fileReader.fichieralenvers(file1);
        String palindrome = fileReader.fichierpalindrome(file1);
        
        String file1json = "C:\\Users\\ilias\\Desktop\\su\\java\\FileReader\\FileReader\\src\\test\\fichier.json";
        String file2json = "C:\\Users\\ilias\\Desktop\\su\\java\\FileReader\\FileReader\\src\\test\\fichier2.json"; 

        // JSON File Reader
        JsonFileReader fileReaderjson = new JsonFileReader(file1json);
        String JSONendroit = fileReaderjson.fichieralendroit(file1json);
        String JSONenvers = fileReaderjson.fichieralenvers(file1json);
        String JSONpalindrome = fileReaderjson.fichierpalindrome(file1json);

        System.out.println(" "); System.out.println("FICHIERS TEXTE"); System.out.println(" ");

        if (endroit != null && !endroit.isEmpty() || envers != null && !envers.isEmpty() || palindrome != null && !palindrome.isEmpty()) {
            System.out.println("Contenu du fichier TEXTE a l'endroit :\n" + endroit);
            System.out.println("Contenu du fichier TEXTE a l'envers :\n" + envers); System.out.println(" ");
            System.out.println("Contenu du fichier TEXTE en palindrome :\n" + palindrome);
        }

        System.out.println(" ");
        boolean isFile1EqualsFile2 = TextFileReader.compareFiles(file1, file2);

        if (isFile1EqualsFile2) {
            System.out.println("Les fichiers TEXTE sont identiques.");
        } else {
            System.out.println("Les fichiers TEXTE ne sont pas identiques.");
        }

        System.out.println(" "); System.out.println(" "); System.out.println("FICHIERS JSON"); System.out.println(" ");

        if (JSONendroit != null && !JSONendroit.isEmpty() || JSONenvers != null && !JSONenvers.isEmpty() || JSONpalindrome != null && !JSONpalindrome.isEmpty()) {
            System.out.println("Contenu du fichier JSON a l'endroit :\n" + JSONendroit);
            System.out.println("Contenu du fichier JSON a l'envers :\n" + JSONenvers); System.out.println(" ");
            System.out.println("Contenu du fichier JSON en palindrome :\n" + JSONpalindrome);
        }

        System.out.println(" ");
        boolean isEquals = TextFileReader.compareFiles(file1json, file2json);

        if (isEquals) {
            System.out.println("Les fichiers JSON sont identiques.");
        } else {
            System.out.println("Les fichiers JSON ne sont pas identiques.");
        }

        System.out.println(" ");

    }

}
