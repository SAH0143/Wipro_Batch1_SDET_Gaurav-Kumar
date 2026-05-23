package DataDrivenConcept;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogerSele {


	static Logger logger = LogManager.getLogger(LogerSele.class);

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		logger.info("Browser Opened");

		driver.get("https://www.saucedemo.com");

		logger.info("Website Opened");

		driver.findElement(By.id("user-name"))
		.sendKeys("standard_user");

		logger.info("Username Entered");

		driver.findElement(By.id("password"))
		.sendKeys("secret_sauce");

		logger.info("Password Entered");

		driver.findElement(By.id("login-button"))
		.click();

		logger.info("Login Button Clicked");

		driver.quit();

		logger.info("Browser Closed");
	}
}