package week3.day2.Assignments2;

public class Palindrome {

	public static void main(String[] args) {
		
		//Palindrome means if a word read forward and backword give same word and meaning
		
		String str = "kameshwar";
		String rev = "";
		int length = str.length();

		for ( int i = length - 1; i >= 0; i-- )
		   rev = rev + str.charAt(i);

		if (str.equals(rev))
		   System.out.println(str+" is a palindrome");
		else
		   System.out.println(str+" is not a palindrome");


	}

}
