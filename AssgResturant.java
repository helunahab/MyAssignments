

abstract class Resturant{
	void printName(String name) {
		System.out.println(" Resturant" + name);
	}
	abstract double actualPrice(double price, double tax );
	abstract  String Menu (String list);
}
class McDonald extends Resturant{

	@Override
	double actualPrice(double price, double tax) {
		double actualPrice = price + price*(tax/100);
		return actualPrice;
	}

	@Override
	String Menu(String list) {
		
		return list;
	}
	
}
class KFC extends Resturant{

	@Override
	double actualPrice(double price, double tax) {
		double actualPrice = price + price*(tax/100);
		return actualPrice;
	}

	@Override
	String Menu(String list) {
		// TODO Auto-generated method stub
		return list;
	}
	
}

public class AssgResturant {

	public static void main(String[] args) {
		System.out.println("Name:" + "Habesha Resturant");
		McDonald mac = new McDonald();
		System.out.println(mac.actualPrice(4, 6));
		System.out.println(mac.Menu("Sandwich"));
		KFC K = new KFC();
		System.out.println(mac.actualPrice(45, 6));
		System.out.println(mac.Menu("chicken"));
		
		
	}

}
