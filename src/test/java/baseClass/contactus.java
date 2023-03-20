package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactus {
	WebDriver rdriver;
	public contactus (WebDriver ldriver) {
		this.rdriver=ldriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//a[@href=\"http://automationpractice.com/index.php?controller=contact\"]")
	WebElement find;
	
	
	@FindBy(id="email")
	WebElement mail;
	@FindBy(name="id_order")
	WebElement order;
	
	public void click1() {
		find.click();}
		
		public void enter(String element) {
			mail.sendKeys(element);
		}
		public void enter1(String element)
		{
			order.sendKeys(element);
		}
	
}

	
	

		 
	 
	 
	 
	

