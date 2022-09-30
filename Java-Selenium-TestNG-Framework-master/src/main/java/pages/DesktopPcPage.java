package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DesktopPcPage {
	By compare_list = By.xpath("//input[@value='Add to compare list']");

	WebDriver driver;
	WebDriverWait wait;

	public DesktopPcPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}

	public void compareClick() {
		driver.findElement(compare_list).click();
	}
}
