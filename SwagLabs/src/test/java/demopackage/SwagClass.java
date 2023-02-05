package demopackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.className("shopping_cart_link")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Nadia");
		driver.findElement(By.id("last-name")).sendKeys("Golam");
		driver.findElement(By.id("postal-code")).sendKeys("1211");
		Thread.sleep(3000);
		driver.findElement(By.name("continue")).click();
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.id("finish")).click();
		driver.findElement(By.xpath("//*[@id='finish']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.id("back-to-products")).click();
		driver.findElement(By.xpath("//button[@name='back-to-products']")).click();
		Thread.sleep(5000);
		
		//Thread.sleep(10000);
		
		driver.close(); 

	}

}
