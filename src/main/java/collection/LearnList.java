package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> name=new ArrayList<String>();
		
		name.add("vinoth");
		name.add("dinesh");
		name.add("velu");
		name.add("viji");
		name.add("prabha");
		name.add("sowmiya");
		
		Collections.sort(name);
		name.size();
		
		System.out.println("name size:"+name.size());
		
		for (String name1:name){
			
			System.out.println(name1);
		}
		

 
	}

}
