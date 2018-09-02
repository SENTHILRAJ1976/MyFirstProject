package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class FindLead extends ProjectMethods{

		public FindLead clickphnumber() throws InterruptedException {
		WebElement elephone = locateElement("xpath", "//span[()='Phone']");
		click(elephone);
		Thread.sleep(2000);
		return this;
	}
	public FindLead typephnumber(String data) {
		WebElement eleUserName = locateElement("xpath", "//input[@name='phoneNumber']");
		type(eleUserName, data);
		return this;
	}
	
	public FindLead clickfindlead() throws InterruptedException {
		WebElement eleUserName = locateElement("xpath", "//button[text()='Find Leads']");
		click(eleUserName);
		Thread.sleep(2000);
		return this;
	}
	public FindLead selectfirstreport() throws InterruptedException {
		WebElement elefirst = locateElement("xpath", "(//a[@class=\"linktext\"])[4]");
		click(elefirst);
		Thread.sleep(2000);
		return this;
	
}
}








