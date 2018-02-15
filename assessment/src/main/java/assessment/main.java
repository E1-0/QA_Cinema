package assessment;

import java.util.GregorianCalendar;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class main {

	@Test
	public void main () {
		
		//system enter weekday
		Scanner syst  = new Scanner(System.in);
		String date="";
		System.out.println("System Messaage: Confirm Wweekday: ");
		date = syst.next().toUpperCase();
		
//			int day, month, year;
//			GregorianCalendar date1 = new GregorianCalendar();
//			day = date1.get(GregorianCalendar.DAY_OF_MONTH);
//			month = date1.get(GregorianCalendar.MONTH) + 1;
//			year = date1.get(GregorianCalendar.YEAR);
//			System.out.print(day);System.out.print("/"+month);System.out.print("/"+year+"\n");
		

		//checking if the weekday entered is valid, if not...exit.
		if (date.equals("MONDAY") || date.equals("TUESDAY") || date.equals("WEDNESDAY") || date.equals("THURSDAY") || date.equals("FRIDAY") || date.equals("SATURDAY") || date.equals("SUNDAY"))
		{
			System.out.println("Hi! Welcome to QA Cinemas 1856.\n"
					+ "Please enter the amount of tickets required,"
					+ " then press return to calculate total."); //welcome message 
			
			String cont = "Y";
			
			while (cont.equals("Y")) { 								// continuous running until user quits
				calculations cal = new calculations();
				cal.userInput();									// asking user how many of what ticket they require

				if (date.equals("WEDNESDAY")) cal.ticketPricesWed();	// checking if the day is Wednesday, applying discount
				else cal.ticketPrices();								// calculating prices depending on user input
//				Assert.assertEquals(message, expected, actual);
				
				System.out.println("Total due: £" +cal.priceCalc());	// printing total price
				System.out.println("For next custumer enter 'Y', "		// asking user if they would like to process another order
						+ "otherwise any other key to shutdown...");
				cont = syst.next().toUpperCase();						// reading user input for continuation
			}
		}
		else {System.out.println("incorrect weekday..."); System.exit(0);}		// quits program if weekday entered is incorrect
	}
}
