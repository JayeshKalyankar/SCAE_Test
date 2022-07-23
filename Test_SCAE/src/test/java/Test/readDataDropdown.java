package Test;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class readDataDropdown {
	WebDriver driver;
	
	@BeforeTest
	public void startUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
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
	}
	
	
	@AfterTest
	public void shutDown() {
		driver.close();
	}
	
	
	
	@Test()
	public void registerUser () throws InterruptedException, IOException {
		
			
			//Click on Register
			WebElement registerTab = driver.findElement(By.xpath("(//*[contains(text(), 'Add Alumni')])[1]"));
			registerTab.click();
			
			Thread.sleep(1000);
			
			//Enter First Name
			WebElement firstName = driver.findElement(By.id("first_name"));
			firstName.clear();
			firstName.sendKeys("First Name");
			
			//submit1 Click
			WebElement submit1 = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
			submit1.click();
			
			//Select Institute
			WebElement InstituteType = driver.findElement(By.xpath("//*[contains(text(), 'Institute Type')]/following-sibling::select[1]"));
			Select InstitutetypeSelect = new Select(InstituteType);
			InstitutetypeSelect.selectByVisibleText("SIU");
			
			Thread.sleep(2000);
			
			
			//Select Faculty
			WebElement Faculty = driver.findElement(By.xpath("//*[contains(text(), 'Faculty')]/following-sibling::select[1]"));
			Select FacultySelect = new Select(Faculty);
			FacultySelect.selectByVisibleText("Health Sciences");
			
			Thread.sleep(2000);
			
			//Select Institute Name 1
			WebElement InstituteName1 = driver.findElement(By.xpath("//*[contains(text(), 'Institute Name 1 ')]/following-sibling::select[1]"));
			Select InstituteName1Select = new Select(InstituteName1);
			
			 List<WebElement> lst = InstituteName1Select.getOptions();

		        //Looping through the options and printing dropdown options
		        System.out.println("The dropdown options are:");
		        for(WebElement options: lst)
		            System.out.println(options.getText());

		}
}
