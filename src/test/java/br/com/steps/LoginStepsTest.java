package br.com.steps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import br.com.pages.LoginPage;
import br.com.suporte.Web;

public class LoginStepsTest {
	private WebDriver navegador;
	
	@Before
	public void before() {
		navegador = Web.criarNavegador();
	}
	
	@Test
	public void loginValido() {
		new LoginPage(navegador)
					.realizarLogin("jhonatas11-teste@teste.com", "teste123");
	}
	
	@After
	public void tearDown() {
		navegador.quit();
	}
}
