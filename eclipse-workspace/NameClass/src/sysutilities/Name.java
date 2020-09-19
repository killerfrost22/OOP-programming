package sysutilities;

public class Name {
	private static String name;
	private int length;
	 String firstName;
	String middleName;
	String lastName;
	String nickName;
	char separator;
    static int totalNumber = 0;
	
	public Name() {//1
		firstName = "NOFIRSTNAME";
		lastName = "NOLASTNAME";
		middleName = "NOMIDDLENAME";
		separator = '#';
		name =lastName+separator+middleName+separator+firstName;
		
		System.out.println("Hi");
		totalNumber++;
		
	}
	
    public Name(String last,String first) { //2   Constructor with two parameters 
		name = last + " "+first;
		totalNumber++;
	}
    
    public  Name (String last, String middle, String first) { //3  Constructor with three parameters 
		name = last + " " + middle + " " + first;
		totalNumber++;
	}
    
    public  Name(String last,String middle,String first, char separator) { //4  Constructor with four parameters 
		name=last;
		name+=separator;
		name+=middle;
		name+=separator	+last;
		totalNumber++;
	}
    
    public  String getFirstName(String firstName) { //5  getFirstname
		
		this.firstName = firstName;
		return firstName;
	}
	
	public String getMiddleName(String middleName) { //6  getMiddlename
		
	    this.middleName = middleName;
		return middleName;
	}
	
	public  String getLastName(String lastName) { //7  getLastname
		this.lastName = lastName;
		return lastName;
	}
	
	public void setNickname(String nickNameIn) {//8
		nickName = nickNameIn;
		
	}
	
	public static String getNickname() {//9
		String nickName = null;
		return nickName;
		
	}
	
	public char setSeparator(char separator) { //10   setSeparator
		if(separator ==',' || separator=='-' || separator == '#') {
			this.separator = separator;
		}
		return this.separator;
	}
	
	
	public static char getseparator() {//11
		char separator = 0;
		return separator;
		
	}
	
	public boolean equals(Object obj) {  //12
		
		return false;
	}
	
	public String toString() {//13
		return  name;
	}
	
	public  int compareTo(Name name) {//14
		int a;
		a=this.length-name.length;
		return a;
		
	}
	public static int getNumberOfNameObjects() {//15
		
		return Name.totalNumber;
	}
	
	
	public static Name normalize(Object name, boolean a){ // 16  normalize-static
		Name nameback = new Name();
		if(a == true) {
			nameback.name = Name.name.toUpperCase();
		}else {
			nameback.name = Name.name.toLowerCase() ;
		}
		totalNumber++;
		return nameback;
		
	}
	
	private boolean validSeparator( char characterIn) { //17
		boolean a;
		if(characterIn ==',' || characterIn=='-' || characterIn == '#') {
			a=true;
		}else {
			a=false;
		}
		return a;
	}

	

	 

	
}