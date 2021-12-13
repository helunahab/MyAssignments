import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assign17Seller {

	public static void main(String[] args) {
		try {
			
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Assig17ecommdb", "root", "root");
			Statement stmt = con.createStatement();
	         ResultSet rs = stmt.executeQuery(("select ItemName,Price,Quantity,User_Id from Product")); 
	         
	         while (rs.next()) {
	            
	            System.out.print("ItemName: " + rs.getString("itemName"));
	            System.out.print(", Price: " + rs.getInt("price"));
	            System.out.print(", Quantity: " + rs.getInt("quantity"));
	            System.out.println("User_Id: " + rs.getString("userid"));
	          }
	       
			}catch (SQLException e) {
	         	e.printStackTrace();
	      } 
	}
}
