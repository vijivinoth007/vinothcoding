package sam;
import java.util.LinkedHashMap;
import java.util.Map;

public class ToPrintTheSecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Hexawaree";
		char[] chr = a.toCharArray();

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char c : chr) {

			if (map.containsKey(c)) {
				
				map.put(c,map.get(c)+1);
								
			}
			
			if (!map.containsKey(c)) {
				
				map.put(c,1);
							}
		}
		int i=0,max=0,max2=0;
		for(char c:chr){
			
			if(map.get(c)>i)
			{
				max=map.get(c);
				max2=i;
				i=max;
				}
			
			else 
			{
				max=i;
				max2=map.get(c);
				
			}
				
		}
		
		System.out.println(map);

	}

}
