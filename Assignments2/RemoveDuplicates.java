package week3.day2.Assignments2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


import com.google.common.hash.HashCode;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		System.out.println("The text is");
		System.out.println(text);
	
		/*
		 * values.add(text); System.out.println(values);
		 */
		// Need to split the text
		
	String[] split = text.split("\\s+");
	//Convert String array ti LinkedHashSet to remove duplicates
	
	LinkedHashSet<String> set = new LinkedHashSet<String>(Arrays.asList(split));
	//join the words again by space
	
	StringBuilder sb = new StringBuilder();
	int count = 0;
	
	for (String str : set) {
		if(count>0) 
			sb.append(" ");
			sb.append(str);
			count++;
		
		
		
		
	}
	text = sb.toString();
	System.out.println("String after duplicate: "+text);
		/* System.out.println(text); */
		
			
		
			
	}

}
