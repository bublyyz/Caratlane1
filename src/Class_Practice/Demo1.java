package Class_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	
	static{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.get("file:///E:/TYSS_SELENIUM/WebPages/Demo1.html");
		
		driver.findElement(By.xpath("./html/body/input[2]")).sendKeys("qsp");
		driver.findElement(By.xpath("./html/body/input[1]")).sendKeys("jsp");
		driver.findElement(By.xpath("./html/body/input")).sendKeys("ider");
	}

}
