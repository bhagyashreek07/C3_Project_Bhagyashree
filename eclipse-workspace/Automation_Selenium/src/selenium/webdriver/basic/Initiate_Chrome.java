package selenium.webdriver.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initiate_Chrome {
	
	public static void InititateChrome () {
		
		System.setProperty("webdriver.chrome.driver", "/Users/bhagyashreekulkarni/eclipse-workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
	}

	public static void main(String[] args) {
		InititateChrome(); 
		

	}

}
