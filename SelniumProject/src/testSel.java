import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testSel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rashrit\\Documents\\New_Java\\browserDriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://newqap.consumersenergy.com/login");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout("2000", unit.seconds)
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.findElement(By.id("userNameLoginBlock")).sendKeys("test");
		System.out.println (driver.findElement(By.id("userNameLoginBlock")).getAttribute("class"));
		//driver.findElement(By.id("createProfile")).click();
		/*List<WebElement> l1 = driver.findElements(By.tagName("a"));
		
		for (int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i).getText());
		}*/
		driver.findElement(By.linkText("Forgot User ID")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("userEmail")).sendKeys("rashrit@cmsenergy.com");
			
		//driver.quit();
	

	}

}
