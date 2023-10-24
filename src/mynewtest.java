import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class mynewtest extends parameters {
	

	
	@BeforeMethod
	public void mySetup() {
		driver.get(Url);
	}

	@Test()
	public void LoginWithStandardUSer() throws InterruptedException {


		LoginFuncation(StandardUserName,password);

		Thread.sleep(3000);

	}

	@Test()
	public void LoginWithProblemUser() throws InterruptedException {
		
		
		LoginFuncation(ProblemUserName,password);
	
		Thread.sleep(3000);


	}

	@Test()
	public void LoginWithPerformanceUser() throws InterruptedException {
		
		LoginFuncation(PerformanceUserName,password);


		Thread.sleep(3000);


	}
	
	
	
	@AfterTest
	public void myPostTesting(){
	}
	
	
	
}
