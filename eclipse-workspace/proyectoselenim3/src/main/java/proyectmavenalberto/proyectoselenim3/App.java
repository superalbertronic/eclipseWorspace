package proyectmavenalberto.proyectoselenim3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**

 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        try {
        	System.setProperty("webdriver.gecko.driver.exe", "/geckodriver/geckodriver.exe"); //llamamos al fichero geckodrive
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.facebook.com/");
            driver.findElement(By.id("email")).sendKeys("superalbertron@gmail.com"); //indicamos nuestra cuenta
            driver.findElement(By.id("pass")).sendKeys(""); //indicamos nuestra clave
            driver.findElement(By.id("u_0_b")).click();
            System.out.println("abierto Facebook");
            driver.quit();
          } catch (Exception e) {
              System.out.println("Ocurrió un error: " + e.getMessage());
          }

    
    
    }
}
