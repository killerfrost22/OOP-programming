package studentCode;

import java.util.ArrayList;

public class AlphaListV2 {

	//We are keeping this public for easier testing.
	public String[][] list;  
	
	
	
	
	public AlphaListV2() {
		list = new String[26][] ;
		for(int i=0;i<26;i++) {
			list [i]  = new String[0];
		}
	}
		

	public void insert(String value) {
		int j = (int) value.charAt(0)-(int)'A';
		String [] list1 = new String[list[1]]
	xxxx	int location = (int) i-65;
		

		for(int i1 = 0; i1 < list.length+1; i1 ++)
			list[i]= list[i][i1];
		}
	
	}
	
		list[list.length-1][]= new String[]
	}
	
	public void remove(String value) {
;
	}
	
	public int count() {
		throw new RuntimeException("Implement this...");
	}

}
