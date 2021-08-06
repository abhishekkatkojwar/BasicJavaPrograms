package mouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Alert;

public class DobuleClickDemo {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"E:/C10-old/arcFlash_Automation_fromSVN_04102018/Log/chromedriver.exe");
		driver = new ChromeDriver();

		// Launch the Application Under Test (AUT)
		// driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.get("https://www.google.com/search?q=testng.xml+sample+file&oq=testng.xml+sample+file&aqs=chrome..69i57.8895j0j7&sourceid=chrome&ie=UTF-8");
		// driver.manage().window().maximize();

		// driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		// driver.manage().window().maximize();
		// Double click the button to launch an alertbox
		Actions action = new Actions(driver);
		// WebElement link
		// =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		WebElement text = driver
				.findElement(By
						.xpath("//*[@id='tsf']/div[1]/div[1]/div[2]/div/div[2]/input"));
		action.doubleClick(text).perform();
		System.out.println("done");
		action.keyDown(Keys.SHIFT)
	    .sendKeys("s")
	    .build()
	    .perform();
		System.out.println("don1111");
		// Switch to the alert box and click on OK button
		// Alert alert = driver.switchTo().alert();
		// System.out.println("Alert Text\n" +alert.getText());
		// alert.accept();
		// Closing the driver instance
		// driver.quit();

	}
}