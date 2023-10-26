package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program3 {
	@Test
	public static void demo1() throws InterruptedException {
		System.out.println("This is demo3 method");
		System.out.println("This is demo3 method");
		System.out.println("This is demo3 method");
		System.out.println("This is demo3 method");
		System.out.println("This is demo3 method");
		System.out.println("This is demo3 method");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(10000);
		driver.get("https://www.flipkart.com/");
		
	}
	
}
