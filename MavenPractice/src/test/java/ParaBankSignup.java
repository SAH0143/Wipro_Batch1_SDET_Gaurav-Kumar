import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBankSignup {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		Thread.sleep(3000);
		
		driver.findElement(By.id("customer.firstName")).sendKeys("Gaurav");
		Thread.sleep(1000);
		
		driver.findElement(By.id("customer.lastName")).sendKeys("Kumar");
		Thread.sleep(1000);
		
		driver.findElement(By.id("customer.address.street")).sendKeys("Ac-777, Sec-5");
		Thread.sleep(1000);
		
		driver.findElement(By.id("customer.address.city")).sendKeys("Kolkata");
		Thread.sleep(1000);
		
		driver.findElement(By.id("customer.address.state")).sendKeys("West Bengal");
		Thread.sleep(1000);
		
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("700102");
		Thread.sleep(1000);
		
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("9534442420");
		Thread.sleep(1000);
		
		driver.findElement(By.id("customer.ssn")).sendKeys("0007");
		Thread.sleep(1000);
		
		driver.findElement(By.id("customer.username")).sendKeys("krgaurav");
		Thread.sleep(1000);
		
		driver.findElement(By.id("customer.password")).sendKeys("G@urav55!=");
		Thread.sleep(1000);
		
		driver.findElement(By.id("repeatedPassword")).sendKeys("G@urav55!=");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value = 'Register']")).click();

		Thread.sleep(5000);
		System.out.println(driver.getTitle());

		driver.quit();
	}
}
