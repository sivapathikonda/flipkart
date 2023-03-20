package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class accountpage {
	WebDriver rdriver;
	public accountpage (WebDriver ldriver) {
		this.rdriver=ldriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//a[@class=\"login\"]")  
	WebElement login;
	@FindBy(id="email_create")
	WebElement enter;
	@FindBy(xpath="//button[@class=\"btn btn-default button button-medium exclusive\"]")
	WebElement create;
	@FindBy(xpath="//div[@class=\"radio\"]")
	WebElement send;
	@FindBy(name="customer_firstname")
	WebElement name;
	@FindBy(name="customer_lastname")
	WebElement lastName;
	public void click() {
		login.click();
	}

	public void enter(String elememt) {
		enter.sendKeys(elememt);
	}
	public void create() {
		create.click();
	}
public void click1() {
		send.click();
	}
public void name(String siva) {
	name.sendKeys(siva);
}
public void lastName(String kumar) {
	lastName.sendKeys(kumar);
}
}
    
    
    
