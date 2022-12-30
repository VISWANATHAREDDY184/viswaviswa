package tutorialninja;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoMaven {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("http://www.tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Navigate Login page
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		
		Thread.sleep(3000);
		
		//Login
		
		
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("viswa.praveena2021@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Viswa@123");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
		System.out.println(driver.findElement(By.xpath("//body/div[@id='account-account']/ul[1]/li[2]/a[1]")).isDisplayed());
		
		//Searching for Iphone
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("iPhone");
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[1]/span[1]/button[1]")).click();
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'iPhone')]")).isDisplayed());
		
		//Clcicking the iphone
		driver.findElement(By.xpath("//div[@class='caption']//a[contains(text(),'iPhone')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println(driver.findElement(By.xpath("//div[@class='caption']//a[contains(text(),'iPhone')]")).isDisplayed());
		
		
		
		driver.findElement(By.xpath("//input[@id='input-quantity']")).clear();
		
		driver.findElement(By.id("input-quantity"));
		
		
		
		
		
		
		
		
		//quanity.clear();
		//quanity.sendKeys("3");
		
		
		
		//System.out.println(driver.findElement(By.xpath("//body/div[@id='product-product']/div[1]")).getText());

	}

}
