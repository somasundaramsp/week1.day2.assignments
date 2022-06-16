package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {
	
	public static void main(String[] args) {
		int[] arra = { 1, 2, 3, 4, 7, 6, 8 };
		int i;
		Arrays.sort(arra);
		for (i = arra[0]; i <= arra.length; i++) {
			if (i != arra[i-1]) {
				System.out.println(i);
				break;
			}

}
}
}