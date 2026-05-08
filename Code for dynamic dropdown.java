import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/mayur/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();//first locate dropdown and click
		driver.findElement(By.xpath("//a[@value='BLR']")).click();//click on BLR option ----now second dropdown will open automatically based on first dropdown
		Thread.sleep(2000);//need synchronisation as the action shifts from first to second dropdown dynamically
		//driver.findElement(By.xpath("//a[@value='MAA']")).click();//there are two elements with value MAA in from and to dropdown now selenium finds the first element by default and when the first dropdown work is done it minimises so this will give error as it will try to find element in first dropdown but the action is pointed to sencond dropdown so we need to provide index
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();//this will find the second element which is present in 2nd dropdown so no error
		
		

	}

}
