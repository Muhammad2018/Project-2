package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom1.LoginPage;

public class TestCases {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\imran\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		LoginPage login = new LoginPage(driver);
		driver.get("https://www.facebook.com");
		login.typeUsername("email");
		login.typePassword("pass");
		login.clickLoginButton();

	}

}
