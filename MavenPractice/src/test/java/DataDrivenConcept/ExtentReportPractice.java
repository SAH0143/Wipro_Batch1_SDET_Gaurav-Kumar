package DataDrivenConcept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportPractice {


	public static void main(String[] args) throws IOException {

		// Launch Browser

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com");

		// Report path

		ExtentSparkReporter reporter = new ExtentSparkReporter("ExtentReportWithSs.html");

		// Main report object

		ExtentReports extent = new ExtentReports();

		extent.attachReporter(reporter);

		// Create test

		ExtentTest test = extent.createTest("Login Test");

		// Log status

		test.pass("Website Opened");

		// Take Screenshot

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File destination = new File("test-output/screenshot.png");

		FileUtils.copyFile(source, destination);

		// Attach Screenshot in Report

		test.addScreenCaptureFromPath("screenshot.png");

		test.pass("Screenshot Captured");

		test.pass("Login Successful");

		// Generate report

		extent.flush();

		System.out.println("Report Generated");

		driver.quit();
	}
}