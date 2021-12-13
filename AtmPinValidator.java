

import java.util.Scanner;
class PinMismatchException extends RuntimeException{
	public PinMismatchException() {
		System.out.println(" Sorry..Your Account Has been Locked.");
	}
}
public class AtmPinValidator {
	static int pin = 1321;
	static int let = 0;
	static int num;
	static void pinMismatchtest(int num){
		if(num == pin) {
	
		System.out.println("\nPIN ACCEPTED. ACCESS GRANTED");
	} 
	else if (num != pin && let>= 3) {
		throw new PinMismatchException();
	}else {
		System.out.println("Logout");
		}
	}


	public static void main(String[] args) {
		
		
		Scanner scr = new Scanner(System.in);
		System.out.println(("Please enter account holder"));
		String name = scr.nextLine();
		//System.out.println("name");
				
		System.out.println("Enter Pin Please");
		int num = scr.nextInt();
		let++;
		
		while(num!=pin && let<3) {
			
		System.out.println("wrong pin try again");
		//System.out.println("Please re-enter pin");
		
		num = scr.nextInt();
		let++;
		
		}
		try {
			pinMismatchtest(num);	
		}catch (PinMismatchException e) {
			e.printStackTrace();
		}
		scr.close();
	}

}	
	
	


