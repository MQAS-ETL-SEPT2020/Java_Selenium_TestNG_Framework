package tests;

import org.testng.annotations.Test;

import pages.DesktopPcPage;
import pages.HomePage1;
import pages.ProductsPage;
import pages.BasePage;
import pages.ComputerPage;
import pages.DesktopPage;

public class RemoveProductTest extends BasePage {
	@Test
	public void ClickOnComputer() {

		HomePage1 home1 = new HomePage1(driver);
		home1.computers();

		ComputerPage computer = new ComputerPage(driver);
		computer.ClickOnDesktop();

		DesktopPage desktop = new DesktopPage(driver);
		desktop.Desktop();

		DesktopPcPage compare = new DesktopPcPage(driver);
		compare.compareClick();

		ProductsPage product = new ProductsPage(driver);
		product.remove();
	}
}
