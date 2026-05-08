import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//use to solve timeout issue after getting error message
		driver.get("https://rahulshettyacademy.com/locatorspractice/");//invoke driver
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");//findelemet by locater id and send value
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");//find element by locater name and send value
		driver.findElement(By.className("signInBtn")).click();//find element by located classname and perform action click
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());//this fails due to timeout issue...this is css selector locater where tagname was p and error is attribute value
//to solve it use wait after object
		driver.findElement(By.linkText("Forgot your password?")).click();//this is used where element is a link i.e. there is anchor tag in html and no other locaters and then perform  click action
		Thread.sleep(1000);//there is issue as Element interupted when reset click happens post forget password this is due to url is same and page is getting refreshed and during this selenium does the process and the click is not reached to correct item..for this we should give wait to the system and then process should continue.
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("rahul");//xpath locater similar to css where we build the locater
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rs@gmail.com");//css locater customised 
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();//this finds element by index as there are multiple elements with same attribute and values and clears the value
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("md@gmail.com");//in css locater indexing is little different and indexing for xpath and css may differ as xpath ignores hidden tags and css considers them so for same element email xpath index was 2 and css index is 3
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("8624911285");//traverse from parent to child in xpath to find element and send value 
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();//using css locater by specifying directly attribute value ....this fails
		System.out.println((driver.findElement(By.cssSelector("form p")).getText()));//traverse from parent to child for css and get text and print it
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();//xpath traverse from parent to child to click on go to login page
		Thread.sleep(1000);//Here again moving action happens on same page and can cause exception so give 1 second wait
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");//css selector to enter username 
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");//css selector regular expression where it just finds the element based on "pass" word
		driver.findElement(By.id("chkboxOne")).click();//clicking checkbok
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();//xpath regular expression where it finds element with word submit
		
	
		
	}

}
