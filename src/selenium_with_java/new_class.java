package selenium_with_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class new_class {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samiksha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(5000);
	    driver .manage().window().maximize();
	    WebElement un=driver.findElement(By.xpath("//input[@name=\"username\"]"));
	    un.sendKeys("Admin");
	    WebElement pw=driver.findElement(By.xpath("//input[@type=\"password\"]"));
	    pw.sendKeys("admin123");
	    WebElement l=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	    if(l.isEnabled()) {
	    l.click();
	    }
	    Thread.sleep(2000);
	    WebElement M=driver.findElement(By.xpath("//span[normalize-space()='My Info']"));
	    M.click();
	    Thread.sleep(2000);
	    WebElement G=driver.findElement(By.xpath("//label[normalize-space()='Female']//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input']"));
	    if(G.isSelected()) {
	    System.out.println("Female is selected");
	    }
	    else {
	    	G.click();
	    }
	}

}
