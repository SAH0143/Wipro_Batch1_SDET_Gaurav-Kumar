import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLoginSearchAddTest {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		Thread.sleep(3000);

		driver.findElement(By.id("nav-link-accountList")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("ap_email_login")).sendKeys("policeking0420@gmail.com");

		Thread.sleep(2000);

		driver.findElement(By.id("continue")).click();


		Thread.sleep(5000);

		driver.findElement(By.id("ap_password")).sendKeys("2?dcWR2h4Fb&x7d");

		Thread.sleep(2000);

		driver.findElement(By.id("signInSubmit")).click();

		Thread.sleep(5000);
		
		// search & add to cart
		
	
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Fogg Marco No Gas Deodorant for Men");

		Thread.sleep(2000);


		driver.findElement(By.id("nav-search-submit-button")).click();

		Thread.sleep(5000);


//		driver.findElement(By.xpath("https://amzn.in/d/039uXdVG")).click();
		
		driver.get("https://amzn.in/d/04ortecu");

		Thread.sleep(5000);
		
		

		System.out.println(driver.getTitle());

		driver.quit();
	}
}
