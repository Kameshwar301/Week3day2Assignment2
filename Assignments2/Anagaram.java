package week3.day2.Assignments2;

import java.util.Arrays;

public class Anagaram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		if(text1.length()==text2.length()) {
			char[] txt1 = text1.toCharArray();
			Arrays.sort(txt1);
			System.out.println(Arrays.toString(txt1));
			char[] txt2 = text2.toCharArray();
			Arrays.sort(txt2);
			System.out.println(Arrays.toString(txt2));
			System.out.println(Arrays.equals(txt1, txt2));
			if (txt1.equals(txt2)) {
				System.out.println("The Given String is Anagaram");
			}
			else {
				System.out.println("The Given String is NOT Anagaram");
			}
		}
	}

}
