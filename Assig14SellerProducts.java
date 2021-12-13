

import java.util.HashSet;

class product{
	private int id;
	private String itemname;
	private double itemprice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public double getItemprice() {
		return itemprice;
	}
	public void setItemprice(double itemprice) {
		this.itemprice = itemprice;
	} 
}

 interface ISellerDAO {
	 void addProductsWithHashSet(product product);
}
 
class CustomerDAO implements ISellerDAO{
	 HashSet prohash = new HashSet();
			
	 @Override
		public void addProductsWithHashSet(product product) {
		prohash.add(prohash);
		System.out.println(prohash);
	}
	
}


public class Assig14SellerProducts {
	

	public static void main(String[] args) {
				ISellerDAO seller = new CustomerDAO();
				product product = new product();
				//Product product = new Product();
				product.setId(1);
				product.setItemname("coffee");
				product.setItemprice(10.00);
			   seller.addProductsWithHashSet(product);
			   System.out.println("product");
			   System.out.println(product.getId()+"\t"+product.getItemname()+"\t"+product.getItemprice());
		 
			}
}

		
