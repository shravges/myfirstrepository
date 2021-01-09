package AutomationFramework;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;



public class MyTestFile {
	
	@Test
	public void launchWeb()
	{
		try
		{
		System.out.println("Hello Shilpa. You are doing good.");
		System.out.println("Keep it up!");
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.google.com";
        
        driver.get(baseUrl);
        driver.manage().window().maximize();
        Thread.sleep(5000);
        
        //driver.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

//	public static void main(String[] args) 
//	{
//		MyTestFile tf= new MyTestFile();
//		tf.launchWeb();
//
//	}

}

