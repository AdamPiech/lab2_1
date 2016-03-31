package edu.iis.mto.bsearch;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void testFirst() {
		int[] array = {};
		boolean flag = false;
		try {
			SearchResult result = BinarySearch.search(3, array);
		} catch (IllegalArgumentException e) {
			flag = true;
		}
		assertTrue(flag);
	}
		
	@Test
	public void testSecond() {
		int[] array = {1, 2, 3, 4, 5};
		SearchResult result = BinarySearch.search(3, array);
		assertEquals(result.getPosition(), 3);
	}
	
	@Test
	public void testThird() {
		int[] array = {1, 2, 3, 4, 5};
		SearchResult result = BinarySearch.search(3, array);
		assertTrue(result.isFound());
	}
	
	@Test
	public void testFourtht() {
		int[] array = {1, 2, 3, 4, 5};
		SearchResult result = BinarySearch.search(7, array);
		assertFalse(result.isFound());
	}
	
	@Test
	public void testFifth() {
		int[] array = {1, 2, 3, 4, 5};
		SearchResult result = BinarySearch.search(7, array);
		assertEquals(result.getPosition(), -1);
	}

}
