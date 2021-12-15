import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Assign17Seller {

	public static void main(String[] args) {
		
		
		try {
			
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Assig17", "root", "root");
			Statement stmt = con.createStatement();
	        ResultSet rs = stmt.executeQuery("select ItemName,Price,Quantity,Pro_ID from Product"); 
	        System.out.println("ItemName"+"\t"+"Price"+"\t"+"Quantity"+"\t"+"Pro_ID");
	        while (rs.next()) {
	         System.out.print( rs.getString("itemName")+"\t");//+"\t"+rs.getInt("price")+"\t"+rs.getInt("quantity")+"\t"+rs.getInt("Pro_ID")+"\n"); 
	            System.out.print( rs.getInt("price")+"\t");
	            System.out.print( rs.getInt("quantity")+"\t");
	            System.out.print( rs.getInt("Pro_ID")+"\t" +"\n");
		   }
	         	con.close();
				}catch (SQLException e) {
	         	e.printStackTrace();
	
			} 
	}
}
