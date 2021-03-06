package sysutilities;


public class Name {

		String firstName;
		String middleName;
		String lastName;
		char separator;
		String nickName = "";
		public static int count = 0;
		//Initate variables 
		
		//private validSeparator number 17
		private boolean validSeparator(char separator) {
			boolean valid = false;
			//constructor 
			if(separator == ',') {
				valid = true;
			}else if(separator == '-') {
				valid = true;
			}else if(separator == '#') {
				valid = true;
			}
			return valid;
		}
		//Default Constructor
		// Number 1
		public Name(){
			firstName = "NOFIRSTNAME";
			middleName = "NOMIDDLENAME";
			lastName = "NOLASTNAME";
			separator = '#';
			count = count+1;
			
			
		}
		//Number 2
		public Name(String first, String last) {
			firstName = first;
			lastName = last;
			middleName = "";
			separator = ',';
			
			count = count+1;
		}
		//number 3
		public Name(String first, String middle, String last) {
			firstName = first;
			middleName = middle;
			lastName = last;
			separator = ',';
			
			count = count+1;
		}
		//number 4
		public Name(String first, String middle, String last,char symbol ) {
			firstName = first;
			middleName = middle;
			lastName = last;
			if(validSeparator(symbol)==true) {
				//Question:why .doesnt work here?????
				separator = symbol;
			}else {
				separator = ',';
			}
			count = count+1;
		}
		//number 5-8
		public String getFirstname() {
			return firstName;
		}
		public String getMiddlename() {
			return middleName;
		}
		
		public String getLastname() {
			return lastName;
		}
		public String getNickname() {
			return nickName;
		}
		//number 8
		public void setNickname(String nickName) {
			this.nickName = nickName;
		}
		//number 10 
		public void setSeparator(char separator) {
			if(validSeparator(separator) == true) {
				this.separator = separator;
			}
		}
		//number 11
		public char getSeparator() {
			return separator;
		}
		//number 12 equals
		public boolean equals(Object obj) {
			if(this == obj) {
				return true;
			}
			if(obj == null || this.getClass() != obj.getClass()) {
				return false;
			}
			Name newName = (Name) obj;
			if(newName.firstName.equals(firstName))
			if(newName.middleName.equals(middleName))
			if(newName.lastName.equals(lastName))	
				return true;
			//end of bracket
			return false;
			
		}
		//number 13
		public String toString() {
			String output = "";
			if(this.middleName.equals("") && this.nickName.equals("")){
				output = (String)(this.lastName+this.firstName);
				//both has no middle name or nick name 
			}else if(!(this.middleName.equals(""))&& this.nickName.equals("")) {
				output = (String)(this.lastName+this.separator+this.firstName+this.separator+this.middleName);
				// has middle name no nick name
			}else if(this.middleName.equals("") && !(this.nickName.equals(""))) {
				//no middle name
				//nickname has
				output = (String)(this.lastName + this.firstName + "(" + this.nickName + ")");
			}else if(!(this.middleName.equals(""))&& !(this.nickName.equals(""))) {
				//has middle name 
				//has nickname
				output = (String)(this.lastName + this.separator + this.firstName + this.separator + this.middleName + "(" + this.nickName + ")");
			}
			return output;
		}
		
		//number 14 compareTo
		public int compareTo(Name compareTo) {
			//initiate value
			int value = 0;
			//lastName--firstName--middleName
			if(compareTo.lastName.equals(this.lastName)) {
				//last name same
				value =0;
			}else {
				//last name diff
				int index = 0;
				while(value == 0) {
					if(index == compareTo.lastName.length()) {
						value = 1;
						break;
					}
					if(index == this.lastName.length()) {
						value = -1;
						break;
					}
					value = (int)(this.lastName.charAt(index) - compareTo.lastName.charAt(index));
					index++;
				}
			}
				
				if(compareTo.firstName.equals(this.firstName)) {
					//first name same
					value = 0;
				}else {
					//first name diff
					int index = 0;
					while(value == 0) {
						if(index == compareTo.firstName.length()) {
							value = 1;
							break;
						}
						if(index == this.firstName.length()) {
							value = -1;
							break;
						}
						value = (int)(this.firstName.charAt(index) - compareTo.firstName.charAt(index));
						index++;
					}
				}
					if(compareTo.middleName.equals(this.middleName)) {
						//middle name same
						value = 0;
					}else {
						//middle name diff
						int index = 0;
						while(value == 0) {
							if(index == compareTo.middleName.length()) {
								value = 1;
								break;
							}
							if(index == this.middleName.length()) {
								value = -1;
								break;
							}
							value = (int)(this.middleName.charAt(index) - compareTo.middleName.charAt(index));
							index++;
						}
					}
			return value;
		}
		
		
		// number 15 count
		public static int getNumberOfNameObjects() {
			return count;
		}
		//number 16 normalize
		
		public static Name normalize(Name object, boolean test) {
			Name newName = new Name();
			newName.separator = ',';
			
			if(test == true) {
				newName.firstName = object.firstName.toUpperCase();
				newName.middleName = object.middleName.toUpperCase();
				newName.lastName = object.lastName.toUpperCase();
			}if(test == false) {
				newName.firstName = object.firstName.toLowerCase();
				newName.middleName = object.middleName.toLowerCase();
				newName.lastName = object.lastName.toLowerCase();
			}
			return newName;
		}
		
		
	}

	


