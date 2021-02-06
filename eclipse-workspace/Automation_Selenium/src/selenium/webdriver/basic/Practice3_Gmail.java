package selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Practice3_Gmail {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
	WebDriver driver = new SafariDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/?client=safari");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).click();
	
	
	

	}

}
 