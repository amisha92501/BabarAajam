package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
		
		System.out.println("Thread sleep removed");

		System.out.println("Thread sleep removed");

		System.out.println("Thread sleep removed");
		
		System.out.println("Gupta");

		System.out.println("Gupta");

		System.out.println("Gupta");
		System.out.println("Changes");
		//Thread.sleep(10000);

		driver.get("https://www.selenium.dev/");
		//Assert.fail();
		driver.get("https://www.flipkart.com/");
		
	}
	
}
