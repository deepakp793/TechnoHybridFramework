package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.PredefinedActions;

public class MyInfo_SalaryPage extends PredefinedActions{
	
	public static MyInfo_SalaryPage myInfo_SalaryPage;
	
	@FindBy(css=".summary-cards-container div[translate*='Cost to the']+div")
	private WebElement costToCompany;
	
	private MyInfo_SalaryPage() {
		PageFactory.initElements(driver, this);
	}
	
	public static MyInfo_SalaryPage getObject() {
		if(myInfo_SalaryPage==null)
			myInfo_SalaryPage=new MyInfo_SalaryPage();
		return myInfo_SalaryPage;
	}
	
	public String getCostToCompany() {
		waitForVisibilityOfElement(costToCompany);
		return getElementText(costToCompany, false);
	}
}
