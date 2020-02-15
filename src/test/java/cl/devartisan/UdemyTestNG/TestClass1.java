package cl.devartisan.UdemyTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {

	public static WebDriver driver;
	
	@BeforeMethod
	public void LaunchDriver() {
		System.out.println("Iniciando Test");
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Driver creado");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().window().fullscreen();
		System.out.println("After fullscreen");
		//driver.get("https://www.devartisan.cl/");
	}
	
	@Test
	public void Test1() {
		System.out.println("Iniciando Test 1");
		driver.navigate().to("https://www.google.com/");
		System.out.println("Fin Test 1");
	}
	
	@Test
	public void Test2() {
		System.out.println("Iniciando Test 2");
		driver.navigate().to("https://www.devartisan.cl/");
		System.out.println("Fin Test 2");
	}
	
	@AfterMethod
	public void Quit() {
		System.out.println("Iniciando Quit");
		driver.quit();
		System.out.println("Fin");
		//if test fail create isue in Jira
	}
}
