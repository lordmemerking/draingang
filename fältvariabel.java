import java.util.Arrays;

public class fältvariabel {

	public static void main(String[] args) {
		int[] a = new int[100];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
		}
		int[] b = sortArray(a);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

	public static int[] sortArray(int[] arr) {
		Arrays.sort(arr, 0, arr.length);
		return arr;
	}

}
