package week3.day2.Assignments2;

public class FindIntersection {

	public static void main(String[] args) {
		
		int Array[] = {3,2,11,4,6,7};
		
		int Array1[] = {1,2,8,4,9,7};
		
		for (int i = 0; i < Array.length; i++) {
			
			for (int j = 0; j < Array1.length; j++) {
				if(Array[i]==Array1[j]) {
					System.out.println("iNSERTION OF Two Arrays:" +Array1[i]);
				}
			}
		}

	}

}
