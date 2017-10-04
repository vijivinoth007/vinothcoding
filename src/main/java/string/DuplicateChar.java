package string;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String intxt = "YOUR SUCCESS BEGINS TODAY";

		// String vin[] = {""};
		intxt = intxt.replaceAll(" ", "");
		// int m=0;
		String txt = intxt;
		System.out.println(txt);
		int c = txt.length();
		System.out.println(c);
		System.out.println("The duplicated char are: ");
		int i = 0, j, k = 0;

		//for (i = 0; i < c; i++) {


			for (j = 0; j < c - (j+ 1); j++) {
				
				char chr = txt.charAt(i);
				String str = String.valueOf(chr);
				txt = txt.replaceFirst(str, "");


				if (chr == txt.charAt(j)) {
					

					System.out.print(txt.charAt(j) + ",");
					/*
					 * vin[m] = String.valueOf(txt.charAt(j)); m++;
					 */
					k++;
				}

			}
			
			
		}

		/*
		 * System.out.println(vin);
		 */
	}

//}
