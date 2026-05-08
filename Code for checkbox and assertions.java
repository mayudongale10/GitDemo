import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//Testng is framework that can e used for assertions.First step is to download the jar from net and add it to the properties of ur project as add external jar

public class CheckboxAssertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/mayur/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Assertions code
		Assert.assertFalse(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());//this methods checks if returned value is false
		
		//Checkbox click code
		driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).click();//css selector with regular expression on checkbox to click
		
		//Assertions code
		Assert.assertTrue(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());//this method validates if true is returned as output
		
		//To count no. of checkboxes
		System.out.println("No of checkboxes " + driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.close();
	}

}
