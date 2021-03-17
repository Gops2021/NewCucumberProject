package org.stepdefn;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.PojoClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class StepDefinition extends BaseClass {

	public PojoClass l;

	@Given("I am in facebook login page")
	public void i_am_in_facebook_login_page() {
		launchBrowser();
		launchUrl("https://www.facebook.com/");
	}

	@When("I enter invalid {string} and {string}")
	public void i_enter_invalid_and(String email, String pass) {
		l = new PojoClass();
		l.enterCreden(email, pass);
	}

	@When("I enter invalid username and password")
	public void i_enter_invalid_username_and_password(DataTable d) {

		List<Map<String, String>> list = d.asMaps();
		Map<String, String> map = list.get(1);

		String email = map.get("username");
		String pass = map.get("password");

		l = new PojoClass();
		l.enterCreden(email, pass);

	}

	@When("I click login button")
	public void i_click_login_button() throws InterruptedException {
		l.clickLoginBttn();
		Thread.sleep(3000);
	}

	@Then("I should be displayed with an error message")
	public void i_should_be_displayed_with_an_error_message() {
		l.AssertValidation();
		PrintResult();
	}

}
