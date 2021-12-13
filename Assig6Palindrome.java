import java.util.Scanner;

public class Assig6Palindrome {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);
			System.out.println("Enter the input String");
			String star =sr.next();
			String reverse = "";
			sr.close();
				
				  for (int i = star.length()- 1; i >=0; i--) {
		      reverse = reverse+star.charAt(i);
		   }

		      if(star.equals(reverse)){
		  
			        System.out.println(star + " is a Palindrome String.");
		    }else {
		           System.out.println(star + " is not a Palindrome String.");
		    }
	}

}
