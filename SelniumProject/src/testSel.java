import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testSel {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		
		Properties prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\rashrit\\Documents\\New_Java\\LocalGIT\\SelniumProject\\src\\config.properties");
			prop.load(ip);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rashrit\\Documents\\New_Java\\browserDriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout("2000", unit.seconds)
		Thread.sleep(5000);
		driver.get("https://newqap.consumersenergy.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath(prop.getProperty("LoginButton"))).click();
		driver.findElement(By.xpath(prop.getProperty("UserID"))).sendKeys("bpe4q_1000907660");
		driver.findElement(By.xpath(prop.getProperty("Password"))).sendKeys("testuser1");
		boolean f;
		f = driver.findElement(By.xpath(prop.getProperty("SaveUserIDCheck"))).isEnabled();
		if (f) {
			driver.findElement(By.xpath(prop.getProperty("SaveUserIDCheck"))).click();
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("LoginSubmitButton"))).click();
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("PersonalInformationLink"))).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty("AddPhoneNumberLink"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("AddPhoneNumberPopupEdit"))).sendKeys("2019934479");
		driver.findElement(By.xpath(prop.getProperty("AddPhoneNumberSaveButton"))).click();
		/* System.out.println (driver.findElement(By.id("userNameLoginBlock")).getAttribute("class"));
		driver.findElement(By.id("createProfile")).click();
		List<WebElement> l1 = driver.findElements(By.tagName("a"));
		
		for (int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i).getText());
		}
		driver.findElement(By.linkText("Forgot User ID")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("userEmail")).sendKeys("rashrit@cmsenergy.com");*/
			
		//driver.quit();
	

	}

}
