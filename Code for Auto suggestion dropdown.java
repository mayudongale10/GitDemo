import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/mayur/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("Aus");//this finds the element of autosuggestive dropdown and send text 
		Thread.sleep(3000);//this is needed to get all options based on value
		List<WebElement> options = driver.findElements(By.cssSelector("li[class=\"ui-menu-item\"] a"));//here we are using findelements i.e. AUS word has multiple elements so we will find those all elements and store in list of type Webelement
		
		for(WebElement option : options) {//here we are itterating the list and storing the value one by one in variable option
			
			if(option.getText().equalsIgnoreCase("Austria")) {//here in every itteration we are checking if option is Austria
				System.out.println(option.getText());
				option.click();//if matched click
				break;//then break as no need of further itteration
			}
			
		}
		driver.close();

	}

}
