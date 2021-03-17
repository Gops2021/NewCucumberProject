package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class PojoClass extends BaseClass {

	public PojoClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement txtEmail;

	@FindBy(id = "pass")
	private WebElement txtPass;

	@FindBy(name = "login")
	private WebElement clickLogin;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getClickLogin() {
		return clickLogin;
	}

	public void enterCreden(String Username, String Password) {
		fill(getTxtEmail(), Username);
		fill(getTxtPass(), Password);
	}

	public void clickLoginBttn() {
		btnClick(getClickLogin());
	}

	public void AssertValidation() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("privacy_mutation_token"));

	}

}
