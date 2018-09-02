package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CreateLeadPage;
import pages.MyHomePage;
import wdMethods.ProjectMethods;


public class TC002_Editlead extends ProjectMethods {

	@BeforeClass
	public void setData() {
		testCaseName = "TC002_Editlead";
		testCaseDescription ="Edit a lead";
		category = "Sanity";
		author = "Senthil";
		dataSheetName="TC002";
	}
@Test(dataProvider="fetchData")
	public void EditLead(String fname, String uname)   {
		new MyHomePage()
		.clickLeads();
}}

