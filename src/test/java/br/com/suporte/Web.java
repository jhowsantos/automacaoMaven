package br.com.suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
	public static WebDriver criarNavegador(){
		// Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jhow\\drivers\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();

        // Navegando para a página de automação
		navegador.get("http://automationpractice.com/index.php");
		navegador.manage().window().maximize();
        
        return navegador;
	}
}
