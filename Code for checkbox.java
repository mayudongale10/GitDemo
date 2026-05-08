import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/mayur/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		System.out.println(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());//to get true or false value if checkbox is selected
		
		//Checkbox click code
		driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).click();//css selector with regular expression on checkbox to click
	
		System.out.println(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());//to get true or false value if checkbox is selected
		
		
		//To count no. of checkboxes
		System.out.println("No of checkboxes " + driver.findElements(By.cssSelector("input[type='checkbox']")).size());//here findelements is used as all checkbox are to be returned as per css selector
		
	}

}
