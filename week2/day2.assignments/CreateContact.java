package week2.day2.Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Muthu");
		driver.findElement(By.id("lastNameField")).sendKeys("Lakshmi");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("muthulakshmi");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("gfsjry");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Validation checked");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("muthulakshmi2599@gmail.com");
		driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")).click();
		Select stateDropDown=new Select(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
		stateDropDown.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("dhwieufb");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		

		
	}

}
