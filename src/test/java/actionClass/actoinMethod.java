package actionClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.accountpage;
import baseClass.contactus;
import baseClass.loginpage;

public class actoinMethod {
WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\chromedriver_win32(1)\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	@AfterMethod
	public void destory()
	{
		driver.quit();
	}
	
	public void captureScreenshot(WebDriver driver, String tname)   {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir") + "\\Screenshot\\" + tname + ".png");
	    try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
}
	
	
	//@Test
	public void actoinMethods() {
		driver.get("https://Automationpractice.com/index.php");	
		loginpage logs=new loginpage(driver);
		logs.search("women");
		logs.sumbit();
	
}//
	//@Test
	public void actionaccount() {
		driver.get("https://Automationpractice.com/index.php");	
		accountpage account=new accountpage(driver);
		account.click();
		account.enter("siva85744@gmail.com");
		account.click();
		account.name("siva");
		account.lastName("kumar");
		
		String ActualTitle=driver.getTitle();
		String exceptedTitle="https://Automationpractice.com";
		//Assert.assertEquals(ActualTitle, exceptedTitle);
		if(ActualTitle.equals(exceptedTitle))
		{
			Assert.assertTrue(true);
		}else
		{
			
			captureScreenshot(driver,"loginTestWithVaildCredentials");
			Assert.assertTrue(false);
		}
	}//
	@Test
	
	public void customer() {
		driver.get("https://Automationpractice.com/index.php");	
	contactus cus=new contactus(driver);
		cus.click1();
		 WebElement testDropdown=driver.findElement(By.id("id_contact"));
		 Select slv=new Select(testDropdown);
		 slv.selectByVisibleText("Customer service");
		 cus.enter("siva85744@gmail.com");
		 cus.enter1("ganesh");
	}


	

	
}

