import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class EcommerceloginPuches {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div/div/header/div[2]/div[2]/div/div/div/div/a/span")).sendKeys("9534442420");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(text(),'Request OTP')]")).click();

		Thread.sleep(5000);

		driver.findElement(By.name("q")).sendKeys("casio watches men");

		Thread.sleep(2000);

		driver.findElement(By.xpath("")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("(//div[contains(text(),)])[1]")).click();

		Thread.sleep(5000);

		for (String win : driver.getWindowHandles()) {
			driver.switchTo().window(win);
		}

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();

		Thread.sleep(5000);

		WebElement orderText = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));

		System.out.println("Order Process Validation : " + orderText.getText());

		driver.quit();
	}
}