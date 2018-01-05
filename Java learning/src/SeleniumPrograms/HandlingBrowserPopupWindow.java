package SeleniumPrograms;

import java.util.Iterator;
import java.util.Set;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrowserPopupWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\dkart\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td/font/b/a[2]")).click();
		
		Set<String> handler = driver.getWindowHandles();
		
              Iterator<String> it  = handler.iterator();
              
              String parentWindowId = it.next();
              System.out.println("Parent windowId:"+ parentWindowId);
              
              String childWindowId = it.next();
              System.out.println("child windowId:"+ childWindowId);
              
              driver.switchTo().window(childWindowId);
              
              Thread.sleep(2000);
              
              System.out.println("ChildWindow Popup title:"+driver.getTitle());
              
              driver.close();
              
              driver.switchTo().window(parentWindowId);
              
              Thread.sleep(2000);
              
              System.out.println("Parentwindow popup title:"+driver.getTitle());
              
                  
              
	}

}
