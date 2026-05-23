package DataDrivenConcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportineOfSauceTest {



	public static void main(String[] args) throws Exception {

		// Create HTML Report

		ExtentSparkReporter reporter =
		new ExtentSparkReporter("SauceDemoTestReport.html");

		ExtentReports extent = new ExtentReports();

		extent.attachReporter(reporter);

		// Database connection details

		String url = "jdbc:mysql://localhost:3306/saucedemo";

		String dbUsername = "root";

		String dbPassword = "root@123";

		// Connect database

		Connection con =
		DriverManager.getConnection(url, dbUsername, dbPassword);

		System.out.println("Database Connected");

		// Execute query

		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("SELECT * FROM login");

		// Read database rows one by one

		while(rs.next()) {

			String username = rs.getString("username");

			String password = rs.getString("password");

			// Create Test in Report

			ExtentTest test =
			extent.createTest("Login Test : " + username);

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts()
			.implicitlyWait(Duration.ofSeconds(10));

			test.pass("Browser Opened");

			driver.get("https://www.saucedemo.com");

			test.pass("Website Opened");

			// Enter Username

			driver.findElement(By.id("user-name"))
			.sendKeys(username);

			test.pass("Username Entered");

			// Enter Password

			driver.findElement(By.id("password"))
			.sendKeys(password);

			test.pass("Password Entered");

			// Click Login

			driver.findElement(By.id("login-button"))
			.click();

			test.pass("Login Button Clicked");

			Thread.sleep(3000);

			// Validation

			String currentURL = driver.getCurrentUrl();

			if(currentURL.contains("inventory")) {

				test.pass("Login Successful");

				System.out.println("Login Passed");

			}

			else {

				test.fail("Login Failed");

				System.out.println("Login Failed");
			}

			driver.quit();

			test.pass("Browser Closed");
		}

		// Close database connection

		con.close();

		// Generate report

		extent.flush();

		System.out.println("Report Generated Successfully");
	}
}