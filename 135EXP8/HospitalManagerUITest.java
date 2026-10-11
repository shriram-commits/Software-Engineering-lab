import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class HospitalManagerUITest
{
static webDriver driver;
public static void setup()
{
System.setProperty("webdriver.chrome.driver","path/to/chromedriver");
driver=new ChromeDriver();
}
public void openHMSPage(){
driver.get("http://localhost:8080/hms");
}
public void testAddPatient() throws interruptedException
{
WebElement nameField=driver.findElement(By.id("name"));
WebElement ageField=driver.findElement(By.id("age"));
WebElement diseaseField=driver.findElement(By.id("disease"));
WebElement submitButton=driver.findElement(By.id("submit"));
nameField.sendKeys("john");
ageField.sendKeys("30");
diseaseField.sendkeys("flu");
sumbitButton.click();
Thread.sleep(1000);
WebElement count=driver.findElement(By.id("patientCount"));
assertTrue(count.getText().contains("1");
}
public static void tearDown()
{
if(driver !=null)
{
driver.quit();
}
}
}

