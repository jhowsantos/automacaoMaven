package br.com.basepage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CadastrarPage{
	public WebDriver driver;
	private FluentWait<WebDriver> wait; 
	
	public void irParaCriarConta() {
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email_create")).sendKeys("jhonatas05-teste@teste.com");		
		driver.findElement(By.id("SubmitCreate")).click();
	}

	public void setUp() {
		// Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        // Navegando para a página de automação
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
	}
	
	public void selecionarRadioMr() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_gender1")));
		driver.findElement(By.id("id_gender1")).click();
	}

	public void preencherNome(){
		driver.findElement(By.id("customer_firstname")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Jhonatas");
		
	}

	public void preencherSobreNome() {
		driver.findElement(By.id("customer_firstname")).click();
		driver.findElement(By.id("customer_lastname")).sendKeys("Matos");
		
	}
	
	public void preencherEmailCadastro() {
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("jhonatas05-teste@teste.com");
	}

	public void preencherSenha() {
		driver.findElement(By.id("customer_firstname")).click();
		driver.findElement(By.id("passwd")).sendKeys("teste123");
	}

	public void preencherDataNascimento() {
		driver.findElement(By.id("days")).sendKeys("20");
		driver.findElement(By.id("months")).sendKeys("October");
		driver.findElement(By.id("years")).sendKeys("1993");
	}

	public void clicarNosCheckbox() {
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
	}

	public void preencherPrimeiroNome() {
		driver.findElement(By.id("firstname")).sendKeys("Jhonatas");
	}

	public void preencherSegundoNome() {
		driver.findElement(By.id("lastname")).sendKeys("Matos");
	}

	public void preencherEmpresa() {
		driver.findElement(By.id("company")).sendKeys("Yaman");
	}

	public void preencherEndereco() {
		driver.findElement(By.id("address1")).sendKeys("Rua Piedade");
	}

	public void preencherEndereco2() {
		driver.findElement(By.id("address2")).sendKeys("Dos anjos");
	}

	public void preencherCidade() {
		driver.findElement(By.id("city")).sendKeys("Cotia");
	}

	public void selecionarEstado() {
		driver.findElement(By.id("id_state")).click();
		driver.findElement(By.id("id_state")).sendKeys("Alabama");
	}

	public void preencherCodigoPostal() {
		driver.findElement(By.id("postcode")).sendKeys("12345");
	}

	public void selecionarPais() {
		driver.findElement(By.id("id_country")).click();
		driver.findElement(By.id("id_country")).sendKeys("United States");
	}

	public void preencherInformacaoAdicional() {
		driver.findElement(By.id("other")).sendKeys("Cdastro teste");
	}

	public void preencherTelefoneFixo() {
		driver.findElement(By.id("phone")).sendKeys("41410000");
	}

	public void preencherTelefoneCelular() {
		driver.findElement(By.id("phone_mobile")).sendKeys("9998888");
	}

	public void referenciaFutura() {
		driver.findElement(By.id("alias")).sendKeys("my adress teste");
	}

	public void clicarRegistrar() {
		driver.findElement(By.id("submitAccount")).click();
	}
	
	public void validarCadastro() {
		String signOut = driver.findElement(By.linkText("Sign out")).getText();
		Assert.assertEquals("Sign out", signOut);
	}
	
}
