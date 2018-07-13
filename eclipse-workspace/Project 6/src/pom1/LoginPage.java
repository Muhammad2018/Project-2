package pom1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	By Username = By.name("email");
	By Password = By.name("pass");
	By LoginButton = By.id("u_0_2");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void typeUsername(String uname) {
		driver.findElement(Username).sendKeys("uname");
	}

	public void typePassword(String pass) {
		driver.findElement(Password).sendKeys("pass");
	}

	public void clickLoginButton() {
		driver.findElement(LoginButton).click();

		driver.close();
	}
}
