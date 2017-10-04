package string;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String intxt = "YOUR SUCCESS BEGINS TODAY";
		intxt=intxt.replace(" ", "");
		int a=intxt.length();
		
		
		int i,j=0;
		
		for(i=0;i<a;i++){
			
			char v=intxt.charAt(i);
			String vow=String.valueOf(v);
			System.out.println(vow);
			
			if (vow.equals("A") || vow.equals("E") || vow.equals("I") || vow.equals("O") || vow.equals("U")){
				
				j=j+1;
				
			}
			
	
		
		}
		
		System.out.println("The number of vowels are "+j);

		
		
		

		
	}

}
