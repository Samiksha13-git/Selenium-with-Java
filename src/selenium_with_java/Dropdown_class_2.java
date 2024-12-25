package selenium_with_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdown_class_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samiksha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        WebElement F=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
        driver.switchTo().frame(F);
        WebElement un=driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
        Actions a=new Actions(driver);
        WebElement T=driver.findElement(By.xpath("//div[@id='trash']"));
        a.dragAndDrop(un, T).perform();
        WebElement PH=driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
        a.dragAndDrop(PH, T).perform();
        WebElement PHO=driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	    a.dragAndDrop(PHO, T).perform();
	    WebElement PHOTO=driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
	    a.dragAndDrop(PHOTO, T).perform();
	}

}
