package string;

public class DuplicateAndUniqueCharUsingCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String intxt = "YOUR SUCCESS BEGINS TODAY";
		intxt=intxt.replaceAll(" ", "");
				
		char [] chr=intxt.toCharArray();
		
		int l=chr.length;
		
		int i,j;
		
		System.out.print("the duplicated char are: ");
		
		for (i=0;i<l;i++){
			
			for(j=i+1;j<l;j++){
				
				
				if(chr[i] == chr[j]){
					String str=String.valueOf(chr[i]);
					System.out.print(chr[i]+" ");
					intxt=intxt.replaceAll(str, "");
				break;
				}
				
			}
		}
		System.out.println();
		System.out.println("The unique char are: "+intxt+ " ");

	}

}
