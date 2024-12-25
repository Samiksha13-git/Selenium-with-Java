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
import org.openqa.selenium.interactions.Actions;

public class Register {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samiksha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Register.html");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    WebElement N=driver.findElement(By.xpath("//label[normalize-space()='Full Name*']"));
	    Actions a=new Actions(driver);
	    WebElement FN=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	    FN.click();
	    FN.sendKeys("Samiksha");
	    WebElement LN=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	    LN.click();
	    LN.sendKeys("Mehta");
	    WebElement A=driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
	    A.click();
	    A.sendKeys("Muzaffarpur,BIHAR");
	    WebElement E=driver.findElement(By.xpath("//input[@type='email']"));
	    E.click();
	    E.sendKeys("mehtasamiksha1913@gmail.com");
	    WebElement PH=driver.findElement(By.xpath("//input[@type='tel']"));
	    PH.click();
	    PH.sendKeys("9334582882");
	    WebElement G=driver.findElement(By.xpath("//input[@value='FeMale']"));
	    G.click();
	    WebElement H=driver.findElement(By.xpath("//input[@id='checkbox2']"));
	    H.click();
	    WebElement L=driver.findElement(By.xpath("//div[@id='msdd']"));
	    L.click();
	    WebElement LA=driver.findElement(By.xpath("//a[normalize-space()='English']"));
	    a.dragAndDrop(L, LA).perform();
	    LA.click();
	    WebElement HI=driver.findElement(By.xpath("//a[normalize-space()='Hindi']"));
	    a.dragAndDrop(L, HI).perform();
	    HI.click();
	    WebElement S=driver.findElement(By.xpath("//label[normalize-space()='Skills']"));
	    S.click();
	    WebElement SK=driver.findElement(By.xpath("//select[@id='Skills']"));
	    SK.click();
	    WebElement API=driver.findElement(By.xpath("//option[@value=\"APIs\"]"));
	    API.click();
	    WebElement C=driver.findElement(By.xpath("//span[@role='combobox']"));
	    C.click();
	    WebElement CO=driver.findElement(By.xpath("//input[@role='textbox']"));
	    CO.click();
	    CO.sendKeys("India");
	    WebElement IN=driver.findElement(By.xpath("//li[@aria-selected=\"false\"]"));
	    IN.click();
	    WebElement Y=driver.findElement(By.xpath("//select[@id='yearbox']"));
	    Y.click();
	    WebElement YE=driver.findElement(By.xpath("//option[@value=\"2000\"]"));
	    YE.click();
	    WebElement M=driver.findElement(By.xpath("//select[@placeholder='Month']"));
	    M.click();
	    WebElement MO=driver.findElement(By.xpath("//option[@value=\"September\"]"));
	    MO.click();
	    WebElement D=driver.findElement(By.xpath("//select[@id='daybox']"));
	    D.click();
	    WebElement DA=driver.findElement(By.xpath("//option[@value=\"13\"]"));
	    DA.click();
	    WebElement P=driver.findElement(By.xpath("//input[@id='firstpassword']"));
	    P.click();
	    P.sendKeys("Samiksha@13");
	    WebElement CP=driver.findElement(By.xpath("//input[@id='secondpassword']"));
	    CP.click();
	    CP.sendKeys("Samiksha@13");
	    WebElement I=driver.findElement(By.xpath("//input[@id='imagesrc']"));
	    I.sendKeys("C:\\Snapchat\\Snapchat-2140523856.jpg");
	    WebElement SU=driver.findElement(By.xpath("//button[@id='submitbtn']"));
	    SU.click();
	}
	

}
