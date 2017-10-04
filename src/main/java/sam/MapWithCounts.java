package sam;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapWithCounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Hexawareeee";

		char[] chr = name.toCharArray();

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char ch : chr) {

			if (map.containsKey(ch)) {

				map.put(ch, map.get(ch) + 1);
				System.out.println();
			}

			else if (!map.containsKey(ch)) {
				map.put(ch, 1);
			}


		}
		
		 System.out.println(map);

		
		for (char ch : chr) {

			if (map.get(ch) > 1){

				System.out.println(ch + "=" + map.get(ch));

		}}


	}

}
