import java.util.Scanner;

public class Assig2BankingMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	System.out.println("Display Menu");
		String number = account.next();
		System.out.println("Create Account");
		int number1 = account.nextInt();
		System.out.println("Put credit money");
		Double number2 =account.nextDouble();
		System.out.println("Put Debit money");
		Double number3 =account.nextDouble();
		System.out.println("Transfer money");
		Double number4 =account.nextDouble();
		System.out.println("Please select option");
		String number5 =account.nextLine();*/
		
		
		Scanner account = new Scanner(System.in);
		char reply = 0;
		
		do {
			
		System.out.println("Display Bank Menu");
		 //String number = account.next();
		 
		    System.out.println("Please Create Account"); 
		// int number1 = account.nextInt();
		 
			System.out.println("Put credit money");
		//Double number2 =account.nextDouble();
		
			System.out.println("Put Debit money");
		//Double number3 =account.nextDouble();
		
			System.out.println("Transfer money");
		//Double number4 =account.nextDouble();
		
			System.out.println("Please select option");
		/*String number5 =account.nextLine();
		System.out.println("1 account is created, 2 do you want to continue, 3 yes, 4 succesfully transfered");
		*/
			
	int abc = account.nextInt();
	//account.close();
	
	//System.out.println("1 account is created, 2 do you want to continue, 3 yes, 4 succesfully transfered");
			
		switch (abc) {
		case 1:
			
			System.out.println("account is successfully created");
			
			//System.out.println("1 account is created, 2 do you want to continue, 3 yes, 4 succesfully transfered");
			
			break;
		case 2:

			System.out.println("Amount is credited..");

			break;

		case 3:

			System.out.println("Debit credit is created...");

			break;

		case 4:

			System.out.println(" Transaction successfull ...");

			break;
		
		default:

			System.out.println("Invalid choice, Please try again...");

	}
		
		System.out.println("Please do you want to continue y/n");
		char newreply = account.next().charAt(0);
		if (newreply =='y') {
			System.out.println("please select option");
		}else {
			System.out.println("Goodbye visit again");
		}
			Scanner scr = new Scanner(System.in);
			abc= scr.nextInt();
			
		
		}while(reply!='n');

	}

}
