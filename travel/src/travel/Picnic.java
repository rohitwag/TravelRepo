package travel;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Picnic {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {


		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.airindia.in/");
		
		//WebElement manage=driver.findElement(By.xpath("(//a[text()='Manage'])[2]"));
		//WebElement timetable=driver.findElement(By.xpath("(//a[text()='Flight Timetable'])[2]"));
		
		//Actions act = new Actions (driver);
		
		//act.moveToElement(manage).perform();
		//Thread.sleep(3000);
		
		//act.moveToElement(timetable).perform();
		//Thread.sleep(3000);
		
		//act.click().perform();
		
		//driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		//driver.manage().window().maximize();
		
		//Thread.sleep(3000);
		
		//WebElement source=driver.findElement(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));
		//WebElement target=driver.findElement(By.xpath("//*[@id=\"trash\"]"));
		
		//Actions act = new Actions (driver);
		
		//act.dragAndDrop(source, target).build().perform();
		
		
		//driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		//WebElement s=driver.findElement(By.xpath("//*[@id=\"pageBody\"]/div[1]/form/div[3]/div/div/div[2]/div[2]/div[2]/div[2]/a"));
		//s.click();
		
		
		//Thread.sleep(3000);
		
		//Alert alt = driver.switchTo().alert();
		
	    //String text = alt.getText();
	    
	    //System.out.println(text);
	    //alt.accept();
	    
		
	    //child pop up
		
		//driver.get("https://www.walmart.com/");
		
		//Thread.sleep(3000);
		
		//WebElement twitter=driver.findElement(By.xpath("(//a[@link-identifier='Sell on Walmart.com']"));
		//twitter.click();
		
		//ArrayList<String>add= new ArrayList <String>(driver.getWindowHandles());
		
		//driver.switchTo().window(add.get(1));
		
		//Scroll up and down
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy (0,3000)");
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		
		
		
		
	    
	    
		
		
		
		
		
		
		
		
		

	}

	
}
