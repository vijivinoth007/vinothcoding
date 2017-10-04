package collection;

import java.util.HashMap;
import java.util.Map;

public class HasDupChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name="Hexaware India has 243292349 employees across world";
		
		char[] data=name.toCharArray();
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		
		for (char eachdata:data){
			
			if(!map.containsKey(eachdata)){
			map.put(eachdata, 1);
			}
			
			else{
				System.out.println("it has dups");
				break;
		
				
			}
		}
		

		System.out.println(map);
		
		
	}

}
