package automationFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class updated_dropdown {
	public static void main(String args[]) throws InterruptedException
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(1000);
	int i=0;
	while(i<5)
	{
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
	}
	driver.findElement(By.id("btnclosepaxoption")).click();
	
}
}
