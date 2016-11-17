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
			// Kreiramo citac
			try (java.util.Scanner input = new java.util.Scanner(file)) {
				// Citamo podatke iz fajla
				while(input.hasNext()) {
					String rijecZnakIliBroj = input.next();
					char zadnjiKarakter = rijecZnakIliBroj.charAt(rijecZnakIliBroj.length() - 1);
					
					if (zadnjiKarakter == '.' || zadnjiKarakter == '?' || zadnjiKarakter == '!')
						brojacRecenica++;
				}
				
				System.out.println("U fajlu se nalazi " + brojacRecenica + " recenica.");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Fajl ne postoji");	
		}
	}

	public static void getBrojSlova(File file) {
		int brojacslova = 0;
		
		// Provjeramo da li fajl postoji ili ga je potrebno kreirati
		if (file.exists()) {
			// Kreiramo citac
			try (java.util.Scanner input = new java.util.Scanner(file)) {
				// Citamo podatke iz fajla
				while(input.hasNextLine()) {
					String citavRed = input.nextLine();
					for (int i = 0; i < citavRed.length(); i++)
						if (Character.isLetter(citavRed.charAt(i)))
							brojacslova++;
					
				}
				System.out.println("U fajlu se nalazi " + brojacslova + " slova.");
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();				
			}
			
		} else {
			System.out.println("Fajl ne postoji");			
		}
	}

	public static void getBrojKaraktera(File file) {

	}

	public static void getBrojPonavljanjaSlova(File file) {

	}
}
