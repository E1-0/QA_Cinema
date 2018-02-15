package assessment;

import java.util.Scanner;


public class calculations {

	int std, oap, stu, chd;
	Scanner user = new Scanner(System.in);
	
	public void userInput() {
		
	// user input: amount of tickets required
		System.out.print("\nNumber of Standard Tickets: ");
		std = user.nextInt();

		System.out.print("Number of OAP Tickets: ");
		oap = user.nextInt();
		
		System.out.print("Number of Student Tickets: ");
		stu = user.nextInt();
		
		System.out.print("Number of Child Tickets: ");
		chd = user.nextInt();
	}

	public void ticketPrices() {
		// setting ticket prices for all weekdays EXCEPT Wednesday
		std = std*8;
		oap = oap*6;
		stu = stu*6;
		chd = chd*4;
	}
	public void ticketPricesWed() {
		// setting ticket prices for ONLY Wednesday
		std = (std*8)-2;		//discount of -2 is applied to each ticket
		oap = (oap*6)-2;
		stu = (stu*6)-2;
		chd = (chd*4)-2;
	}

	public int priceCalc() {
		return std+oap+stu+chd; 	// addition calculation for total price of combined tickets 
	}

}
