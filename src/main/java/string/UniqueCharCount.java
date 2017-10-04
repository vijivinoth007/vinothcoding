package string;

public class UniqueCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String intxt = "YOUR SUCCESS BEGINS TODAY";
		intxt=intxt.replace(" ", "");
		String ftxt=intxt;
		String txt=intxt;
		int a=txt.length();
		int i,j;
		char c;
		
		for(i=0;i<a;i++){
			
			char chr=txt.charAt(i);
			String str=String.valueOf(chr);
			txt=txt.replaceFirst(str, "");
			
			for(j=0;j<a-1;j++){
				
				
				if(chr == txt.charAt(j)){
					
					intxt=intxt.replaceAll(str, "");
																					
				}
				
				//a=txt.length();	
				txt=ftxt;
				
			}			
				
				
		}
		
		System.out.println("the unique char are  "+intxt);

		
		


	}

}
