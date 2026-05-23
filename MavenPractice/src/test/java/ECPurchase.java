import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ECPurchase {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");

		Thread.sleep(3000);

		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		Thread.sleep(1000);

		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		Thread.sleep(1000);

		driver.findElement(By.id("login-button")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();

		Thread.sleep(4000);

		driver.findElement(By.id("add-to-cart")).click();

		Thread.sleep(3000);

		driver.findElement(By.className("shopping_cart_link")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("checkout")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("first-name")).sendKeys("Gaurav");

		Thread.sleep(1000);

		driver.findElement(By.id("last-name")).sendKeys("Kumar");

		Thread.sleep(1000);

		driver.findElement(By.id("postal-code")).sendKeys("700102");

		Thread.sleep(1000);

		driver.findElement(By.id("continue")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("finish")).click();

		Thread.sleep(3000);

		String confirmationMessage = driver.findElement(By.className("complete-header")).getText();

		System.out.println("Order Confirmation : " + confirmationMessage);

		driver.quit();
	}
}