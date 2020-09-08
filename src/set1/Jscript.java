package set1;
//java executor
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;
	

public class Jscript {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\DEV\\chromedriver.exe");
		WebDriver c=new ChromeDriver();
		c.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		c.get("https://ksrtc.in/oprs-web/");
		JavascriptExecutor js=(JavascriptExecutor)c;
		String script="return document.getElementById(\"fromPlaceName\").value;";
		//this statment writes an object
		Object text=js.executeScript(script);
		System.out.println(text);
	}

}
