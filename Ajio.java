package week3.day2.assignments.completed;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String url = "https://www.ajio.com/";
		driver.get(url);
		
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();		
		
				
		String totalItems = driver.findElement(By.className("length")).getText();
		System.out.println(totalItems);
		
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		System.out.println("Size : " + bagBrandList.size());
		
		for (WebElement webElement : bagBrandList) {
			
			String brandNames = webElement.getText();
			
			System.out.println(brandNames);
			
		}
		

	}

}
