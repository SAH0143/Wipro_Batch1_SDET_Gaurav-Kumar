package Day24;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class webTable {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		// Click Add button
		driver.findElement(By.id("addNewRecordButton")).click();
		Thread.sleep(2000);
		// Fill registration form
		driver.findElement(By.id("firstName")).sendKeys("Gaurav");
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("Kumar");
		Thread.sleep(2000);
		driver.findElement(By.id("userEmail")).sendKeys("gaurav@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("age")).sendKeys("23");
		Thread.sleep(2000);
		driver.findElement(By.id("salary")).sendKeys("50000");
		Thread.sleep(2000);
		driver.findElement(By.id("department")).sendKeys("Testing");
		Thread.sleep(2000);
		// Click Submit button
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		// Search entered record
		driver.findElement(By.id("searchBox")).sendKeys("Gaurav");
		Thread.sleep(3000);
		// Edit record
		driver.findElement(By.id("edit-record-4")).click();
		Thread.sleep(2000);
		// Clear and update salary
		driver.findElement(By.id("salary")).clear();
		driver.findElement(By.id("salary")).sendKeys("70000");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		// Delete record
		driver.findElement(By.id("delete-record-4")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}