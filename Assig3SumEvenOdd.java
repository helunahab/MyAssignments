import java.util.Scanner;

public class Assig3SumEvenOdd {

	public static void main(String[] args) {
		Scanner sum =new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = sum.nextInt();
		sum.close(); 
		
		int evenSum=0,oddSum=0; 
		for(int i=0; i<num; i++){
			
			if(i % 2==0){
				
			  evenSum=evenSum+i; 
			}
			else {
			  oddSum= oddSum+i; 
			}
		}
			System.out.println("Sum of even is: "+evenSum);
			System.out.println("Sum of odd is: "+oddSum);
			

	}

}
