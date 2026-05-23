package DataDrivenConcept;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ReportingPractice {


	public static void main(String[] args) {

		// Report path

		ExtentSparkReporter reporter = new ExtentSparkReporter("ExtentReport.html");

		// Main report object

		ExtentReports extent = new ExtentReports();

		extent.attachReporter(reporter);

		// Create test

		ExtentTest test = extent.createTest("Login Test");

		// Log status

		test.pass("Website Opened");

		test.pass("Username Entered");

		test.pass("Password Entered");

		test.pass("Login Successful");

		// Generate report

		extent.flush();

		System.out.println("Report Generated");
	}
}