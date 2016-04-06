/**
 * 
 */
package edu.iis.mto.bsearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import edu.iis.mto.error.SequenceIsNotSortedException;
import javafx.print.Collation;

/**
 * Utility Class dla wyszukiwania binarnego
 * 
 */
public class BinarySearch {

	/**
	 * Metoda realizujaca wyszukiwanie binarne
	 * 
	 * @param key
	 *            - szukany obiekt
	 * @param seq
	 *            - rosnaco uporzadkowana niepusta sekwencja
	 * @return obiekt rezultatu o polach: - found (true jezeli znaleziony) -
	 *         position (jezeli znaleziony - pozycja w sekwencji, jezeli nie
	 *         znaleziony -1)
	 * @throws SequenceIsNotSortedException 
	 */
	public static SearchResult search(int key, int[] seq) {
		
		if (seq.length == 0) {
			throw new IllegalArgumentException();
		}
		
		if (!isSorted(seq)) {
			throw new SequenceIsNotSortedException();
		}
		
		int start = 0;
		int end = seq.length - 1;
		int center;
		SearchResult result = new SearchResult();

		while (start <= end) {
			center = (start + end) / 2;
			if (seq[center] == key) {
				result.setPosition(center + 1);
				break;
			} else {
				if (seq[center] < key)
					start = center + 1;
				else
					end = center - 1;
			}

		}
		return result;
	}

	private static boolean isSorted(int[] seq) {
		
		if (seq.length <= 1) {
			return true;
		}

		for (int index = 1; index < seq.length; index++) {
			if (seq[index] < seq[index - 1]) {
				return false;
			}
		}
		
		return true;
	}

}
