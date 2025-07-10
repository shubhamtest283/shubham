package seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class datepicker {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.yourdigitallift.com/fitness-center/login/");
	       
	       driver.findElement(By.name("username")).sendKeys("008550901146");
	       driver.findElement(By.name("password1")).sendKeys("fit123");
	       driver.findElement(By.xpath("/html/body/div/section/form/div[3]/input")).click();
	       
	       WebElement elementoHover = driver.findElement(By.xpath("//*[@id=\"top-nav\"]/ul/li[4]/a"));
	       Actions action = new Actions(driver);
	       action.moveToElement(elementoHover).perform();

	       driver.findElement(By.xpath("//*[@id=\"top-nav\"]/ul/li[4]/ul/li[1]/a")).click();
	       driver.findElement(By.xpath("//*[@id=\"id_customer_first_name\"]")).sendKeys("shubham");
	       driver.findElement(By.xpath("//*[@id=\"id_customer_last_name\"]")).sendKeys("patil");
	       driver.findElement(By.xpath("//*[@id=\"id_email\"]")).sendKeys("shubham@gmail.com");
	       driver.findElement(By.xpath("//*[@id=\"id_mobileNo\"]")).sendKeys("2523263632");
	       
	       driver.findElement(By.id("datetimepicker_dob")).click();

	        String expectedMonth = "August";
	        String expectedYear = "2024";
	        String expectedDay = "15";
	        
	        while (true) {
	            String currentMonth = driver.findElement(By.className("datepicker-switch")).getText(); // e.g., August 2025

	            if (currentMonth.contains(expectedMonth) && currentMonth.contains(expectedYear)) {
	                break;
	            } else {
	                driver.findElement(By.className("next")).click(); // forward button
	                Thread.sleep(500); // wait for animation
	            }
	        }
            
	        List<WebElement> allDays = driver.findElements(By.xpath("//td[@class='day' or contains(@class,'day')]"));

	        for (WebElement day : allDays) {
	            if (day.getText().equals(expectedDay)) {
	                day.click();
	                break;
	            }
	        }

	        System.out.println("✅ DOB selected: 15 August 2025");

	        Thread.sleep(2000);
	        driver.quit();
	}

}
