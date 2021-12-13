import java.util.Scanner;

public class Assig1ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter range");
		int num3= obj.nextInt();
		obj.close();
		//int num3 = 500;
		if (num3>0 && num3 <= 50) {
		  System.out.println(50*1);
		 }
			else if (num3>50 && num3 <= 100) {
				System.out.println((50*1)+(50*2)); 
		  
		}else if (num3>100 && num3 <= 200) 
	{
		  System.out.println((50*1)+(50*2)+ (100*3));
		  }
		else if (num3>200 && num3 <= 400) {
			  System.out.println((100*1)+(100*2)+ (100*3)+(100*4));}
		else if (num3>400) {
			  System.out.println((100*1)+(100*2)+(100*3)+(100*4)+(100*5));}
		
		else {
		  System.out.println(50*0);
		}
	
	}

}

