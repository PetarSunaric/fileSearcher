package fileSearcher;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class FileSearcher {

	public static void getBrojRijeci(File file) {
		
		int counterWord = 0;
		try (java.util.Scanner input = new java.util.Scanner(file)) {
			while (input.hasNext()) {
				String word = input.next();
				counterWord++;
			}
			System.out.printf("Broj rijeci u fajlu je %d.\n", counterWord);
			
		} catch (FileNotFoundException e) {			
			System.out.println("No file");
		}
		
	}

	public static void getBrojUnikatnihRijeci(File file) {
		
		//kao unikatne rijeci racunam rijeci koje se pojavljuju amo jednom u fajlu
		ArrayList<String> lisstOfUniqueWords = new ArrayList<>(); //lista unikatni rijeci
		ArrayList<String> duplicateWords = new ArrayList<>();	//lista rijeci koje su se pojavile bar jednom
	
		try (java.util.Scanner input = new java.util.Scanner(file)) {
			
			while (input.hasNext()) {
				
				String word = input.next();
				if (lisstOfUniqueWords.contains(word)) {
					duplicateWords.add(word); 
				}
				else {
					lisstOfUniqueWords.add(word);
				}
				//ukloniti sve rijeci koje se nalaze u listi duplih rijeci
				lisstOfUniqueWords.removeAll(duplicateWords);
				
			}
			System.out.printf("Broj unikatnih rijeci u tekstu je %d.\n",lisstOfUniqueWords.size());
			
		} catch (FileNotFoundException e) {			
			System.out.println("No file");
		}		
		
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
