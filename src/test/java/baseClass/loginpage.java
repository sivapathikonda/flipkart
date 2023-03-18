package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	WebDriver rdriver;
	public loginpage(WebDriver ldriver) {
		this.rdriver=ldriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(id="search_query_top")
	WebElement search;
	@FindBy(name="submit_search")
	WebElement submit;
	public void search(String srh) {
		search.sendKeys(srh);
	}
	public void sumbit() {
		submit.click();
	}
	
		
	}
	
	

