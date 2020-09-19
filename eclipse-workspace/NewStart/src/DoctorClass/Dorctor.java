package DoctorClass;

public class Dorctor {
	private String name;
	private String specialty;
	private int yeasrsOfExperience;
	
	public Dorctor(){
		this.name = "NONAME";
		this.specialty = "NOSPECIALTY";
		this.yeasrsOfExperience = 0;
	}
	public Dorctor(String name, String specialty, int yearsOfExperience) {
		this.name = name;
		this.specialty = specialty;
		this.yeasrsOfExperience = yeasrsOfExperience;
	}
	public void increaseExperience(int i) {
		// only increase the value in the specific method
		if(this.checkYears(yeasrsOfExperience+i)) {
		this.yeasrsOfExperience +=i;
		}else {
			
		}
	}
	//getter methods
	public String getName() {
		return this.name;
	}
	public String gets() {
		return this.specialty;
	}
	public int y() {
		return this.yeasrsOfExperience;
	}
	//setter
	public void setName(String inputName) {
		this.name = inputName;
	}
	//setter fr YoE
	public void YoE(int inputYears) {
		this.yeasrsOfExperience = inputYears;
	}
	public String toStirng() {
		return this.name+this.specialty+this.yeasrsOfExperience;
	}
	private boolean checkYears() {
		if(this.yeasrsOfExperience<=75 && this.yeasrsOfExperience >=0) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
