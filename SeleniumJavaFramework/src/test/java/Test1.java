import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
	
	public static void main(String args[]) {
		
		String projectPath = System.getProperty("user.dir");
		//System.setProperty("webdriver.gecko.driver", projectPath+"\\Web drivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Web drivers\\chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		driver.close();
		
	}

}
