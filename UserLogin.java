package RegisterPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UserLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/syed/Desktop/testing/chromedriver.exe");
		
		
		// Visit heal Login Page In chrome
		
		   WebDriver  driver = new ChromeDriver();
		   driver.manage().window().maximize();
				driver.get("https://patient.heal.com/login");
				
		//Enter User name (already Registered)
				
				WebElement userName =driver.findElement(By.name("username"));
				userName.click();
				userName.sendKeys("fathima.suroor@gmail.com");
				
				//Enter password (already registered)
				
				WebElement passWord= driver.findElement(By.name("password"));
				passWord.click();
				passWord.sendKeys("Password12");
				
				//Submit Log In
				
				WebElement LogIn =driver.findElement(By.cssSelector("button.md-accent")); 
				LogIn.click();
				
			//validating the successfull Login
				
				driver.getCurrentUrl().contains("book-visit");
				
			
				
				
		

	}

}
