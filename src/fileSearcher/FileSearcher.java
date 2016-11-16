package fileSearcher;

import java.io.File;
import java.io.FileNotFoundException;
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

	}

	public static void getBrojSlova(File file) {

	}

	public static void getBrojKaraktera(File file) {

	}

	public static void getBrojPonavljanjaSlova(File file) {

	}
}
