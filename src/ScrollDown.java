import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {

		// WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://saucelabs.com/selenium/selenium-chrome");
		driver.manage().window().maximize();
		String color = driver.findElement(
				By.xpath("//*[@id='tutorial-content']/h2[1]")).getCssValue(
				"color");
		String backcolor = driver.findElement(
				By.xpath(".//*[@id='tutorial-content']/h2[1]")).getCssValue(
				"background-color");
		System.out.println("font color=" + color);
		System.out.println("background color=" + backcolor);
		JavascriptExecutor jsx = (JavascriptExecutor) driver;
		jsx.executeScript("window.scrollBy(0,500)", ""); // scroll down
		Thread.sleep(3000);
		jsx.executeScript("window.scrollBy(450,0)", ""); // scroll up
	}
}