package sam;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Hexawar";

		char[] chr = name.toCharArray();

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char ch : chr) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				System.out.println("it has duplicates");
				break;
			}
		}
		
		System.out.println(map);

	}

}
