package set1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void lucky(WebDriver c)
	{
		c.findElement(By.cssSelector(".SDkEP")).sendKeys("lucky");
		//[class='FPdoLc tfB0Bf'] input:nth-child(1)
		
		//c.findElement(By.className("gNO89b")).click();
		//INTERACTION WITH FEELING LUCKY BUTTON USING CLASS NAME IS NOT WORKING
		//body.hp.vasq.big:nth-child(2) div.ctr-p:nth-child(3) div.jhp.big:nth-child(3) form.tsf.nj:nth-child(4) div:nth-child(2) div.A8SBwf:nth-child(1) div.FPdoLc.tfB0Bf:nth-child(4) center:nth-child(1) > input.RNmpXc
		//c.findElement(By.cssSelector(".RNmpXc")).click();
		//c.findElement(By.cssSelector("body.hp.vasq.big:nth-child(2) div.ctr-p:nth-child(3) div.jhp.big:nth-child(3) form.tsf.nj:nth-child(4) div:nth-child(2) div.A8SBwf:nth-child(1) div.FPdoLc.tfB0Bf:nth-child(4) center:nth-child(1) > input.RNmpXc")).click();
		///html[1]/body[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[3]/center[1]/input[2]
		//c.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[3]/center[1]/input[2]")).click();
		//c.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("gggg");
		//c.findElement(By.cssSelector(".gNO89b")).click();
		/*c.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[3]/center/input[2]")).click();
		//c.findElement(By.className("RNmpXc")).click();
			if(c.findElement(By.id("latest-tag")).getText().contains("25"))
System.out.println(c.findElement(By.id("latest-title")).getText());
			else
			System.out.println("nothing today");*/
	}
	
	public static void google_searchbox_click_list(WebDriver c) {
		
		c.findElement(By.cssSelector(".RNNXgb")).click();
		List<WebElement> trends=c.findElements(By.cssSelector("[class='sbl1'] span"));
		for(WebElement trend:trends)
		{
		System.out.println(trend.getText());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\DEV\\chromedriver.exe");
		WebDriver c=new ChromeDriver();
		c.get("https://www.google.co.in");
		//if declared static
		lucky(c);
		//google_searchbox_click_list(c);
		//if method is not declared static
		//Google g=new Google();
		//g.lucky(c);
			
		
	}

}
