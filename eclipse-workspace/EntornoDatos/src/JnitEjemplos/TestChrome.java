package JnitEjemplos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChrome {

    public static void main(String[] args) {
        // Establecer la ruta del controlador del navegador
    	System.setProperty("webdriver.chrome.driver", "C:/Users/Alberto/eclipse-workspace/EntornoDatos/src/entornoDatos/chromedriver");
        // Crear una nueva instancia del controlador del navegador
        WebDriver driver = new ChromeDriver();
        // Navegar a la página web deseada
        driver.get("https://www.example.com");
        // Obtener el título de la página
        String title = driver.getTitle();
        // Imprimir el título de la página
        System.out.println("Page title: " + title);
        // Cerrar la ventana del navegador
        driver.quit();
    }
}