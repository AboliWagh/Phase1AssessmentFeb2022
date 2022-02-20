package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazonSearchClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// System.setProperty("webDriver.gecko.driver","geckodriver.exe");

		// WebDriver driver = new FirefoxDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);

		WebElement SearchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		SearchBox.sendKeys("Iphone 12");
		WebElement SearchButton = driver.findElement(By.id("nav-search-submit-button"));
		SearchButton.click();

		List<WebElement> ProductName = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		List<WebElement> ProductPrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		System.out.println("Search Result" +ProductName.size());
		
		for (WebElement name : ProductName) {

			System.out.println("name ----" + name.getText());

		}

		for (WebElement price : ProductPrice) {

			System.out.println("Price ----" + price.getText());

		}

	}

}
