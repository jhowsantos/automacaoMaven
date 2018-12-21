package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver navegador) {
		super(navegador);
	}

	public LoginPage irParaLogin() {
		navegador.findElement(By.linkText("Sign in")).click();
		
		return this;
	}
	
	public LoginPage preencherEmail(String email) {
		navegador.findElement(By.id("email")).click();
		navegador.findElement(By.id("email")).sendKeys(email);
		
		return this;
	}
	
	public LoginPage preencherSenha(String senha) {
		navegador.findElement(By.id("passwd")).click();
		navegador.findElement(By.id("passwd")).sendKeys(senha);
		
		return this;
	}
	
	public MyHomePage clicarSignIn() {
		navegador.findElement(By.id("SubmitLogin")).click();
		
		return new MyHomePage(navegador);
	}
	
	public void validarLoginComSucesso() {
		String nomeUsuario = navegador.findElement(By.linkText("Jhonatas Matos")).getText();
		
		Assert.assertEquals("Jhonatas Matos", nomeUsuario);
	}
	
	public MyHomePage realizarLogin(String email, String senha) {
		irParaLogin();
		preencherEmail(email);
		preencherSenha(senha);
		clicarSignIn();
		
		validarLoginComSucesso();
		
		return new MyHomePage(navegador);
	}
}
