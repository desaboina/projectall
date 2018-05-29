package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\extra\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://apps.qaplanet.in/qahrm");
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		driver.findElement(By.name("Submit")).click();
		List<WebElement>list=driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		for(int i=0;i<=list.size();i++)
		{
			String text=list.get(i).getText();
			System.out.println(text);
			if(text.equals("Logout"))
			{
				list.get(i).click();
				break;
			}
	}

	}
}
