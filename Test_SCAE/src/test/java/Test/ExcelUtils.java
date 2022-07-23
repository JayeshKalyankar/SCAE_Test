package Test;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelUtils {
	
	static XSSFWorkbook workbook;
	static XSSFSheet Sheet;
	
	static int rowCount=0;
	static int columnCount=0;
	
	public static void main(String[] args) {
		excelUtils();
		//getRowCount();
		//getColumnCount();
		//getCellDataString(2,2);
		getcellData();
	}

	public static void excelUtils() {

		String systemPath = System.getProperty("user.dir");
		try {
			FileInputStream fs=new FileInputStream(systemPath+"/src/test/resources/ExcelData.xlsx");
			workbook = new XSSFWorkbook(fs);
			Sheet = workbook.getSheet("Sheet1");

		} catch (Exception exe) {
			System.out.println(exe.getStackTrace());
			System.out.println(exe.getMessage());
		}
	}
	
	public static int getRowCount() {
		rowCount = Sheet.getPhysicalNumberOfRows();
		System.out.println("Row Count is = " +rowCount);
		return rowCount;
	}
	
	public static int getColumnCount() {
		int columnCount = Sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Column Count is = " +columnCount);
		return columnCount;
	}
	
	
//***********************************************************************************************************
	@DataProvider(name = "testData1")
	public static Object[][] getData() {
		Object data[][]= getcellData();
		return data;
	}
	
	
	public static Object[][] getcellData() {
		excelUtils();
		//getCellDataString(2,2);
		
		int totalRows = getRowCount();
		int totalColumns= getColumnCount();
		
		Object data[][]=new Object[1][totalColumns];
		
		for(int i=2; i<3; i++) {
			for(int j=0; j<totalColumns; j++) {
				String cellData = Sheet.getRow(i).getCell(j).toString();
				//String cellData = getCellDataString(i,j);
				//System.out.print(cellData+"  ");
				data[i-2][j]=cellData;
			}
			//System.out.println();
		}
		return data;	
	}

//************************************************************************************************************
	
	static WebDriver driver;
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
	
	@Test(dataProvider="testData1")
	public static void test1
	(	String _rowNum,
		String _Salutation,
		String _Fname,
		String _Mname,
		String _Lname,
		String _Email,
		String _Alt_Email,
		String _FormerName,
		String _ContactNumber,
		String _Alt_ContactNumber,
		String _Country,
		String _State,
		String _City,
		String _Residential_Adress,
		String _Nationality,
		String _Other_Nationality,
		String _Region,
		String _Gender,
		String _Birthdate,
	
	    //Educational Detail
	String _Institute_Type,
	String _Faculty,
	String _Institute_Name_1,
	String _Degree_Type,
	String _Degree_1,
	String _Yearof_Passing1,
	String _PRN,
	String _Result_Status,
	String _Higher_Education_Institute,
	String _Higher_Education_Degree,
	String _Board_12th,
	String _Board_10th,
	
	//Professional Detail
	String _Occupation,
	String _Vertical,
	String _Sub_Vertical,
	String _Current_Company_Name,
	String _Current_Designation,
	String _Sub_Designation,
	String _Official_Email,
	String _Foundation_Name,
	
	//Social Media Detail
	String _Linkedin_Url,
	String _LinkedIn_Email_address,
	String _Facebook_Url,
	String _Twitter_Url,
	String _Instagram_Url,
	
	//Other Details
	String _Awards,
	String _Achievements,
	String _Endowment,
	String _Chapter_Name,
	String _Comment
	) throws InterruptedException 
	{ 
		/*
		 * System.out.println ( _Salutation+"    " +_Fname+"     " +_Mname+"     "
		 * +_Lname+"     " +_Email+"      " +_Alt_Email+"     " +_FormerName+"     "
		 * +_ContactNumber+"     " +_Alt_ContactNumber+"     " +_Country+"     "
		 * +_State+"      " );
		 */
		
		//Click on Register
		WebElement registerTab = driver.findElement(By.xpath("(//*[contains(text(), 'Add Alumni')])[1]"));
		registerTab.click();
		
		Thread.sleep(2000);
		
		//Click on MR radio Button
		WebElement Mr = driver.findElement(By.id("flexRadioDefault_mr"));
		Mr.click();
		
		//Enter First Name
		WebElement firstName = driver.findElement(By.id("first_name"));
		firstName.clear();
		firstName.sendKeys(_Fname);  
		
		Thread.sleep(1000);
		
		//Select Country
		WebElement country = driver.findElement(By.id("country"));
		Select countrySelect = new Select(country);
		countrySelect.selectByVisibleText(_Country);
		
		//Select State
		WebElement state = driver.findElement(By.id("state"));
		Select stateSelect = new Select(state);
		stateSelect.selectByVisibleText(_State);
		
		Thread.sleep(1000);
		
		//submit1 Click
		WebElement submit1 = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		submit1.click();
		
		Thread.sleep(1000);
		
		//Select Institute
		WebElement InstituteType1 = driver.findElement(By.xpath("//*[contains(text(), 'Institute Type')]/following-sibling::select[1]"));
		Select InstitutetypeSelect = new Select(InstituteType1);
		InstitutetypeSelect.selectByVisibleText(_Institute_Type);
		
		Thread.sleep(1000);
		
		//Select Faculty
		WebElement Faculty1 = driver.findElement(By.xpath("//*[contains(text(), 'Faculty')]/following-sibling::select[1]"));
		Select FacultySelect = new Select(Faculty1);
		FacultySelect.selectByVisibleText(_Faculty);
		
		Thread.sleep(1000);
		
		//Select Institute Name 1
		WebElement InstituteName1 = driver.findElement(By.xpath("//*[contains(text(), 'Institute Name 1 ')]/following-sibling::select[1]"));
		Select InstituteName1Select = new Select(InstituteName1);
		InstituteName1Select.selectByVisibleText(_Institute_Name_1);
		
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
