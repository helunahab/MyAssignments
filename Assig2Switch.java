import java.util.Scanner;

public class Assig2Switch {

	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		System.out.println("Please enter num1");
		double num1= abc.nextInt();
		
		System.out.println("Please enter num2");
		double num2= abc.nextInt();
		//abc.close();
		
		System.out.print("Please enter case number for calculator:");
		System.out.println("1 to Add, 2 to Subtract, 3 to Multiply, 4 to Divide");
		
		//Scanner scanner = new Scanner(System.in);
		int star = abc.nextInt();
		abc.close();
		
		switch (star) {
			
		case 1:
				
				System.out.println("num1 + num2 = " + (num1+num2));
				break;
			case 2:
				System.out.println("num1 - num2 = " + (num1-num2));
				break;
			case 3:
				System.out.println("num1 x num2 = " + (num1*num2));;
				break;
			case 4:
				System.out.println("num1/num2 = " + (num1/num2));;
				break;
				
			default:
				System.out.println("no answer");
		}
	
	}

}
