package selenium_with_java;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
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
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File src=ts.getScreenshotAs(OutputType.FILE);
	    File d=new File("C:\\Users\\Samiksha\\Downloads\\Screenshot\\S1.png");
	    FileUtils.copyFile(src, d);  
	    
	    l.click();
	    Thread.sleep(5000);
	    File src1=ts.getScreenshotAs(OutputType.FILE);
	    File d1=new File("C:\\Users\\Samiksha\\Downloads\\Screenshot\\S2.png");
	    FileUtils.copyFile(src1, d1);
	    WebElement B=driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Buzz']"));
	    B.click();
	    Thread.sleep(5000);
	    File src2=ts.getScreenshotAs(OutputType.FILE);
	    File d2=new File("C:\\Users\\Samiksha\\Downloads\\Screenshot\\S3.png");
	    FileUtils.copyFile(src2, d2);
	    WebElement BU=driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
	    BU.click();
	    BU.sendKeys("Hello");
	    WebElement PO=driver.findElement(By.xpath("//button[@type='submit']"));
	    PO.click();
	    File src3=ts.getScreenshotAs(OutputType.FILE);
	    File d3=new File("C:\\Users\\Samiksha\\Downloads\\Screenshot\\S4.png");
	    FileUtils.copyFile(src3, d3);

	}

}
