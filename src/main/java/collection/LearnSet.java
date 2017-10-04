package collection;

import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<String> data=new TreeSet<String>();
		
		data.add("vinoth");
		data.add("dinesh");
		data.add("prabha");
		
		System.out.println(data.size());
		
		for(String eachdata:data){
			
		System.out.println(eachdata);
		}

	}

}
