package Week1_Lab;

public class Week1_lab_variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int availableSeatsOnPlane = 5;
		double costOfGroceries = 23.64;
		char middleInital = 'S';
		boolean isHotOutSide = false;
		String firstName = "Big";
		String streetAddress = "1234 Seasme Street";
		
		/* System.out.println("Seats left on the plane: " + availableSeatsOnPlane);
		System.out.println("Total cost of your food: " + costOfGroceries);
		System.out.println("Middle Initial: " + middleInital);
		System.out.println("Is it hot outside? " + isHotOutSide);
		System.out.println("What is your name? " + firstName);
		System.out.println("Where do you live? " + streetAddress);
		*/
		
		availableSeatsOnPlane -= 2;
		costOfGroceries += 2.15;
		middleInital = 'A';
		isHotOutSide = !isHotOutSide;
		String fullName = firstName + " " + middleInital + " Ass"; 
		System.out.println("Seats left on the plane: " + availableSeatsOnPlane);
		System.out.println("Total cost of your food: " + costOfGroceries);
		System.out.println("Middle Initial: " + middleInital);
		System.out.println("Is it hot outside? " + isHotOutSide);
		System.out.println("What is your full name? " + fullName);
		System.out.println("Hi my name is " + fullName + " I live here at " + streetAddress );
		
	}

}
