package studentCode;

import java.util.ArrayList;

public class AlphaListV1 {

	//We are keeping this public for easier testing.
	public ArrayList<ArrayList<String>> list;  
	
	
	
	public AlphaListV1() {
	list = new ArrayList<ArrayList<String>>(26);
	for(int i = 0; i < 26; i++ )
		list.add(new ArrayList<String>());
	}
	
	public void insert(String value) {
		char firstChar = value.charAt(0);
		int location = (int) firstChar-65;
		list.get(location).add(value);
		}
	
	public void remove(String value) {
		char firstChar = value.charAt(0);
		int location = (int) firstChar-65;
		list.get(location).remove(value);	
	}
	
	public int count() { 
		int count = 0;
		for (int i = 0; i<list.size(); i++) {
			count += list.get(i).size();
			
		}
		return count;
	}
	
}
