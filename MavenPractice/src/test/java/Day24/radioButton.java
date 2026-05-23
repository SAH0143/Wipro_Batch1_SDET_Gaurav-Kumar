package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		
		// Click on Yes radio button
		driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
		
		Thread.sleep(2000);
		
		// Click on Impressive radio button
		driver.findElement(By.xpath("//label[@for='impressiveRadio']")).click();
		
		Thread.sleep(2000);
		
		// Verify selected result
		String result = driver.findElement(By.className("text-success")).getText();
		
		System.out.println("Selected Radio Button: " + result);
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}