package Assignment;

import java.util.Scanner;
class CreditsNotSufficientException extends RuntimeException{
	public CreditsNotSufficientException() {
		System.out.println("Credit not sufficient");
	}
}
public class Assig12CreditsException {
	static void creditCheck(double credit) {
	if (credit<50) {
		throw new CreditsNotSufficientException();
	} else {
		System.out.println("credit is sufficient");
	}
	}
	public static void main(String[] args) {
		
// TODO Auto-generated method stub

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter credit Please");
  double credit = sc.nextDouble();
  try {
  creditCheck(credit);
  }catch (CreditsNotSufficientException e) {
	  e.printStackTrace();
} 
	}

}
