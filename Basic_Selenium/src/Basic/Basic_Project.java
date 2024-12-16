package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Basic_Project {

	public static void main(String[] args) throws InterruptedException {

				
				WebDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
		driver.get("https://rkm.kivio.in/");

		//UserName
		driver.findElement(By.id("username")).sendKeys("sagarmajhi");

		//Password
		driver.findElement(By.id("password")).sendKeys("password");

		//wait
		Thread.sleep(2000);

		//Sign In Button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/form/button")).click();
		Thread.sleep(1000);

		//Donations
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]")).click();

		//driver.findElement(By.className("active"));
		//step 1: decide list box to handle &store in ref variable
		Thread.sleep(1000);

		WebElement sidebar = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/a[2]"));
		driver.findElement(By.className("active"));

		//step 2: Create an object of select class & pass ref element
		Select s = new Select(sidebar);

		//step 3: use select object & call any of 3 method as per need
		Thread.sleep(1000);
		s.selectByValue("/newDonation");
		Thread.sleep(2000);
		s.selectByVisibleText("Donations");
		s.selectByIndex(2);

		Thread.sleep(2000);

		//steps to take actions using Action class(Mouse actions)
		//1. Create an object of action class & pass driver object

		//Actions act = new Actions(driver);

		//2. By using actions class object, we can click
		//WebElement DonationButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/a[2]"));

		//how to click using action class
		//DonationButton.click();
		//act.click(DonationButton).perform();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/a[2]")).click();

		//details
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div[3]/div[1]/div[1]/div[2]/div[1]/div/select")).click();
		Thread.sleep(1000);




	}

}
