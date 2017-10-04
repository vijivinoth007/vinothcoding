package collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<Integer,String> data=new TreeMap<Integer,String>();
		
		data.put(100, "vinoth");
		data.put(101, "prabha");
		data.put(102, "sowmiya");
		
		if(data.containsKey(100)){
			
			data.put(100, "vinothkumar");
		}
		
		System.out.println(data.entrySet());
		
		for (Entry<Integer,String> eachdata :data.entrySet()){
			
			System.out.println(eachdata);
			
			
		}

		
		
		

	}

}
