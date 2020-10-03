package week3.day2.Assignments2;

public class ChangeOddIndextoUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  test = "kameshwar";
		//change the string char
		char[] ch = test.toCharArray();
		for(int i = 0; i<ch.length; i++)
		{
			if(i % 2 != 0) {
				//declaring toUpperCase method and give argument variable name of char[]
				ch[i] = Character.toUpperCase(ch[i]);
			}
			
		}
			System.out.println((ch));
			

	}

}
