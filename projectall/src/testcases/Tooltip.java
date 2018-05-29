package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\extra\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/howto/howto_css_tooltip.asp");
		String tooltip1=driver.findElement(By.linkText("HTML")).getAttribute("title");
		System.out.println(tooltip1);
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr,new File("F://gopiscreen1.jpg"));
	    String tooltip2=driver.findElement(By.linkText("CSS")).getAttribute("title");
	    System.out.println(tooltip2);
	    FileUtils.copyFile(scr,new File("F://gopiscreen2.jpg"));
		String tooltip3=driver.findElement(By.linkText("JAVASCRIPT")).getAttribute("title");
		System.out.println(tooltip3);
		FileUtils.copyFile(scr,new File("F://gopiscreen3.jpg"));
		

	}

}
