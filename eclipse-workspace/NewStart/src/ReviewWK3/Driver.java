package ReviewWK3;

public class Driver {
		public static void main(String[] args) {
			House house1 = new House(2, 4);
			System.out.println(house1);
			House house2 = new House();
			System.out.println(house2);
			House.addToHouse(House.addToHouse(house1, 10), 50);
			System.out.println(house1);
			house2.addRooms(100).addRooms(500);
			System.out.println(house2);
			}


	}


