package aa224fn_assign4.time;

import java.util.Comparator;
import java.util.Random;

public class SortingAlgorithms_timeMeasurement {
	static Comparator<String> c = Comparator.comparing((String x) -> x);

	public static void main(String[] args) {

		//IntInsertionSort();
		 //StringInsertionSort();
		IntMergeSort();
		 //StringMergeSort();

	}

	public static void IntInsertionSort() {

		Random rand = new Random();

		int[] arr = new int[1000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(arr.length * 2);
		}
		int estimation = 0;
		while (estimation < 1000) {
			long start = System.currentTimeMillis();
			SortingAlgorithms.insertionSort(arr);
			long end = System.currentTimeMillis();
			estimation = (int) (end - start);
			System.out.println("milliseconds: " + estimation + ".  length: " + arr.length);

			if (estimation == 999 || estimation == 1000 || estimation == 1001) {
				break;
			} else if (estimation > 1001 && estimation <= 1050) {

				arr = new int[arr.length - 1];
				for (int i = 0; i < arr.length; i++) {
					arr[i] = rand.nextInt(arr.length * 2);
				}
				estimation = 0;
			} else if (estimation > 1050) {

				arr = new int[arr.length - 500];
				for (int i = 0; i < arr.length; i++) {
					arr[i] = rand.nextInt(arr.length * 2);
				}
				estimation = 0;
			} else if (estimation <= 950) {

				arr = new int[arr.length + 1000];
				for (int i = 0; i < arr.length; i++) {
					arr[i] = rand.nextInt(arr.length * 2);
				}
				estimation = 0;
			} else {

				arr = new int[arr.length + 1];
				for (int i = 0; i < arr.length; i++) {
					arr[i] = rand.nextInt(arr.length * 2);
				}

			}
		}
	}

	public static void StringInsertionSort() {
		Random rand = new Random();
		int length = 1000;
		int number = length * 2;
		String[] arr = new String[1000];

		String[] letter = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
				"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

		if (number >= letter.length || number <= 0)
			number = letter.length;
		StringBuilder s;
		for (int i = 0; i < arr.length; i++) {
			s = new StringBuilder();
			int count = 0;
			while (count != 10) {
				s.append(letter[rand.nextInt(number)]);
				count++;
			}
			arr[i] = s.toString();

		}
		int estimation = 0;
		while (estimation < 1000) {
			long start = System.currentTimeMillis();
			SortingAlgorithms.insertionSort(arr, c);
			long end = System.currentTimeMillis();
			estimation = (int) (end - start);
			System.out.println("milliseconds: " + estimation + ".  length: " + arr.length);

			if (estimation == 999 || estimation == 1000 || estimation == 1001) {
				break;
			} else if (estimation > 1001 && estimation <= 1050) {

				arr = new String[arr.length - 1];
				number = arr.length * 2;

				if (number >= letter.length || number <= 0)
					number = letter.length;
				for (int i = 0; i < arr.length; i++) {
					s = new StringBuilder();
					int count = 0;
					while (count != 10) {
						s.append(letter[rand.nextInt(number)]);
						count++;
					}
					arr[i] = s.toString();
				}

				estimation = 0;
			} else if (estimation > 1050) {

				arr = new String[arr.length - 250];
				number = arr.length * 2;

				if (number >= letter.length || number <= 0)
					number = letter.length;
				for (int i = 0; i < arr.length; i++) {
					s = new StringBuilder();
					int count = 0;
					while (count != 10) {
						s.append(letter[rand.nextInt(number)]);
						count++;
					}
					arr[i] = s.toString();
				}

				estimation = 0;
			}

			else if (estimation <= 950) {

				arr = new String[arr.length + 500];
				number = arr.length * 2;

				if (number >= letter.length || number <= 0)
					number = letter.length;
				for (int i = 0; i < arr.length; i++) {
					s = new StringBuilder();
					int count = 0;
					while (count != 10) {
						s.append(letter[rand.nextInt(number)]);
						count++;
					}
					arr[i] = s.toString();
				}

			} else {

				arr = new String[arr.length + 1];
				number = arr.length * 2;

				if (number >= letter.length || number <= 0)
					number = letter.length;
				for (int i = 0; i < arr.length; i++) {
					s = new StringBuilder();
					int count = 0;
					while (count != 10) {
						s.append(letter[rand.nextInt(number)]);
						count++;
					}
					arr[i] = s.toString();
				}

			}
		}
	}

	public static void IntMergeSort() {

		Random rand = new Random();
		int[] arr = new int[1000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(arr.length * 2);
		}
		int estimation = 0;
		while (estimation < 1000) {
			long start = System.currentTimeMillis();
			SortingAlgorithms.mergeSort(arr);
			long end = System.currentTimeMillis();
			estimation = (int) (end - start);
			System.out.println("milliseconds: " + estimation + ".  length: " + arr.length);

			if (estimation == 999 || estimation == 1000 || estimation == 1001) {
				break;
			} else if (estimation > 1001 && estimation <= 1050) {

				arr = new int[arr.length - 1];
				for (int i = 0; i < arr.length; i++) {
					arr[i] = rand.nextInt(arr.length * 2);
				}
				estimation = 0;
			} else if (estimation <= 950) {

				arr = new int[arr.length + 1000];
				for (int i = 0; i < arr.length; i++) {
					arr[i] = rand.nextInt(arr.length * 2);
				}
			} else if (estimation > 1050) {

				arr = new int[arr.length - 1000];
				for (int i = 0; i < arr.length; i++) {
					arr[i] = rand.nextInt(arr.length * 2);
				}
			} else {

				arr = new int[arr.length + 1];
				for (int i = 0; i < arr.length; i++) {
					arr[i] = rand.nextInt(arr.length * 2);
				}
			}
		}
	}

	public static void StringMergeSort() {
		Random rand = new Random();
		int length = 1000;
		int number = length * 2;
		String[] arr = new String[1000];

		String[] letter = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
				"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

		if (number >= letter.length || number <= 0)
			number = letter.length;
		StringBuilder s;
		for (int i = 0; i < arr.length; i++) {
			s = new StringBuilder();
			int count = 0;
			while (count != 10) {
				s.append(letter[rand.nextInt(number)]);
				count++;
			}
			arr[i] = s.toString();

		}
		int estimation = 0;
		while (estimation < 1000) {
			long start = System.currentTimeMillis();
			SortingAlgorithms.mergeSort(arr, c);
			long end = System.currentTimeMillis();
			estimation = (int) (end - start);
			System.out.println(
					"milliseconds: " + estimation + ".  length: " + arr.length);

			if (estimation == 999 || estimation == 1000 || estimation == 1001) {
				break;
			} else if (estimation > 1001 && estimation <= 1050) {

				arr = new String[arr.length - 1];
				number = arr.length * 2;

				if (number >= letter.length || number <= 0)
					number = letter.length;
				for (int i = 0; i < arr.length; i++) {
					s = new StringBuilder();
					int count = 0;
					while (count != 10) {
						s.append(letter[rand.nextInt(number)]);
						count++;
					}
					arr[i] = s.toString();
				}

				estimation = 0;
			} else if (estimation > 1050) {

				arr = new String[arr.length - 1000];
				number = arr.length * 2;

				if (number >= letter.length || number <= 0)
					number = letter.length;
				for (int i = 0; i < arr.length; i++) {
					s = new StringBuilder();
					int count = 0;
					while (count != 10) {
						s.append(letter[rand.nextInt(number)]);
						count++;
					}
					arr[i] = s.toString();
				}
				estimation = 0;
			} else if (estimation <= 950) {

				arr = new String[arr.length + 10000];
				number = arr.length * 2;
				if (number >= letter.length || number <= 0)
					number = letter.length;
				for (int i = 0; i < arr.length; i++) {
					s = new StringBuilder();
					int count = 0;
					while (count != 10) {
						s.append(letter[rand.nextInt(number)]);
						count++;
					}
					arr[i] = s.toString();
				}
			} else {
				arr = new String[arr.length + 1];
				number = arr.length * 2;

				if (number >= letter.length || number <= 0)
					number = letter.length;
				for (int i = 0; i < arr.length; i++) {
					s = new StringBuilder();
					int count = 0;
					while (count != 10) {
						s.append(letter[rand.nextInt(number)]);
						count++;
					}
					arr[i] = s.toString();
				}
			}
		}
	}
}