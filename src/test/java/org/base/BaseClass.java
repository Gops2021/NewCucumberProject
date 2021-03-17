package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class BaseClass {
	public static WebDriver driver;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void launchUrl(String Url) {
		driver.get(Url);
	}

	public static void fill(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void btnClick(WebElement element) {
		element.click();
	}

	public void PrintResult() {
		WebElement E1 = driver.findElement(By.xpath("//div[@class='_9ay7']"));

		if (E1.isDisplayed()) {

			System.out.println("Incorrect attempt has been done");

		}
	}

}
