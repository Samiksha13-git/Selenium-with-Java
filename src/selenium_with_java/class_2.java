package selenium_with_java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samiksha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Alerts.html");
        Thread.sleep(2000);
        WebElement a=driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]"));
        a.click();
        Alert b=driver.switchTo().alert();
        b.accept();
        WebElement d=driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"));
	    d.click();
	    WebElement c=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	    c.click();
	    Alert s=driver.switchTo().alert();
	    s.dismiss();
	    WebElement t=driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']"));
	    t.click();
	    WebElement p=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	    p.click();
	    Alert n=driver.switchTo().alert();
	    n.sendKeys("Samiksha Mehta");
	    n.accept();
	}

}
