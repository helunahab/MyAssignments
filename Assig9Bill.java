
import java.util.Scanner;

interface Assg9Bill {
	double calcBill(int Energyused ,int unitprice);
	void printBill(double amount);
}
    class PowerBill implements Assg9Bill{
		@Override
		public double calcBill(int Energyused ,int unitprice) {
			
			return (Energyused*unitprice);
		}

		@Override
		public void printBill(double amount) {
			
			
		}
    	
    }

	class WaterBill implements Assg9Bill{

		@Override
		public double calcBill(int waterused, int pricepergallon) {
			// TODO Auto-generated method stub
			return (waterused*pricepergallon);
	}

		@Override
		public void printBill(double amount) {
			// TODO Auto-generated method stub
			
		}
		
	}
		
		
public class Assig9Bill {

	public void printBill(double amount) {
		
	}
	
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner scr = new Scanner (System.in);
	
	PowerBill p = new PowerBill();
	
	System.out.println("Enter Energyused in KWH");
	int Energyused = scr.nextInt();
	System.out.println("Enter unit price in hours");
	int unitprice = scr.nextInt();
	System.out.println("PowerBill will be:"+ (Energyused*unitprice) +" dollar"+"\n");
		
	WaterBill w = new WaterBill();
	
	System.out.println("To calculate water bill"+"\n" + "Enter gallons of water used");
	int waterused = scr.nextInt();
	System.out.println("price of water");
	int priceofwaterperGallon = scr.nextInt();
	System.out.println("WaterBill will be:"+ (waterused * priceofwaterperGallon) +" dollar");
	int c = scr.nextInt();
	
	
		
	}

}
