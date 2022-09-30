package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage {
	By compare_Products = By.xpath("//input[@title='Remove']");

	WebDriver driver;
	WebDriverWait wait;

	public ProductsPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}

	public void remove() {
		driver.findElement(compare_Products).click();
	}
}
