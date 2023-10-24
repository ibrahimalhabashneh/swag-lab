import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class parameters {
	static String Url = "https://www.saucedemo.com/";
	static String StandardUserName = "standard_user";
	static String ProblemUserName = "problem_user";

	static String PerformanceUserName = "performance_glitch_user";

	static String password = "secret_sauce";

	static WebDriver driver = new ChromeDriver();
	
	static void LoginFuncation(String UserName,String password) {
		WebElement userNameInputField = driver.findElement(By.id("user-name"));
        userNameInputField.sendKeys(UserName);
        WebElement passInputField = driver.findElement(By.id("password"));
        passInputField.sendKeys(password);
        WebElement logInputField = driver.findElement(By.id("login-button"));
        logInputField.click();

	}

}
