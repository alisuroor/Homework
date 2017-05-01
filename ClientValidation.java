package RegisterPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClientValidation {

	public static void main(String[] args) {
		
		//Visit the Registeration page of Heal
	
		System.setProperty("webdriver.chrome.driver", "C:/Users/syed/Desktop/testing/chromedriver.exe");
		   WebDriver  driver = new ChromeDriver();
		   driver.manage().window().maximize();
				driver.get("https://patient.heal.com/register");
				
				
				// Fill out the details  "Blank"
				
				WebElement fname= driver.findElement(By.name("firstname"));
					fname.click();
					fname.sendKeys("");
					
					WebElement lname= driver.findElement(By.name("lastname"));
					lname.click();
					lname.sendKeys("");
					
			 
					
					WebElement email= driver.findElement(By.name("username"));
					email.click();
					email.sendKeys("");
					
				
				
					
					WebElement pword = driver.findElement(By.name("password"));
					pword.click();
					pword.sendKeys("");
					
					WebElement pword2= driver.findElement(By.name("password2"));
					pword2.click();
					pword2.sendKeys("");
					
					
				
					
					WebElement pnum= driver.findElement(By.name("phonenumber"));
					pnum.click();
					pnum.sendKeys("");
					
					
		
					
					WebElement zcode= driver.findElement(By.name("zipcode"));
					zcode.click();
					zcode.sendKeys("");
					
					// Submit the form
					
					WebElement signin= driver.findElement(By.className("md-accent"));
					signin.click();
		
					
					//Validation part
					
					WebElement verifyText= driver.findElement(By.xpath(".//div[@class ='error-messages'']"));
					verifyText.getText().contains("is required");

	}

}
