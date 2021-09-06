package practice.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Executionfordropdown extends BaseClass{
	
	public static void main(String[] args) throws Exception {
		
		browserLaunch("Chrome");
		
		launchUrl("https://www.facebook.com/");
		
		currentWindow();
		
		WebElement signUp = driver.findElement(By.xpath("//*[contains(text(),'புதிய கணக்கை உருவாக்கு')]"));
		
		signUp.click();
		
		Thread.sleep(5000);
		
		WebElement firstName = driver.findElement(By.xpath("//*[@placeholder='முதற்பெயர்']"));
		
		Thread.sleep(5000);
		
		 firstName.sendKeys("Syed");
		 
		 Thread.sleep(5000);
		
         WebElement lastName = driver.findElement(By.xpath("//*[@aria-label='கடைசி பெயர்']"));
         
         lastName.sendKeys("Syed");
         
         Thread.sleep(5000);
			
         WebElement emailMobile = driver.findElement(By.xpath("//*[@aria-label='மொபைல் எண்/மின்னஞ்சல்']"));
         
         emailMobile.sendKeys("98765643210");
         

         WebElement userName = driver.findElement(By.xpath("//*[@aria-label='புதிய கடவுச்சொல்']"));
         
         userName.sendKeys("syed");
         
         WebElement date = driver.findElement(By.xpath("//*[@title='நாள்']"));
         
         dropDown(date,"28");
         
         WebElement month = driver.findElement(By.xpath("//*[@title='மாதம்']"));
         
         
         dropDown(month,"ஏப்.");       
         
         WebElement year = driver.findElement(By.xpath("//*[@title='ஆண்டு']"));
         
         dropDown(year,"1990"); 

	}

}
