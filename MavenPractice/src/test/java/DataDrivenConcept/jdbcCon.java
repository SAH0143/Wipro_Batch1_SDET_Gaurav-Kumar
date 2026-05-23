package DataDrivenConcept;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcCon {


	public static void main(String[] args) throws Exception {

		// Database URL
		String url = "jdbc:mysql://localhost:3306/company";

		// Database username
		String username = "root";

		// Database password
		String password = "root@123";

		// Create connection
		Connection con =
		DriverManager.getConnection(url, username, password);

		System.out.println("Database Connected");

		// Create statement
		Statement stmt = con.createStatement();

		// Execute query
		ResultSet rs =
		stmt.executeQuery("SELECT * FROM employee");

		// Read data
		while(rs.next()) {

			System.out.println("ID : " + rs.getInt("id"));

			System.out.println("Name : " + rs.getString("name"));

			System.out.println("Email : " + rs.getString("email"));

			System.out.println("----------------------");
		}

		// Close connection
		con.close();
	}
}