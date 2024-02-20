package proyectmavenalberto.mavenselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//previamente debemos configurar el fichero pom.xml añadiendo las dependencias.
public class Main {
    public static void main(String[] args) {
      try {
    	System.setProperty("webdriver.gecko.driver", "/geckodriver/geckodriver.exe"); //llamamos al fichero geckodrive
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("micuenta@gmail.com"); //indicamos nuestra cuenta
        driver.findElement(By.id("pass")).sendKeys("11111112"); //indicamos nuestra clave
        driver.findElement(By.id("loginbutton")).click();
        System.out.println("abierto Facebook");
        driver.quit();
      } catch (Exception e) {
          System.out.println("Ocurrió un error: " + e.getMessage());
      }
    }
}
