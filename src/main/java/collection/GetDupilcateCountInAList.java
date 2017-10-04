package collection;

import java.util.ArrayList;
import java.util.List;

public class GetDupilcateCountInAList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> name = new ArrayList<String>();

		name.add("vinoth");
		name.add("dinesh");
		name.add("velu");
		name.add("viji");
		name.add("prabha");
		name.add("sowmiya");
		name.add("vinoth");

		String dup = "vinoth";
		int i=0;

		for (String name1 : name) {

			if (name1.matches(dup)) {
				i++;
			}

		}

		System.out.println(i);

	}

}
