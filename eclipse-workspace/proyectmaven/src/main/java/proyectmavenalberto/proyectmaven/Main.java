package proyectmavenalberto.proyectmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {
      try {
    	System.setProperty("webdriver.gecko.driver", "/geckodriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        System.out.println("Página web abierta");
        driver.quit();
      } catch (Exception e) {
          System.out.println("Ocurrió un error: " + e.getMessage());
      }
    }
}
