package edu.iis.mto.bsearch;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void testFirst() {
		int[] array = {7};
		SearchResult result = BinarySearch.search(7, array);
		assertTrue(result.isFound());
	}
	
	@Test
	public void testSecond() {
		int[] array = {7};
		SearchResult result = BinarySearch.search(5, array);
		assertFalse(result.isFound());
	}

	@Test
	public void testThird() {
		int[] array = {2, 3, 4, 5, 6};
		SearchResult result = BinarySearch.search(2, array);
		assertEquals(result.getPosition(), 1);
	}
	
	@Test
	public void testFourth() {
		int[] array = {2, 3, 4, 5, 6};
		SearchResult result = BinarySearch.search(6, array);
		assertEquals(result.getPosition(), array.length);
	}
	
	@Test
	public void testFifth() {
		int[] array = {2, 3, 4, 5, 6};
		SearchResult result = BinarySearch.search(4, array);
		assertEquals(result.getPosition(), array.length/2+1);
	}
	
	@Test
	public void testSixth() {
		int[] array = {2, 3, 4, 5, 6};
		SearchResult result = BinarySearch.search(8, array);
//		assertEquals(result.getPosition(), -1);
		assertFalse(result.isFound());
	}
}
