 package collection;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="Hexaware";
		
		char[] chr=name.toCharArray();
		
		Set<Character> set=new HashSet<Character>();
		
		
		for (char c:chr){
		set.add(c);
		}
		
		
		System.out.println(set);
		
		
	}

}
