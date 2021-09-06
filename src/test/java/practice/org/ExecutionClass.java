package practice.org;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExecutionClass extends BaseClass {

	public static void main(String[] args) throws IOException {
		
	browserLaunch("Chrome");
	
	launchUrl("https://www.annauniv.edu/#");
	
    screenshot("annauniv");
    
    launchUrl("https://www.amazon.in/");
    
    
    screenshot("amazon");
    
    launchUrl("https://www.flipkart.com/");
    
    screenshot("flipkart");
	
	getCurrentUrl();
	
	getTitle();
		
   
	}

}
