package  week2.day2.Assignments

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		    
		
			/*http://leaftaps.com/opentaps/control/main
			
			* 1	Launch the browser
			
			WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	
			* 2	Enter the username
			
			WebElement elementUsername =driver.findElement(By.id("username"));
	elementUsername.sendKeys("Demosalesmanager");
	
			* 3	Enter the password
			
			WebElement elementPassword =driver.findElement(By.id("password"));
	elementPassword.sendKeys("crmsfa");
		
			* 4	Click Login
			
			WebElement elementLogin =driver.findElement(By.className("decorativeSubmit"));
	elementLogin.click();
	
			* 5	Click crm/sfa link
			
			WebElement elementCRMSFA =driver.findElement(By.linkText("CRM/SFA"));
	elementCRMSFA.click();
	
			* 6	Click Leads link
			
			
	WebElement elementLeads = driver.findElement(By.linkText("Leads"));
	elementLeads.click();
	
			* 7	Click Find leads
					
    WebElement elementFindLeads = driver.findElement(By.linkText("Find Leads"));
	elementFindLeads.click();
	
			* 8	Enter first name
			
	WebElement elementFirstName =driver.findElement(By.id("ext-gen248"));
	elementFirstName.sendKeys("Karthi");
	
			* 9	Click Find leads button
			
			
	WebElement elementLeadsButton =driver.findElement(By.id("ext-gen334"));
	elementLeadsButton.click();
	
	Thread.sleep(5000);
	
			* 10 Click on first resulting lead
			
			
	List<WebElement> elementFirstResultingLeadrows =	driver.findElements(By.xpath("(//table)[21]/tbody/tr[1]"));
	
	List<WebElement> elementFirstResultingLeadcols =	driver.findElements(By.xpath("(//table)[21]/tbody/tr[1]/td[1]"));
	
	for(int i=1; i<=1; i++) {
		
		for(int j = 1; j<=elementFirstResultingLeadcols.size(); j++) {
		
		driver.findElement(By.linkText("10036")).click();	
		}
		
	}
	
			* 11 Verify title of the page
				
	System.out.println(driver.getTitle());
	
			* 12 Click Edit
				
	WebElement elementEdit = driver.findElement(By.linkText("Edit"));
	elementEdit.click();
	
			* 13 Change the company name
			
			
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	WebElement elementCompanyName =driver.findElement(By.id("updateLeadForm_companyName"));	
	elementCompanyName.sendKeys("TestLeaf Company Name");
	
			* 14 Click Update
			
			
	WebElement elementUpdate = driver.findElement(By.name("submitButton"));
	elementUpdate.click();
	
			* 15 Confirm the changed name appears
			
			
	WebElement elementUpdateCompanyName = driver.findElement(By.id("viewLead_companyName_sp"));
	String verify = elementUpdateCompanyName.getText();
	System.out.println(verify);	
	
			* 16 Close the browser (Do not log out)
			
			driver.quit();
			}

	private static WebElement findElement(By linkText) {
		// TODO Auto-generated method stub
		return null;

	}
			
*/
		
	
}	
