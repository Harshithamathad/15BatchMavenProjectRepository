package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CallingPOMPF {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		OperationLoginOHM loginOHM=new OperationLoginOHM(driver);
		LogoutUsingPageFactory logoutPF=new LogoutUsingPageFactory(driver);
		loginOHM.loginProcess("Admin", "admin123");
		logoutPF.userProfile();
		logoutPF.logoutProcess();
	}
}


