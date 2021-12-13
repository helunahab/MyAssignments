import java.util.Scanner;

public class Assig5PrintPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);
	        System.out.println("Rows needed for the pattern is ?. Please enter 5");
	        int rows = sc.nextInt();
	         
	        System.out.println("The pattern looks like....!!!");
	         
	        for (int i = 1; i <= rows; i++) 
	        {
	            for (int j = 1; j <= i; j++)
	            {
	                System.out.print(j+" ");
	            }
	             
	            System.out.println();
	   
	         sc.close();
		     }
	}
}
