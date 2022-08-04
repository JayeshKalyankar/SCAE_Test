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

public class register3 {
	WebDriver driver;
	int countrycount = 1;
	int statecount = 1;
	int count=2;
	
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
	
	
	@Test(invocationCount=1, enabled=true)
	public void registerUserusingState3 () throws InterruptedException, IOException {
		
			
			//Click on Register
			WebElement registerTab = driver.findElement(By.xpath("(//*[contains(text(), 'Add Alumni')])[1]"));
			registerTab.click();
			
			Thread.sleep(1000);
			
		   
//*********************************************************************************************
			
			//Path of the excel file
			FileInputStream fs = new FileInputStream("/home/srvweblpubt20/Downloads/ExcelData.xlsx");
			//Creating a workbook
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			//Personal Detail
			XSSFCell Salutation 				= sheet.getRow(count).getCell(1);
			XSSFCell Fname 						= sheet.getRow(count).getCell(2);
			XSSFCell Mname 						= sheet.getRow(count).getCell(3);
			XSSFCell Lname 						= sheet.getRow(count).getCell(4);
			XSSFCell Email 						= sheet.getRow(count).getCell(5);
			XSSFCell Alt_Email 					= sheet.getRow(count).getCell(6);
			XSSFCell FormerName 				= sheet.getRow(count).getCell(7); 
			XSSFCell ContactNumber 				= sheet.getRow(count).getCell(8);
			XSSFCell Alt_ContactNumber			= sheet.getRow(count).getCell(9);
			XSSFCell Country					= sheet.getRow(count).getCell(10);
			XSSFCell State						= sheet.getRow(count).getCell(11);
			XSSFCell City						= sheet.getRow(count).getCell(12);
			XSSFCell Residential_Adress			= sheet.getRow(count).getCell(13);
			XSSFCell Nationality				= sheet.getRow(count).getCell(14);
			XSSFCell Other_Nationality			= sheet.getRow(count).getCell(15);
			XSSFCell Region						= sheet.getRow(count).getCell(16);
			XSSFCell Gender						= sheet.getRow(count).getCell(17);
			XSSFCell Birthdate					= sheet.getRow(count).getCell(18);
			//Educational Detail
			XSSFCell Institute_Type				= sheet.getRow(count).getCell(19);
			XSSFCell Faculty					= sheet.getRow(count).getCell(20);
			XSSFCell Institute_Name_1			= sheet.getRow(count).getCell(21);
			XSSFCell Degree_Type				= sheet.getRow(count).getCell(22);
			XSSFCell Degree_1					= sheet.getRow(count).getCell(23);
			XSSFCell Yearof_Passing1			= sheet.getRow(count).getCell(24);
			XSSFCell PRN						= sheet.getRow(count).getCell(25);
			XSSFCell Result_Status				= sheet.getRow(count).getCell(26);
			XSSFCell Higher_Education_Institute	= sheet.getRow(count).getCell(27);
			XSSFCell Higher_Education_Degree	= sheet.getRow(count).getCell(28);
			XSSFCell Board_12th					= sheet.getRow(count).getCell(29);
			XSSFCell Board_10th					= sheet.getRow(count).getCell(30);
			//Professional Detail
			XSSFCell Occupation					= sheet.getRow(count).getCell(31);
			XSSFCell Vertical					= sheet.getRow(count).getCell(32);
			XSSFCell Sub_Vertical				= sheet.getRow(count).getCell(33);
			XSSFCell Current_Company_Name		= sheet.getRow(count).getCell(34);
			XSSFCell Current_Designation		= sheet.getRow(count).getCell(35);
			XSSFCell Sub_Designation			= sheet.getRow(count).getCell(36);
			XSSFCell Official_Email				= sheet.getRow(count).getCell(37);
			XSSFCell Foundation_Name			= sheet.getRow(count).getCell(38);
			//Social Media Detail
			XSSFCell Linkedin_Url				= sheet.getRow(count).getCell(39);
			XSSFCell LinkedIn_Email_address		= sheet.getRow(count).getCell(40);
			XSSFCell Facebook_Url				= sheet.getRow(count).getCell(41);
			XSSFCell Twitter_Url				= sheet.getRow(count).getCell(42);
			XSSFCell Instagram_Url				= sheet.getRow(count).getCell(43);
			//Other Details
			XSSFCell Awards						= sheet.getRow(count).getCell(44);
			XSSFCell Achievements				= sheet.getRow(count).getCell(45);
			XSSFCell Endowment					= sheet.getRow(count).getCell(46);
			XSSFCell Chapter_Name				= sheet.getRow(count).getCell(47);
			XSSFCell Comment					= sheet.getRow(count).getCell(48);
			
			
			
			//Personal Detail
			String _Salutation = Salutation.toString();
			String _Fname = Fname.toString();
			String _Mname = Mname.toString();
			String _Lname = Lname.toString();
			String _Email = Email.toString();
			String _Alt_Email = Alt_Email.toString();
			String _FormerName = FormerName.toString();
			String _ContactNumber = ContactNumber.toString();
			String _Alt_ContactNumber = Alt_ContactNumber.toString();
			String _Country = Country.toString();
			String _State = State.toString();
			String _City = City.toString();
			String _Residential_Adress = Residential_Adress.toString();
			String _Nationality = Nationality.toString();
			String _Other_Nationality = Other_Nationality.toString();
			String _Region = Region.toString();
			String _Gender = Gender.toString();
			String _Birthdate = Birthdate.toString();
			
			//Educational Detail
			String _Institute_Type = Institute_Type.toString();
			String _Faculty = Faculty.toString();
			String _Institute_Name_1 = Institute_Name_1.toString();
			String _Degree_Type = Degree_Type.toString();
			String _Degree_1 = Degree_1.toString();
			String _Yearof_Passing1 = Yearof_Passing1.toString();
			String _PRN = PRN.toString();
			String _Result_Status = Result_Status.toString();
			String _Higher_Education_Institute = Higher_Education_Institute.toString();
			String _Higher_Education_Degree = Higher_Education_Degree.toString();
			String _Board_12th = Board_12th.toString();
			String _Board_10th = Board_10th.toString();
			
			//Professional Detail
			String _Occupation = Occupation.toString();
			String _Vertical = Vertical.toString();
			String _Sub_Vertical = Sub_Vertical.toString();
			String _Current_Company_Name = Current_Company_Name.toString();
			String _Current_Designation = Current_Designation.toString();
			String _Sub_Designation = Sub_Designation.toString();
			String _Official_Email = Official_Email.toString();
			String _Foundation_Name = Foundation_Name.toString();
			
			//Social Media Detail
			String _Linkedin_Url = Linkedin_Url.toString();
			String _LinkedIn_Email_address = LinkedIn_Email_address.toString();
			String _Facebook_Url = Facebook_Url.toString();
			String _Twitter_Url = Twitter_Url.toString();
			String _Instagram_Url = Instagram_Url.toString();
			
			//Other Details
			String _Awards = Awards.toString();
			String _Achievements = Achievements.toString();
			String _Endowment = Endowment.toString();
			String _Chapter_Name = Chapter_Name.toString();
			String _Comment = Comment.toString();
			
			count++;
			
//*********************************************************************************************			
			
			//Click on MR radio Button
			WebElement Mr = driver.findElement(By.id("flexRadioDefault_mr"));
			Mr.click();
			
			//Enter First Name
			WebElement firstName = driver.findElement(By.id("first_name"));
			firstName.sendKeys(_Fname);  
			
			Thread.sleep(1000);	
			
			//submit1 Click
			WebElement submit1 = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
			submit1.click();
			
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
			
			
			
			/*
			 * //Click Yes Submit WebElement yesButton =
			 * driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
			 * yesButton.click();
			 */////////

		}
	
	
	
}
