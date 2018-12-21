package br.com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CadastrarPage extends BasePage {
	private FluentWait<WebDriver> wait; 
	
	public CadastrarPage(WebDriver navegador) {
		super(navegador);
	}
	
	public CadastrarPage irParaCriarConta() {
		navegador.findElement(By.linkText("Sign in")).click();
		navegador.findElement(By.id("email_create")).sendKeys("jhonatas09-teste@teste.com");		
		navegador.findElement(By.id("SubmitCreate")).click();
		
		return new CadastrarPage(navegador);
	}
	
	public CadastrarPage selecionarRadioMr() {
		WebDriverWait wait = new WebDriverWait(navegador, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_gender1")));
		navegador.findElement(By.id("id_gender1")).click();
		
		return this;
	}

	public CadastrarPage preencherNome(){
		navegador.findElement(By.id("customer_firstname")).click();
		navegador.findElement(By.id("customer_firstname")).sendKeys("Jhonatas");
		
		return this;
	}

	public CadastrarPage preencherSobreNome() {
		navegador.findElement(By.id("customer_firstname")).click();
		navegador.findElement(By.id("customer_lastname")).sendKeys("Matos");
		
		return this;
	}
	
	public CadastrarPage preencherEmailCadastro() {
		navegador.findElement(By.id("email")).click();
		navegador.findElement(By.id("email")).clear();
		navegador.findElement(By.id("email")).sendKeys("jhonatas09-teste@teste.com");
		
		return this;
	}

	public CadastrarPage preencherSenha() {
		navegador.findElement(By.id("customer_firstname")).click();
		navegador.findElement(By.id("passwd")).sendKeys("teste123");
		
		return this;
	}

	public CadastrarPage preencherDataNascimento() {
		navegador.findElement(By.id("days")).sendKeys("20");
		navegador.findElement(By.id("months")).sendKeys("October");
		navegador.findElement(By.id("years")).sendKeys("1993");
		
		return this;
	}

	public CadastrarPage clicarNosCheckbox() {
		navegador.findElement(By.id("newsletter")).click();
		navegador.findElement(By.id("optin")).click();
		
		return this;
	}

	public CadastrarPage preencherPrimeiroNome() {
		navegador.findElement(By.id("firstname")).sendKeys("Jhonatas");
		
		return this;
	}

	public CadastrarPage preencherSegundoNome() {
		navegador.findElement(By.id("lastname")).sendKeys("Matos");
		
		return this;
	}

	public CadastrarPage preencherEmpresa() {
		navegador.findElement(By.id("company")).sendKeys("Yaman");
		
		return this;
	}

	public CadastrarPage preencherEndereco() {
		navegador.findElement(By.id("address1")).sendKeys("Rua Piedade");
		
		return this;
	}

	public CadastrarPage preencherEndereco2() {
		navegador.findElement(By.id("address2")).sendKeys("Dos anjos");
		
		return this;
	}

	public CadastrarPage preencherCidade() {
		navegador.findElement(By.id("city")).sendKeys("Cotia");
		
		return this;
	}

	public CadastrarPage selecionarEstado() {
		navegador.findElement(By.id("id_state")).click();
		navegador.findElement(By.id("id_state")).sendKeys("Alabama");
		
		return this;
	}

	public CadastrarPage preencherCodigoPostal() {
		navegador.findElement(By.id("postcode")).sendKeys("12345");
		
		return this;
	}

	public CadastrarPage selecionarPais() {
		navegador.findElement(By.id("id_country")).click();
		navegador.findElement(By.id("id_country")).sendKeys("United States");
		
		return this;
	}

	public CadastrarPage preencherInformacaoAdicional() {
		navegador.findElement(By.id("other")).sendKeys("Cdastro teste");
		
		return this;
	}

	public CadastrarPage preencherTelefoneFixo() {
		navegador.findElement(By.id("phone")).sendKeys("41410000");
		
		return this;
	}

	public CadastrarPage preencherTelefoneCelular() {
		navegador.findElement(By.id("phone_mobile")).sendKeys("9998888");
		
		return this;
	}

	public CadastrarPage referenciaFutura() {
		navegador.findElement(By.id("alias")).sendKeys("my adress teste");
		
		return this;
	}

	public CadastrarPage clicarRegistrar() {
		navegador.findElement(By.id("submitAccount")).click();
		
		return this;
	}
	
	public CadastrarPage criarCadastro(){
		
		selecionarRadioMr();
		preencherNome();
		preencherSobreNome();
		preencherEmailCadastro();
		preencherSenha();
		preencherDataNascimento();
		clicarNosCheckbox();
		preencherPrimeiroNome();
		preencherSegundoNome();
		preencherEmpresa();
		preencherEndereco();	
		preencherEndereco2();
		preencherCidade();
		selecionarEstado();
		preencherCodigoPostal();
		selecionarPais();
		preencherInformacaoAdicional();
		preencherTelefoneFixo();
		preencherTelefoneCelular();
		referenciaFutura();
		clicarRegistrar();
		validarCadastro();
		
		return this;
	}
	
	public void validarCadastro() {
		String signOut = navegador.findElement(By.linkText("Sign out")).getText();
		Assert.assertEquals("Sign out", signOut);
	}
	
}
