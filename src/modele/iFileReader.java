package modele;

public interface iFileReader {
	
	String fichieralendroit(String filePath); // fichier a l'endroit
	String fichieralenvers(String filePath); // en terme de lignes
	String fichierpalindrome(String filePath); // le premier caractere de la ligne devient le dernier, etc. En gros, on inverse les lignes

}
