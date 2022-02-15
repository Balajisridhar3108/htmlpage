/*package week2.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class leafTapsApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver cdr=new ChromeDriver();
		cdr.get("http://leaftaps.com/opentaps/control/login");
		cdr.manage().window().maximize();
		cdr.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		cdr.findElement(By.id("username")).sendKeys("Demosalesmanager");
		cdr.findElement(By.id("password")).sendKeys("crmsfa");
		cdr.findElement(By.className("decorativeSubmit")).click();
		cdr.findElement(By.linkText("CRM/SFA")).click();
		cdr.findElement(By.linkText("Leads")).click();
		cdr.findElement(By.partialLinkText("Create")).click();
		cdr.findElement(By.id("createLeadForm_companyName")).sendKeys("WIPRO MANAGEMENT");
		cdr.findElement(By.id("createLeadForm_firstName")).sendKeys("Kavinraj");
        cdr.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		
		WebElement dropDown1 = cdr.findElement(By.id("createLeadForm_dataSourceId"));
		Select source=new Select(dropDown1);
		source.selectByVisibleText("Employee");
			
		cdr.findElement(By.id("createLeadForm_birthDate")).sendKeys("10/20/99");
		
		WebElement dropDown2 = cdr.findElement(By.id("createLeadForm_industryEnumId"));
		Select industry=new Select(dropDown2);
		industry.selectByIndex(2);
		
		WebElement dropDown3 = cdr.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownership=new Select(dropDown3);
		ownership.selectByValue("OWN_SCORP");
		
		WebElement dropDown4 = cdr.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select campaign=new Select(dropDown4);
		campaign.selectByVisibleText("Automobile");
		
		WebElement dropDown5 = cdr.findElement(By.id("createLeadForm_currencyUomId"));
		Select currency=new Select(dropDown5);
		currency.selectByValue("INR");
		
		//contact information
		cdr.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		cdr.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		cdr.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9080829503");
		cdr.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kavinraj89444@gmail.com");
		
		//primary address
		cdr.findElement(By.id("createLeadForm_generalToName")).sendKeys("Kavinraj");
		cdr.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Thokkavadi");
		cdr.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Tiruchengode");
		cdr.findElement(By.id("createLeadForm_generalCity")).sendKeys("Namakkal");
		cdr.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("637215");
		
		WebElement dropDown6 = cdr.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select country=new Select(dropDown6);
		country.selectByValue("IND");
		
		WebElement dropDown7 = cdr.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state=new Select(dropDown7);
		state.selectByValue("IN-TN");
		
		cdr.findElement(By.className("smallSubmit")).click();
		
		if(cdr.getTitle().contains("View Lead | opentaps CRM"))
		{
			System.out.println("Testcase Pass");
		}
		else
		{
		System.err.println("Testcase Fail");
		}
		
		cdr.findElement(By.linkText("opentaps")).click();
		cdr.findElement(By.className("decorativeSubmit")).click();
		cdr.close();
	}
	

	}*/

package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditHtmlPage {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//enter email id
		driver.findElement(By.id("email")).sendKeys("kavinraj89444@gmail.com");
		
		//Get the default text
		System.out.println("The default text is:"+driver.findElement(By.name("username")).getAttribute("value"));
		
		//clear the text
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).clear();
		
		//check the input field is disabled or not
		System.out.println("Print false if the textbox is disabled:"+driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input")).isEnabled());
		
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//position of button(x,y)
		System.out.println("The Position of the button:"+driver.findElement(By.id("position")).getLocation());
		
		//Find the color of the button
		System.out.println("The color of the button:"+driver.findElement(By.id("color")).getCssValue("background-color"));
		
		//Find the width and height of the button
		System.out.println("The width and height of the button:"+driver.findElement(By.id("size")).getSize());
		
		
	}

}


