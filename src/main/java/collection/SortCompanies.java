package collection;

import java.util.Arrays;

public class SortCompanies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] companies={"Accenture","HCL","cts","TCS"};
		
		Arrays.sort(companies);
		int i;
		
		for(i=0;i<companies.length;i++){
			
			System.out.println(companies[i]);
		}

	}

}
