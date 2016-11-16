package fileSearcher;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileSearcher {

	public static void getBrojRijeci(File file) {

	}

	public static void getBrojUnikatnihRijeci(File file) {

	}

	public static void getBrojRecenica(File file) {
		int brojacRecenica = 0;
		// Provjeramo da li fajl postoji ili ga je potrebno kreirati
		if (file.exists()) {			
			try (java.util.Scanner input = new java.util.Scanner(file)) {
				// Citamo podatke iz fajla
				while(input.hasNext()) {
					if (Character.isLetter(input.next().charAt(0)))
						brojacRecenica++;
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Fajl ne postoji");	
		}
		// CRATITITITITIT
	}

	public static void getBrojSlova(File file) {

	}

	public static void getBrojKaraktera(File file) {

	}

	public static void getBrojPonavljanjaSlova(File file) {

	}
}
