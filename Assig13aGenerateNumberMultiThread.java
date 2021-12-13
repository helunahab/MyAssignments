import java.util.Random;
import java.util.Scanner;


class RandomInteger extends Thread{
	@Override
	public void run() {
		Random random = new Random();  
		for(int i = 0; i<2; i++){
		   int randomInteger = random.nextInt(20);
		    System.out.println(randomInteger);
		    if((randomInteger % 2)==0){
			Thread even = new Thread (new EvenInteger(randomInteger));
			 even.start();
		}else {
			OddInteger odd = new OddInteger(randomInteger);
			odd.start();
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}	
}
}
class EvenInteger implements Runnable {
	 int randomInteger;
	 EvenInteger(int n){
		  randomInteger=n;
	 }
	@Override
	public void run() {
		int Sqr = randomInteger*randomInteger;
		System.out.println("The Square of  this even number is:" + Sqr);
		
	}
	
}

class OddInteger extends Thread{
	int randomInteger;
	 OddInteger(int n){
	  randomInteger=n;
	 }
	@Override
	public void run() {
		int cub = randomInteger*randomInteger*randomInteger;
			System.out.println("The Cub of this odd number is:" +  cub);
				
		
			
	}	
}

public class Assig13aGenerateNumberMultiThread {

	public static void main(String[] args) {
		
		RandomInteger y = new RandomInteger();
		 y.start();
		 
	}

}
