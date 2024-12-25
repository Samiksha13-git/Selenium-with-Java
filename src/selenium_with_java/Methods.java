package selenium_with_java;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samiksha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    WebElement I=driver.findElement(By.xpath("//a[@title='Take a look at Instagram']"));
	    I.click();
	    System.out.println(driver.getWindowHandle());
	    System.out.println(driver.getWindowHandles());
	    String PW=driver.getWindowHandle();
	    Set<String> AW=driver.getWindowHandles();
	    for(String c:AW) {
	    	
	    	if(!(PW.equals(c))) {
	    		driver.switchTo().window(c);
	    	}
	    }
	    
	    
	    
	    
	    WebElement E=driver.findElement(By.xpath("//input[@aria-required=\"true\"]"));
	    E.sendKeys("6899004567");
	    WebElement P=driver.findElement(By.xpath("//input[@type=\"password\"]"));
	    P.sendKeys("Hello@11");
	}

}
