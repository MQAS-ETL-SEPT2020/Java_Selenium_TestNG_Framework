package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage1 {

	By ComputerClick = By.xpath("(//a[@href='/computers'])[1]");

	WebDriver driver;
	WebDriverWait wait;

	public HomePage1(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}

	public void computers() {
		driver.findElement(ComputerClick).click();
	}
}
