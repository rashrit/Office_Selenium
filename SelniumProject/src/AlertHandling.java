import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\rashrit\\Documents\\New_Java\\LocalGIT\\SelniumProject\\src\\config.properties");
			prop.load(ip);
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rashrit\\Documents\\New_Java\\browserDriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://newqap.consumersenergy.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout("2000", unit.seconds)
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[@class='pl-login-ornage-box']")).click();
		
		
		Alert al = driver.switchTo().alert();
		
		String alertMessage = al.getText();
		
		al.accept();
	}

}
