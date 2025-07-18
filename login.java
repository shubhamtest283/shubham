package seleniumtest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.yourdigitallift.com/fitness-center/login/");
        driver.manage().window().maximize();
        
        
        driver.findElement(By.xpath("/html/body/div/section/form/div[1]/input")).sendKeys("7150871508");
        driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("Sandhya1");
        driver.findElement(By.xpath("/html/body/div/section/form/div[3]/input")).click();
        
        String pagesource = driver.getPageSource();
        System.out.println(pagesource);
        if(pagesource.toLowerCase().contains("The password that you've entered is incorrect.")) {
        	System.out.println("invalid login: invalid credentials");
        }
        else {
        	System.out.println("login successfull");
        }
	}

}
