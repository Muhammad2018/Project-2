package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\imran\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("admin123");
		driver.findElement(By.id("u_0_2")).click();
		String url = driver.getCurrentUrl();
		if (url.equals("http://www.facebook.com"))
			;

		{
			System.out.println("Passed");

		}
		driver.close();
	}
}
