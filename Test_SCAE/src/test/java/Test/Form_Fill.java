package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Form_Fill {
	WebDriver driver;
	int count=1;
	
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
	
	
	@Test(invocationCount=1)
	public void registerUser3 () throws InterruptedException, IOException {
		
		
		//Click on Register
		WebElement registerTab = driver.findElement(By.xpath("(//*[contains(text(), 'Add Alumni')])[1]"));
		registerTab.click();
		
		Thread.sleep(2000);
		   
//***************************Get Data From Excel*******************************************
			
			//Path of the excel file
			FileInputStream fs = new FileInputStream("/home/srvweblpubt20/Downloads/ExcelData.xlsx");
			//Creating a workbook
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			count++;
			
//*****************************Fill Form********************************************************************
			
			
			
		/*
		 * Thread.sleep(10000);
		 * 
		 * //Click on MR radio Button WebElement Mr =
		 * driver.findElement(By.id("flexRadioDefault_mr")); Mr.click();
		 * 
		 * //Enter First Name WebElement firstName =
		 * driver.findElement(By.id("first_name")); firstName.clear();
		 * firstName.sendKeys(_Fname);
		 * 
		 * Thread.sleep(1000);
		 * 
		 * //Select Country WebElement country = driver.findElement(By.id("country"));
		 * Select countrySelect = new Select(country);
		 * countrySelect.selectByVisibleText(_Country);
		 * 
		 * //Select State WebElement state = driver.findElement(By.id("state")); Select
		 * stateSelect = new Select(state); stateSelect.selectByVisibleText(_State);
		 * 
		 * Thread.sleep(1000);
		 * 
		 * //submit1 Click WebElement submit1 =
		 * driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		 * submit1.click();
		 * 
		 * Thread.sleep(1000);
		 * 
		 * //Select Institute WebElement InstituteType1 = driver.findElement(By.
		 * xpath("//*[contains(text(), 'Institute Type')]/following-sibling::select[1]")
		 * ); Select InstitutetypeSelect = new Select(InstituteType1);
		 * InstitutetypeSelect.selectByVisibleText(_Institute_Type);
		 * 
		 * Thread.sleep(1000);
		 * 
		 * //Select Faculty WebElement Faculty1 = driver.findElement(By.
		 * xpath("//*[contains(text(), 'Faculty')]/following-sibling::select[1]"));
		 * Select FacultySelect = new Select(Faculty1);
		 * FacultySelect.selectByVisibleText(_Faculty);
		 * 
		 * Thread.sleep(1000);
		 * 
		 * //Select Institute Name 1 WebElement InstituteName1 = driver.findElement(By.
		 * xpath("//*[contains(text(), 'Institute Name 1 ')]/following-sibling::select[1]"
		 * )); Select InstituteName1Select = new Select(InstituteName1);
		 * InstituteName1Select.selectByVisibleText(_Institute_Name_1);
		 * 
		 * Thread.sleep(1000);
		 * 
		 * //submit2 Click WebElement submit2 =
		 * driver.findElement(By.xpath("//*[@id='alumni-form']/div[7]/div/button[2]"));
		 * submit2.click();
		 * 
		 * Thread.sleep(1000);
		 * 
		 * //submit3 Click WebElement submit3 =
		 * driver.findElement(By.xpath("//*[@id='nav-university']/div[2]/div/button[2]")
		 * ); submit3.click();
		 * 
		 * Thread.sleep(1000);
		 * 
		 * //submit4 Click WebElement submit4 =
		 * driver.findElement(By.xpath("//*[@id='nav-work']/div[2]/div/button[2]"));
		 * submit4.click();
		 * 
		 * Thread.sleep(1000);
		 * 
		 * //Click Final Submit WebElement submitFinal =
		 * driver.findElement(By.xpath("//*[@id='nav-documents']/div[2]/button[2]"));
		 * submitFinal.click();
		 * 
		 * Thread.sleep(1000);
		 * 
		 * //Click Yes Submit WebElement yesButton =
		 * driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
		 * yesButton.click();
		 */
	

		}
	
	
	
}
