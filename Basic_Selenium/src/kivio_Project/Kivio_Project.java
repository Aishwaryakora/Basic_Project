package kivio_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;

public class Kivio_Project {


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
 //Name of Donar
		
		//By using DropDown 
     WebElement W = driver.findElement(By.xpath("//*[@id=\"donations-container\"]/div[3]/div[1]/div[1]/div[2]/div[1]/div/select"));
     Select dropdown = new Select(W);
     dropdown.selectByIndex(7);
		
     Thread.sleep(1000);

//Name of Donar
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Aishwarya");
		
//Phone No
	driver.findElement(By.xpath("//*[@id=\"donations-container\"]/div[3]/div[1]/div[1]/div[2]/div[2]/div/div/input")).sendKeys("9134567890");

//Initiation / Mantra Diksha from
	driver.findElement(By.xpath("//*[@id=\"donations-container\"]/div[3]/div[1]/div[1]/div[2]/div[3]/div")).click();


	driver.findElement(By.xpath("//*[@id=\"donations-container\"]/div[3]/div[1]/div[1]/div[2]/div[3]/div/div[2]/input")).sendKeys("Srimat Swami Divyanandaji Maharaj");

	driver.findElement(By.xpath("//*[@id=\"donations-container\"]/div[3]/div[1]/div[1]/div[2]/div[3]/div/div[2]/div")).click();

	Thread.sleep(1000);
		
//Email ID
		driver.findElement(By.xpath("//*[@id=\"donations-container\"]/div[3]/div[1]/div[1]/div[3]/div[1]/input")).sendKeys("sagar@gmail.com");
		
//Identity Proof
		driver.findElement(By.xpath("//*[@id=\"donations-container\"]/div[3]/div[1]/div[1]/div[3]/div[2]/div/select")).click();
		
		driver.findElement(By.xpath("//*[@id=\"donations-container\"]/div[3]/div[1]/div[1]/div[3]/div[2]/div/input")).sendKeys("123456789123");

//Guest House Room No.
		driver.findElement(By.xpath("//*[@id=\"donations-container\"]/div[3]/div[1]/div[1]/div[3]/div[3]/input")).sendKeys("123");
		
//Pincode
		driver.findElement(By.xpath("//*[@id=\"donations-container\"]/div[3]/div[1]/div[1]/div[4]/div[1]/input")).sendKeys("560010");
		
//State
		driver.findElement(By.xpath("//*[@id=\"donations-container\"]/div[3]/div[1]/div[1]/div[4]/div[2]/input")).sendKeys("Karnataka");
		
//District
		driver.findElement(By.xpath("//*[@id=\"donations-container\"]/div[3]/div[1]/div[1]/div[4]/div[3]/input")).sendKeys("Bangalore");
	
//Flat / House / Apartment No
		driver.findElement(By.xpath("//*[@id=\"donations-container\"]/div[3]/div[1]/div[1]/div[5]/div[1]/input")).sendKeys("PG,12");
		
//Street Name / Landmark
		driver.findElement(By.xpath("//*[@id=\"donations-container\"]/div[3]/div[1]/div[1]/div[5]/div[2]/input")).sendKeys("Rajijinagar");
		
		
//Donations Details
		WebElement W2 = driver.findElement(By.xpath("//*[@id=\"donations-container\"]/div[3]/div[2]/div/div[1]/select"));
	     Select s = new Select(W2);
	     s.selectByIndex(5);
	     
//Donation Amount
	     driver.findElement(By.xpath("//*[@id=\"donations-container\"]/div[3]/div[2]/div/div[3]/input")).sendKeys("1000");
	     
//Transaction Type
	     WebElement W3 = driver.findElement(By.xpath("//*[@id=\"donations-container\"]/div[3]/div[2]/div/div[4]/select"));
	     Select s1 = new Select(W3);
	     s1.selectByIndex(0);
	     
	    Thread.sleep(1000);
     
	
//In Memory of
	    driver.findElement(By.xpath("//*[@id=\"donations-container\"]/div[3]/div[2]/div/div[5]/input")).sendKeys("I have done cash payment");
	    
	   
	   Thread.sleep(2000);

	   //Closing Application	   
	   driver.close();
	    
	    
	}

}
