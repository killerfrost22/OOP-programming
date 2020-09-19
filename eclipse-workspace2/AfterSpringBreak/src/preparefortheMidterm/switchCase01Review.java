package preparefortheMidterm;

public class switchCase01Review {
	public static void ss(String p, char x) {
		
			switch (x){
			case 'a':
			case 'A':
				p= "AI";
				System.out.println(p);
				break;
			case 'f':
				p="fal";
				System.out.println(p);
				break;
			
			default:
				p="Bob";
				System.out.println(p);
				break;
			}
	}
	public static void main(String [] args) {
		String p = "";
		char x = 's';
		ss(p,x);
	}
}	
