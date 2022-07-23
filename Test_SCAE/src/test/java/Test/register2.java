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

public class register2 {
	WebDriver driver;
	int countrycount = 1;
	int statecount = 1;
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
	
	
	@Test(invocationCount=195, enabled=false)
	public void registerUser () throws InterruptedException, IOException {
		
			
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
//*********************************************************************************************
			
			//Path of the excel file
			FileInputStream fs = new FileInputStream("/home/srvweblpubt20/Downloads/countryState.xlsx");
			//Creating a workbook
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			XSSFSheet sheet = workbook.getSheetAt(0);
//			XSSFRow row2 = sheet.getRow(1);
//			XSSFCell cell2 = row2.getCell(1);
			System.out.println(sheet.getRow(1).getCell(0));
			XSSFCell Cell = sheet.getRow(countrycount).getCell(0);
			String value = Cell.toString();
			countrycount++;
			
//*********************************************************************************************			
			Thread.sleep(1000);
			
			//Select Country
			WebElement country = driver.findElement(By.id("country"));
			Select countrySelect = new Select(country);
			countrySelect.selectByVisibleText(value);
			
			
			Thread.sleep(1000);

		/*
		 * //Select State WebElement state = driver.findElement(By.id("state")); Select
		 * stateSelect = new Select(state);
		 * stateSelect.selectByVisibleText("Maharashtra");
		 * 
		 * Thread.sleep(2000);
		 * 
		 * //Select City WebElement city = driver.findElement(By.id("city")); Select
		 * citySelect = new Select(city); citySelect.selectByVisibleText("Ahmednagar");
		 */
			
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
			
			Thread.sleep(1000);
			
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
	

		}
	
	
	@Test(invocationCount=36, enabled=false)
	public void registerUserusingState () throws InterruptedException, IOException {
		
			
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
//*********************************************************************************************
			
			//Path of the excel file
			FileInputStream fs = new FileInputStream("/home/srvweblpubt20/Downloads/countryState.xlsx");
			//Creating a workbook
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			XSSFCell Cell = sheet.getRow(statecount).getCell(1);
			String value = Cell.toString();
			statecount++;
			
//*********************************************************************************************			
			Thread.sleep(1000);
			
			//Select Country
			WebElement country = driver.findElement(By.id("country"));
			Select countrySelect = new Select(country);
			countrySelect.selectByVisibleText("India");
			
			
			
			//Select Country
			WebElement state = driver.findElement(By.id("state"));
			Select stateSelect = new Select(state);
			stateSelect.selectByVisibleText(value);
			
			
			Thread.sleep(1000);

		/*
		 * //Select State WebElement state = driver.findElement(By.id("state")); Select
		 * stateSelect = new Select(state);
		 * stateSelect.selectByVisibleText("Maharashtra");
		 * 
		 * Thread.sleep(2000);
		 * 
		 * //Select City WebElement city = driver.findElement(By.id("city")); Select
		 * citySelect = new Select(city); citySelect.selectByVisibleText("Ahmednagar");
		 */
			
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
			
			Thread.sleep(1000);
			
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
	

		}
	
	@Test(invocationCount=1, enabled=true)
	public void registerUserusingState3 () throws InterruptedException, IOException {
		
			
			//Click on Register
			WebElement registerTab = driver.findElement(By.xpath("(//*[contains(text(), 'Add Alumni')])[1]"));
			registerTab.click();
			
			Thread.sleep(1000);
			
		   
//*********************************************************************************************
			
			//Path of the excel file
			FileInputStream fs = new FileInputStream("/home/srvweblpubt20/Downloads/countryState2.xlsx");
			//Creating a workbook
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			XSSFCell Cell1 = sheet.getRow(count).getCell(1); //First Name
			XSSFCell Cell2 = sheet.getRow(count).getCell(3); //Last Name
			XSSFCell Cell3 = sheet.getRow(count).getCell(4); //Email
			XSSFCell Cell4 = sheet.getRow(count).getCell(5); //Country
			XSSFCell Cell5 = sheet.getRow(count).getCell(6); //State
			XSSFCell Cell6 = sheet.getRow(count).getCell(7); //Region
			XSSFCell Cell7 = sheet.getRow(count).getCell(8); //Gender
			XSSFCell Cell8 = sheet.getRow(count).getCell(9); //Birthdate
			XSSFCell Cell9= sheet.getRow(count).getCell(10); //InstituteType
			XSSFCell Cell10= sheet.getRow(count).getCell(11); //Faculty
			XSSFCell Cell11= sheet.getRow(count).getCell(12); //InstituteName
			
			String Fname = Cell1.toString();
			String Lname = Cell2.toString();
			String Email = Cell3.toString();
			String Country = Cell4.toString();
			String State = Cell5.toString();
			String Region = Cell6.toString();
			String Gender = Cell7.toString();
			String Birthdate = Cell8.toString();
			String InstituteType = Cell9.toString();
			String Faculty = Cell10.toString();
			String InstituteName = Cell11.toString();
			
			count++;
			
//*********************************************************************************************			
			
			//Click on MR radio Button
			WebElement Mr = driver.findElement(By.id("flexRadioDefault_mr"));
			Mr.click();
			
			//Enter First Name
			WebElement firstName = driver.findElement(By.id("first_name"));
			firstName.clear();
			firstName.sendKeys(Fname);  
			
			Thread.sleep(1000);
			
			//Select Country
			WebElement country = driver.findElement(By.id("country"));
			Select countrySelect = new Select(country);
			countrySelect.selectByVisibleText(Country);
			
			//Select State
			WebElement state = driver.findElement(By.id("state"));
			Select stateSelect = new Select(state);
			stateSelect.selectByVisibleText(State);
			
			Thread.sleep(1000);
			
			//submit1 Click
			WebElement submit1 = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
			submit1.click();
			
			Thread.sleep(1000);
			
			//Select Institute
			WebElement InstituteType1 = driver.findElement(By.xpath("//*[contains(text(), 'Institute Type')]/following-sibling::select[1]"));
			Select InstitutetypeSelect = new Select(InstituteType1);
			InstitutetypeSelect.selectByVisibleText(InstituteType);
			
			Thread.sleep(1000);
			
			//Select Faculty
			WebElement Faculty1 = driver.findElement(By.xpath("//*[contains(text(), 'Faculty')]/following-sibling::select[1]"));
			Select FacultySelect = new Select(Faculty1);
			FacultySelect.selectByVisibleText(Faculty);
			
			Thread.sleep(1000);
			
			//Select Institute Name 1
			WebElement InstituteName1 = driver.findElement(By.xpath("//*[contains(text(), 'Institute Name 1 ')]/following-sibling::select[1]"));
			Select InstituteName1Select = new Select(InstituteName1);
			InstituteName1Select.selectByVisibleText(InstituteName);
			
			Thread.sleep(1000);
			
			//submit2 Click
			WebElement submit2 = driver.findElement(By.xpath("//*[@id='alumni-form']/div[7]/div/button[2]"));
			submit2.click();
			
			Thread.sleep(1000);
			
			//submit3 Click
			WebElement submit3 = driver.findElement(By.xpath("//*[@id='nav-university']/div[2]/div/button[2]"));
			submit3.click();
			
			Thread.sleep(1000);
			
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
	

		}
	
	
	
}
