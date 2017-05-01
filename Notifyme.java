package RegisterPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Notifyme {

	public static void main(String[] args) {
	
		// Goto "patient.heal.com/register"
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/syed/Desktop/testing/chromedriver.exe");
			
		   WebDriver  driver = new ChromeDriver();
		   driver.manage().window().maximize();
				driver.get("https://patient.heal.com/register");
				
				
				// Fill out the details 
				
				WebElement fname= driver.findElement(By.name("firstname"));
					fname.click();
					fname.sendKeys("ff");
					
					WebElement lname= driver.findElement(By.name("lastname"));
					lname.click();
					lname.sendKeys("aa");
					
			// Enter a valid email 
					
					WebElement email= driver.findElement(By.name("username"));
					email.click();
					email.sendKeys("fat@gmail.com");
					
				
					//Password as per the requirements
					
					WebElement pword = driver.findElement(By.name("password"));
					pword.click();
					pword.sendKeys("Password12");
					
					WebElement pword2= driver.findElement(By.name("password2"));
					pword2.click();
					pword2.sendKeys("Password12");
					
					
					// Enter a valid phone number
					
					WebElement pnum= driver.findElement(By.name("phonenumber"));
					pnum.click();
					pnum.sendKeys("5629281267");
					
					
					//enter a valid zipcode
					
					WebElement zcode= driver.findElement(By.name("zipcode"));
					zcode.click();
					zcode.sendKeys("90897");
					
					//submit the Create Account
					
					WebElement signin= driver.findElement(By.className("md-accent"));
					signin.click();
					
					//Successfull Login but Zipcode out of area...click notify
					
					WebElement notifyMe= driver.findElement(By.className("md-accent outline md-button md-ink-ripple"));
					notifyMe.click();
					

	}

}
