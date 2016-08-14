package search;

public class SequentialSearch {
	public static void main(String[] args) {
		int target = 6;
		int[] iArr = { 3, 2, 6, 8, 5, 1, 7, 9 };
		int index = sequentialSearch(iArr, target);
		System.out.println(index);
	}

	public static  Integer sequentialSearch(int[] t,int target) {
		for (int i = 0; t != null && i < t.length; i++) {
			if (t[i] == target) {
				return i;
			}
		}
		return -1;
	}
}