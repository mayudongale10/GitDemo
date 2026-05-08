import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/mayur/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Thread.sleep(2000);
		//Dropdown with select tag in html are static dropdown to do any function related to them we use Select class
		//For this class we need to pass the location of that webelement from whole webpage for that we use the above Webelement class object to locate the dropdown by id
		Select dropdown = new Select(staticdropdown);//now this class knows where the element is present by the object staticdropdown
		dropdown.selectByIndex(3);//it selects 3 index option from list --- 0 1 2 3 
		System.out.println(dropdown.getFirstSelectedOption().getText());//This is used to retrive what is selected and it checks the webelement and returns the string
		Thread.sleep(2000);
		dropdown.selectByVisibleText("AED");//this checks the text on dropdown
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		dropdown.selectByValue("INR");//This checks value in html i.e. option tag and value attribute
		System.out.println(dropdown.getFirstSelectedOption().getText());
	}

}
