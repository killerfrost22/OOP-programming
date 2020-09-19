package sysutilities;

	public class Address{
		private String street;
		private String city;
		private String state;
		private String zipCode;
		
		// Constructor with four parameters
		public Address(String street, String city, String state, String zipCode) {
			if(street != null) {
				this.street=street.trim();
				this.city = city.trim();
				this.state = state.trim();
				this.zipCode = zipCode.trim();
			}else {
				throw new IllegalArgumentException("Invalid Address Argument");
			}
	
		}
		//Default Constructor 
		public Address() {
			this.street = "8223 Paint Branch Dr.";
			this.city = "College Park";
			this.state = "MD";
			this.zipCode = "20742" ;
		}
		//Copy Constructor 
		public Address(Address ad) {
			this.street = ad.street;
			this.city = ad.city;
			this.state =ad.state;
			this.zipCode = ad.zipCode;
		}
		//Constructor with only one parameter
		public Address(String street) {
			this.street = street;
		}
		//Getters
		public String getStreet() {
			return street;
		}
		public String getCity() {
			return city;
		}
		public String getState() {
			return state;
		}
		public String getZipCode() {
			return zipCode;
		}
		public boolean equals(Object obj) {
			Address newAddress = (Address) obj;
			if(newAddress.street.equals(this.street))		
				if(newAddress.city.equals(this.city))
					if(newAddress.state.equals(this.state))	
						if(newAddress.zipCode == (this.zipCode))	
							return true;
			//end of bracket
			return false;
		}
		public String toString() {
			String output = "";
			output = street + " "+ city + " "+state+ " "+ zipCode; 
			return output;
		}
	}
