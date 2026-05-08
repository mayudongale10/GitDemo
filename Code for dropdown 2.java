import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		//driver.findElement(By.id("hrefIncAdt")).click();//this selects + one times i.e. 2 adults if we want to make it n number of times we have to rewrite that times or ideal way is to use loop
		//Thread.sleep(1000);
		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		int i = 1;
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
			Thread.sleep(1000);
		}//similar can be done by using for loop as well
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");//assertion to check if 5 are selected
		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("btnclosepaxoption")).click();
		Thread.sleep(1000);

	}

}
