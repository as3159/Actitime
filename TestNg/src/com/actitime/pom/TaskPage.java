package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnew; 
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement createnewcustomer;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customername;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerdesc;
	
	@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
	private WebElement selectcustomerlistbox;
	
	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourcompany;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createcustomerbtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement acttitle;
	
	public TaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddnew() {
		return addnew;
	}

	public WebElement getCreatenewcustomer() {
		return createnewcustomer;
	}

	public WebElement getCustomername() {
		return customername;
	}

	public WebElement getCustomerdesc() {
		return customerdesc;
	}

	public WebElement getSelectcustomerlistbox() {
		return selectcustomerlistbox;
	}

	public WebElement getOurcompany() {
		return ourcompany;
	}

	public WebElement getCreatecustomerbtn() {
		return createcustomerbtn;
	}

	public WebElement getActtitle() {
		return acttitle;
	}
	

}
