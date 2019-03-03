package aa224fn_assign4.time;

import java.util.Arrays;
import java.util.Comparator;

public class SortingAlgorithms {

	public static void main(String[] args) {
	
		
	}

	public static int[] insertionSort(int[] in) {
		int[] arr = new int[in.length];
		for (int i = 1; i < arr.length; i++) {
			int hold = in[i];
			int j = i;
			while (j > 0 && hold < in[j - 1]) {
				in[j] = in[j - 1];
				j--;
			}
			in[j] = hold;
		}
		arr = in;
		return arr;
	}

	public static int[] mergeSort(int[] in) {
		int arr[] = new int[in.length];
		if (in.length <= 1) {
			arr = in;
			return arr;
		}
		int[] first = new int[in.length / 2];
		int[] second = new int[in.length - first.length];
		for (int i = 0; i < first.length; i++) {
			first[i] = in[i];
		}
		for (int i = 0; i < second.length; i++) {
			second[i] = in[first.length + i];
		}
		mergeSort(first);
		mergeSort(second);

		int iFirst = 0;
		int iSecond = 0;
		int j = 0;
		while (iFirst < first.length && iSecond < second.length) {
			if (first[iFirst] < second[iSecond]) {
				in[j] = first[iFirst];
				iFirst++;
			} else {
				in[j] = second[iSecond];
				iSecond++;
			}
			j++;
		}
		while(iFirst<first.length) {
			in[j]=first[iFirst];
			iFirst++;
			j++;
		}
		while(iSecond<second.length) {
			in[j]=second[iSecond];
			iSecond++;
			j++;
		}
		
		arr = in;
		return arr;
	}

	public static String[] insertionSort(String[] in, Comparator<String> c) {

		String[] arr = new String[in.length];
		for (int i = 1; i < arr.length; i++) {
			String hold = in[i];
			int j = i;
			while (j > 0 && hold.compareTo(in[j - 1]) < 0) {
				in[j] = in[j - 1];
				j--;
			}
			in[j] = hold;
		}
		arr = in;
		return arr;
	}

	public static String[] mergeSort(String[] in, Comparator<String> c) {
		String arr[] = new String[in.length];

		if (in.length <= 1) {
			arr = in;
			return arr;
		}
		String[] first = new String[in.length / 2];
		String[] second = new String[in.length - first.length];
		for (int i = 0; i < first.length; i++) {
			first[i] = in[i];
		}
		for (int i = 0; i < second.length; i++) {
			second[i] = in[first.length + i];
		}
		mergeSort(first, c);
		mergeSort(second, c);

		int iFirst = 0;
		int iSecond = 0;
		int j = 0;
		while (iFirst < first.length && iSecond < second.length) {
			if (first[iFirst].compareTo(second[iSecond]) < 0) {
				in[j] = first[iFirst];
				iFirst++;
			} else {
				in[j] = second[iSecond];
				iSecond++;
			}
			j++;
		}
		while(iFirst<first.length) {
			in[j]=first[iFirst];
			iFirst++;
			j++;
		}
		while(iSecond<second.length) {
			in[j]=second[iSecond];
			iSecond++;
			j++;
		}
		
		arr = in;
		return arr;
	}
}
