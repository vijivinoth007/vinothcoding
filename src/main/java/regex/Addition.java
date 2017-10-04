package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String p= "[0-9]+";
		String name="Amazon has 12415 employees in usa and 24500 employees in india";
		int sum=0;
		
		Pattern pat=Pattern.compile(p);
		Matcher match=pat.matcher(name);
		
		while(match.find()){
			
		String a=match.group();
		sum=sum+Integer.parseInt(a);

		
		}
		
		System.out.print(sum);

		
	
		

	}

}
