package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class viewlead extends ProjectMethods{

		public viewlead ecitbutton() throws InterruptedException {
		WebElement eleedit = locateElement("xpath", "(//a[@class='subMenuButton'])[3]");
		click(eleedit);
		Thread.sleep(2000);
		return this;
	}
	public viewlead typephnumber(String data) {
		WebElement eleUserName = locateElement("xpath", "//input[@name='phoneNumber']");
		type(eleUserName, data);
		return this;
}
}








