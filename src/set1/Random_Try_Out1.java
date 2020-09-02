package set1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Random_Try_Out1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\DEV\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		WebElement from=driver.findElement(By.id("fromPlaceName"));
		from.sendKeys("BAN");
		Thread.sleep(3000);
		//List<WebElement> depart=driver.findElements(By.cssSelector(".ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all"));
		//List<WebElement> depart=driver.findElements(By.cssSelector(".ui-menu-item"));
		//[class='ui-menu-item'] a
		List<WebElement> depart=driver.findElements(By.cssSelector("[class='ui-menu-item'] a"));
	    for(WebElement departs:depart)
	    {
	    	System.out.println(departs.getText());
	    	if(departs.getText().contains("INTER"))
	    		departs.click();
	    	//else
	    		//System.out.println("404");
	    }
	    }
		
		//iteartor itself not needed, if there are cond like nested for may be we can use iterator.. but research
		/*Iterator<WebElement> i=depart.iterator();
	    System.out.println(depart.size());
	    if(i.hasNext())
	    {
	    	String Text=i.next().getText();
	    	//System.out.println(Text);
	    	if(Text.contains("RTI"))
	    	{
	    		System.out.println(Text);
	    	}
	    	else
	    		System.out.println("wrong");
	    	
	    }
	    else
	    	System.out.println("big if not working");
	}*/

}
