import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String name = "rahul";
				WebDriver driver = new ChromeDriver();
				String password = getPassword(driver);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//use to solve timeout issue after getting error message
				driver.get("https://rahulshettyacademy.com/locatorspractice/");//invoke driver
				driver.findElement(By.id("inputUsername")).sendKeys(name);//findelemet by locater id and send value
				driver.findElement(By.name("inputPassword")).sendKeys(password);//find element by locater name and send value
				driver.findElement(By.className("signInBtn")).click();//find element by located classname and perform action click
				Thread.sleep(2000);//to go to next page it may take some time and in next findelement we are finding direct by tagname so give wait
				System.out.println(driver.findElement(By.tagName("p")).getText());//On second page there is only one element with tagname p so we can use it directly
				Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");//Assert is from TestNg used to compare outputs
				Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");//here we stored name in string and used dynamically and compared
				driver.findElement(By.xpath("//*[text()='Log Out']")).click();//Here we are finding element by xpath by using text i.e. LOGOUT button
				Thread.sleep(2000);
				driver.close();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException{//We need driver object to access so when menthod is call we will pass object and to access method directly it is static else u can create object of class Locaters2 with public and access method
		driver.get("https://rahulshettyacademy.com/locatorspractice/");//link of website
		driver.findElement(By.linkText("Forgot your password?")).click();//forget password link
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();//click on reset button to get text
		String passwordText =driver.findElement(By.cssSelector("form p")).getText();//The below text 
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passarr1 = passwordText.split("'");
		String password = passarr1[1].split("'")[0];
		return password;
		
		//0th index - Please use temporary password

		//1st index - rahulshettyacademy' to Login.
		//0th index - rahulshettyacademy

		//1st index - to Login.
	
	}
	
}


