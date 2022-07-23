	package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class register {
	
	
	public static void main(String[] args) throws InterruptedException {
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver;
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://scae.alumni.srv.media/login");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			//Enter Email
			WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
			email.sendKeys("testtest@gmail.com");
			
			//Enter Password
			WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
			password.sendKeys("Test@1234");
			
			//Click Submit
			Thread.sleep(1000);
			WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
			submit.click();
			
			Thread.sleep(2000);
			
			//Click on Register
			WebElement registerTab = driver.findElement(By.xpath("(//*[contains(text(), 'Add Alumni')])[1]"));
			registerTab.click();
			
			Thread.sleep(1000);
			
			//Click on MR radio Button
			WebElement Mr = driver.findElement(By.id("flexRadioDefault_mr"));
			Mr.click();
			
			//Enter First Name
			WebElement firstName = driver.findElement(By.id("first_name"));
			firstName.clear();
			firstName.sendKeys("First Name");
			
			//Enter Middle Name
			WebElement middletName = driver.findElement(By.id("middle_name"));
			middletName.sendKeys("middle name");
			
			//Enter Last Name
			WebElement lastName = driver.findElement(By.id("last_name"));
			lastName.sendKeys("last name");
			
			//enter email
			WebElement email1 = driver.findElement(By.id("email"));
			email1.sendKeys("test@gmail.com");
			
			//Enter Alternate Email
			WebElement emailalt = driver.findElement(By.id("email_alt"));
			emailalt.sendKeys("test1@gmail.com");
			
			//Bounce Email Checkbox Click
			WebElement BounceEmail = driver.findElement(By.xpath("(//*[@id='flexCheckDefault'])[1]"));
			BounceEmail.click();
			
			//Unsubscribe Email Checkbox click
			WebElement UnsubscribeEmail = driver.findElement(By.xpath("(//*[@id='flexCheckDefault'])[2]"));
			UnsubscribeEmail.click();
						
			//Select Country
			WebElement country = driver.findElement(By.id("country"));
			Select countrySelect = new Select(country);
			countrySelect.selectByVisibleText("India");
			
			Thread.sleep(2000);

			//Select State
			WebElement state = driver.findElement(By.id("state"));
			Select stateSelect = new Select(state);
			stateSelect.selectByVisibleText("Maharashtra");
			
			Thread.sleep(2000);
			
			//Select City
			WebElement city = driver.findElement(By.id("city"));
			Select citySelect = new Select(city);
			citySelect.selectByVisibleText("Ahmednagar");
			
			//submit1 Click
			WebElement submit1 = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
			submit1.click();
			
			Thread.sleep(1000);
			
			//Select Institute
			WebElement InstituteType = driver.findElement(By.xpath("//*[contains(text(), 'Institute Type')]/following-sibling::select[1]"));
			Select InstitutetypeSelect = new Select(InstituteType);
			InstitutetypeSelect.selectByVisibleText("SIU");
			
			Thread.sleep(1000);
			
			//Select Faculty
			WebElement Faculty = driver.findElement(By.xpath("//*[contains(text(), 'Faculty')]/following-sibling::select[1]"));
			Select FacultySelect = new Select(Faculty);
			FacultySelect.selectByVisibleText("Architecture and Design");
			
			Thread.sleep(1000);
			
			//Select Institute Name 1
			WebElement InstituteName1 = driver.findElement(By.xpath("//*[contains(text(), 'Institute Name 1 ')]/following-sibling::select[1]"));
			Select InstituteName1Select = new Select(InstituteName1);
			InstituteName1Select.selectByVisibleText("SID");
			
			Thread.sleep(1000);
			
			//submit2 Click
			WebElement submit2 = driver.findElement(By.xpath("//*[@id='alumni-form']/div[7]/div/button[2]"));
			submit2.click();
			
			Thread.sleep(1000);
			
			//submit3 Click
			WebElement submit3 = driver.findElement(By.xpath("//*[@id='nav-university']/div[2]/div/button[2]"));
			submit3.click();
			
			//submit4 Click
			WebElement submit4 = driver.findElement(By.xpath("//*[@id='nav-work']/div[2]/div/button[2]"));
			submit4.click();
			
			Thread.sleep(1000);
			
			//Click Final Submit
			WebElement submitFinal = driver.findElement(By.xpath("//*[@id='nav-documents']/div[2]/button[2]"));
			submitFinal.click();
			
			Thread.sleep(1000);
			
			//Click Yes Submit
			WebElement yesButton = driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
			yesButton.click();
			
				
			driver.close();

		}
}
