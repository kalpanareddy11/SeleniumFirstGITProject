package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverSession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
 //System.setproperty("webdriver.gecko.driver","C:\\Users\dkart\\Downloads\\geckodriver-v0.19.0-win64\\geckodriver.exe");
 //WebDriver driver = new FirefoxDriver();
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dkart\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver ();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	

}
