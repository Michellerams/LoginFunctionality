import java.io.File;
import java.io.IOException;
import com.google.common.io.Files;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
public class Login {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://sisekelo.co.za/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#basic-navbar-nav > span > a > button > span\r\n")).click();
		driver.findElement(By.name("username")).sendKeys("VuSizani");
		driver.findElement(By.cssSelector("#root > div.MuiBox-root.css-igg69k > div > section:nth-child(3) > div > section > div.container > div > div > div > div.sign__form > form > button")).click();
		driver.findElement(By.name("password")).sendKeys("[Vusi@23Admin1");
		driver.findElement(By.cssSelector("#root > div.MuiBox-root.css-igg69k > div > section:nth-child(3) > div > section > div.container > div > div > div > div.sign__form > form > button")).click();
		driver.getTitle();
		File Scr1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(Scr1, new File("C:\\Users\\bontl\\Downloads\\Screenshot1.jpg"));
		
		driver.close();
	}

}
