package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchFb {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get(("https://www.facebook.com/login"));
		driver.manage().window().maximize();
		
		Thread.sleep(2000); // command to slow down execution
		
		driver.close();
		//EdgeDriver driver = new EdgeDriver();
		//driver.get("https://www.facebook.com/login");
		//driver.manage().window().maximize();
		//driver.close();
	}

}
