package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Testcase_1 {

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","D:\\extra\\chromedriver.exe");
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
	ChromeDriver driver=new ChromeDriver(cap);
	driver.manage().window().maximize();
	driver.get("http://apps.qaplanet.in/qahrm");
	String str=driver.getTitle();
	System.out.println(str);
	if(str.equals("OrangeHRM - New Level of HR Management"))
	{
		System.out.println("title is true");
	}
	else
	{
		System.out.println("title is not true");
	}
	driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	driver.findElement(By.name("txtPassword")).sendKeys("lab1");
	driver.findElement(By.name("Submit")).click();
   String str1=driver.getTitle();
   System.out.println(str1);
   if(str.equals("OrangeHRM - New Level of HR Management"))
	{
		System.out.println("title is true");
	}
	else
	{
		System.out.println("title is not true");
	}
    driver.findElement(By.linkText("Logout")).click();
	
	}
}

