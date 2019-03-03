package aa224fn_assign3;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.*;
import java.util.Random;

public class SortTest {

	Comparator<String> c = Comparator.comparing((String x) -> x);

	@Test
	public void testIntInsertionSort() {
		Random rand = new Random();
		int[] hundredrandomed = new int[300];
		int number = 999;
		if (number <= 0)
			number = hundredrandomed.length;
		for (int i = 0; i < hundredrandomed.length; i++) {
			hundredrandomed[i] = rand.nextInt(number);
			;
		}
		int[] sorted = new int[300];
		int number1 = 0;
		for (int i = 0; i < sorted.length; i++) {
			sorted[i] = number1;
			number1 += 5;
		}
		int[] singel = new int[] { 5 };
		int[] Randomed = new int[] { 300, 8875, 84, 47, 38, 15 };
		int[] Sortedlimited = new int[] { 10, 20, 33, 48, 285, 9875 };

		Assert.assertArrayEquals(singel, SortingAlgorithms.insertionSort(singel));
		Assert.assertArrayEquals(Randomed, SortingAlgorithms.insertionSort(Randomed));
		Assert.assertArrayEquals(Sortedlimited, SortingAlgorithms.insertionSort(Sortedlimited));
		Assert.assertArrayEquals(hundredrandomed, SortingAlgorithms.insertionSort(hundredrandomed));
		Assert.assertArrayEquals(sorted, SortingAlgorithms.insertionSort(sorted));

		System.out.println("Insertion singel array: " + Arrays.toString(singel) + "\n");
		System.out.println("Insertion Random Limited array: " + Arrays.toString(Randomed) + "\n");
		System.out.println("Insertion Sorted limited array: " + Arrays.toString(Sortedlimited) + "\n");
		System.out.println("Insertion Randomed Large array: " + Arrays.toString(hundredrandomed) + "\n");
		System.out.println("Insertion Sorted Large array: " + Arrays.toString(sorted) + "\n");
	}

	@Test
	public void testIntMergeSort() {
		Random rand = new Random();
		int[] hundredrandomed = new int[300];
		int number = 999;
		if (number <= 0)
			number = hundredrandomed.length;
		for (int i = 0; i < hundredrandomed.length; i++) {
			hundredrandomed[i] = rand.nextInt(number);
			;
		}
		int[] sorted = new int[300];
		int number1 = 0;
		for (int i = 0; i < sorted.length; i++) {
			sorted[i] = number1;
			number1 += 5;
		}
		int[] singel = new int[] { 5 };
		int[] Randomed = new int[] { 300, 8875, 84, 47, 38, 15 };
		int[] Sortedlimited = new int[] { 10, 20, 33, 48, 285, 9875 };

		Assert.assertArrayEquals(singel, SortingAlgorithms.insertionSort(singel));
		Assert.assertArrayEquals(Randomed, SortingAlgorithms.insertionSort(Randomed));
		Assert.assertArrayEquals(Sortedlimited, SortingAlgorithms.insertionSort(Sortedlimited));
		Assert.assertArrayEquals(hundredrandomed, SortingAlgorithms.insertionSort(hundredrandomed));
		Assert.assertArrayEquals(sorted, SortingAlgorithms.insertionSort(sorted));

		System.out.println("Merge singel array: " + Arrays.toString(singel) + "\n");
		System.out.println("Merge Random Limited array: " + Arrays.toString(Randomed) + "\n");
		System.out.println("Merge Sorted limited array: " + Arrays.toString(Sortedlimited) + "\n");
		System.out.println("Merge Randomed Large array: " + Arrays.toString(hundredrandomed) + "\n");
		System.out.println("Merge Sorted Large array: " + Arrays.toString(sorted) + "\n");
	}

	@Test
	public void testStringInsertionSort() {
		String[] singel = new String[] { "ahmad" };
		String[] RandomNames = new String[] { "Ahmad", "Sarah", "Jack", "Zoe", "Micheal", "Kalyse", "jhon" };
		String[] letterSorted = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
				"r", "s", "t", "u", "v", "w", "x", "y", "z" };
		String[] letterRandomed = { "r", "c", "f", "o", "e", "a", "n", "u", "v", "q", "k", "l", "m", "w", "d", "p", "j",
				"z", "s", "t", "h", "i", "w", "g", "y", "b" };

		assertEquals(singel, SortingAlgorithms.insertionSort(singel, c));
		assertEquals(RandomNames, SortingAlgorithms.insertionSort(RandomNames, c));
		assertEquals(letterSorted, SortingAlgorithms.insertionSort(letterSorted, c));
		assertEquals(letterRandomed, SortingAlgorithms.insertionSort(letterRandomed, c));
		System.out.println("Insertion singel array: " + Arrays.toString(singel) + "\n");
		System.out.println("Insertion RandomNames Limited array: " + Arrays.toString(RandomNames) + "\n");
		System.out.println("Insertion letterSorted limited array: " + Arrays.toString(letterSorted) + "\n");
		System.out.println("Insertion letterSorted limited array: " + Arrays.toString(letterRandomed) + "\n");
	}

	@Test
	public void testStringMergeSort() {
		String[] singel = new String[] { "ahmad" };
		String[] RandomNames = new String[] { "Ahmad", "Sarah", "Jack", "Zoe", "Micheal", "Kalyse", "jhon" };
		String[] letterSorted = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
				"r", "s", "t", "u", "v", "w", "x", "y", "z" };
		String[] letterRandomed = { "r", "c", "f", "o", "e", "a", "n", "u", "v", "q", "k", "l", "m", "w", "d", "p", "j",
				"z", "s", "t", "h", "i", "w", "g", "y", "b" };
		assertEquals(singel, SortingAlgorithms.insertionSort(singel, c));
		assertEquals(RandomNames, SortingAlgorithms.insertionSort(RandomNames, c));
		assertEquals(letterSorted, SortingAlgorithms.insertionSort(letterSorted, c));
		assertEquals(letterRandomed, SortingAlgorithms.insertionSort(letterRandomed, c));
		System.out.println("Merge singel array: " + Arrays.toString(singel) + "\n");
		System.out.println("Merge RandomNames Limited array: " + Arrays.toString(RandomNames) + "\n");
		System.out.println("Merge letterSorted limited array: " + Arrays.toString(letterSorted) + "\n");
		System.out.println("Merge letterSorted limited array: " + Arrays.toString(letterRandomed) + "\n");

	}

}
