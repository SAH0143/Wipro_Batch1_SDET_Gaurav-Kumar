package DataDrivenConcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenOfsauceDemo {


	public static void main(String[] args) throws Exception {

		// Database connection details

		String url = "jdbc:mysql://localhost:3306/saucedemo";

		String dbUsername = "root";

		String dbPassword = "root@123";

		// Connect database

		Connection con = DriverManager.getConnection(url, dbUsername, dbPassword);

		System.out.println("Database Connected");

		// Execute query

		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("SELECT * FROM login");

		// Read database rows one by one

		while(rs.next()) {

			String username = rs.getString("username");

			String password = rs.getString("password");

			System.out.println(username);

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			driver.get("https://www.saucedemo.com");


			driver.findElement(By.id("user-name")).sendKeys(username);

			driver.findElement(By.id("password")).sendKeys(password);
			
			driver.findElement(By.id("login-button")).click();

			System.out.println("Login Attempted");

			Thread.sleep(3000);

			driver.quit();
		}

		con.close();
	}
}