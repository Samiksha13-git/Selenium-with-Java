package selenium_with_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class_3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samiksha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(2000);
	    driver .manage().window().maximize();
	    WebElement un=driver.findElement(By.xpath("//input[@name=\"username\"]"));
	    un.sendKeys("Admin");
	    WebElement pw=driver.findElement(By.xpath("//input[@type=\"password\"]"));
	    pw.sendKeys("admin123");
	    WebElement l=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	    l.click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    Thread.sleep(2000);
	    driver.navigate().forward();
	    Thread.sleep(2000);
	    driver.navigate().refresh();
	    

	}

}