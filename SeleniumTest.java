package SeleniumTest.SeleniumTest;

import javax.xml.datatype.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTest {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));

		driver.get("https://artoftesting.com/samplesiteforselenium");

		WebElement name = driver.findElement(By.id("fname"));
		name.sendKeys("Pranav");

		driver.findElement(By.id("idOfButton")).click();

		Actions actions = new Actions(driver);

		WebElement buttondbclk = driver.findElement(By.id("dblClkBtn"));
		actions.doubleClick(buttondbclk).perform();

		WebElement alertboxx = driver.findElement(By.id("ConfirmBox"));
		alertboxx.submit();
		
		WebElement radiobtn = driver.findElement(By.id("Male"));
		radiobtn.click();

	}
}
