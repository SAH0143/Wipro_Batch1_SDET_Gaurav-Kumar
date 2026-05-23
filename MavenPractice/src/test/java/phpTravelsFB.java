import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
public class phpTravelsFB {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://phptravels.net/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/nav/button[3]/span[1]")).click();
		Thread.sleep(4000);
	
		WebElement fromCity = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[3]/div/div/form/div[1]/div[1]/div/div[1]/input"));
		fromCity.click();
		Thread.sleep(2000);

		fromCity.sendKeys("Dubai");
		Thread.sleep(3000);

		fromCity.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);

		fromCity.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		WebElement toCity = driver.findElement(By.xpath("//*[@id=\"arrival_airport_input\"]"));
		toCity.click();
		Thread.sleep(2000);

		toCity.sendKeys("Delhi");
		Thread.sleep(3000);

		toCity.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);

		toCity.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		driver.findElement(By.id("departure")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='day ' and text()='25']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("fadults")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//i[@class='la la-plus'])[1]")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		Thread.sleep(8000);
		
		
		driver.findElement(By.xpath("(//button[contains(text(),'Book Now')])[1]")).click();
		Thread.sleep(8000);
		
		System.out.println("Booking Successful");
		driver.quit();
	}
}
