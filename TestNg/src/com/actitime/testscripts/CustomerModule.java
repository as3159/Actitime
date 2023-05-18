package com.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskPage;

@Listeners(com.actitime.generic.ListenersImplementation.class)
public class CustomerModule extends BaseClass {
	@Test
	public void testcreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileLib f=new FileLib();
		String custname= f.getExcelData("CreateCustomer", 1, 2);
		String desc=f.getExcelData("CreateCustomer", 1, 3);
		HomePage h=new HomePage(driver); 
		h.setTaskPage();
		TaskPage t= new TaskPage(driver);
		t.getAddnew().click();
		t.getCreatenewcustomer().click();
		t.getCustomername().sendKeys(custname);
		t.getCustomerdesc().sendKeys(desc);
		t.getSelectcustomerlistbox().click();
		t.getOurcompany().click();
		t.getCreatecustomerbtn().click();
		Thread.sleep(4000);
		String acttitle = t.getActtitle().getText();
		Assert.assertEquals(acttitle, custname);
	}

}
