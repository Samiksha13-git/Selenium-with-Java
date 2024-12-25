package selenium_with_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class class_4_dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samiksha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://uncodemy.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        WebElement un=driver.findElement(By.xpath("//span[@id='categoriesBtn']"));
        Actions a=new Actions(driver);
        a.moveToElement(un).perform();
        WebElement FS=driver.findElement(By.xpath("//a[normalize-space()='Full-Stack-Development']"));
	    a.moveToElement(FS).perform();
	    WebElement FSd=driver.findElement(By.xpath("//a[normalize-space()='Full Stack With NodeJs']"));
        FSd.click();
        Thread.sleep(2000);
        driver.navigate().back();
        WebElement Ds=driver.findElement(By.xpath("//body/nav[@id='main-nav']/div[@class='nav-container']/div[@class='categories']/nav[@class='navr']/menu[@id='categories-menu']/menuitem[@label='drop']/menu[@class='hii']/menuitem[2]/a[1]"));
	    a.moveToElement(Ds).perform();
	    WebElement ML=driver.findElement(By.xpath("//a[@class='has'][contains(text(),'Data Science')]"));
	    ML.click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    WebElement ST=driver.findElement(By.xpath("//body/nav[@id='main-nav']/div[@class='nav-container']/div[@class='categories']/nav[@class='navr']/menu[@id='categories-menu']/menuitem[@label='drop']/menu[@class='hii']/menuitem[3]/a[1]"));
	    a.moveToElement(ST).perform();
	    WebElement MS=driver.findElement(By.xpath("//a[normalize-space()='Manual + Selenium']"));
	    MS.click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    WebElement CT=driver.findElement(By.xpath("//a[normalize-space()='Cloud Tools']"));
	    a.moveToElement(CT).perform();
	    WebElement DevO=driver.findElement(By.xpath("//a[normalize-space()='DevOps']"));
        DevO.click();
        Thread.sleep(2000);
        driver.navigate().back();
        WebElement DM=driver.findElement(By.xpath("//body/nav[@id='main-nav']/div[@class='nav-container']/div[@class='categories']/nav[@class='navr']/menu[@id='categories-menu']/menuitem[@label='drop']/menu[@class='hii']/menuitem[5]/a[1]"));
	    a.moveToElement(DM).perform();
	    WebElement ADM=driver.findElement(By.xpath("//a[contains(text(),'AdvanceDigital')]"));
	    ADM.click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    WebElement JT=driver.findElement(By.xpath("//a[normalize-space()='Java Technology+']"));
	    a.moveToElement(JT).perform();
	    WebElement J=driver.findElement(By.xpath("//a[@class='has'][normalize-space()='Java']"));
        J.click();
        Thread.sleep(2000);
        driver.navigate().back();
        WebElement NS=driver.findElement(By.xpath("//a[normalize-space()='Network & Security']"));
	    a.moveToElement(NS).perform();
	    WebElement EH=driver.findElement(By.xpath("//a[normalize-space()='Ethical Hacking']"));
	    EH.click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    WebElement PL=driver.findElement(By.xpath("//a[normalize-space()='Programming Language']"));
	    a.moveToElement(PL).perform();
	    WebElement DSA=driver.findElement(By.xpath("//a[contains(text(),'CWith')]"));
	    DSA.click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    WebElement CAD=driver.findElement(By.xpath("//a[normalize-space()='CAD Training']"));
	    a.moveToElement(CAD).perform();
	    WebElement CNC=driver.findElement(By.xpath("//a[normalize-space()='CNC Programming']"));
	    CNC.click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    WebElement GT=driver.findElement(By.xpath("//body/nav[@id='main-nav']/div[@class='nav-container']/div[@class='categories']/nav[@class='navr']/menu[@id='categories-menu']/menuitem[@label='drop']/menu[@class='hii']/menuitem[10]/a[1]"));
	    a.moveToElement(GT).perform();
	    WebElement GD=driver.findElement(By.xpath("//a[@class='has'][normalize-space()='Graphic Designing']"));
	    GD.click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    WebElement UI=driver.findElement(By.xpath("//a[normalize-space()='UI/UX Designing']"));
	    UI.click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    
	}

}
