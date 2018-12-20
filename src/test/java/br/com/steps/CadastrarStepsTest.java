package br.com.steps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import br.com.basepage.CadastrarPage;

public class CadastrarStepsTest extends CadastrarPage {
	
	@Before
	public void before() {
		setUp();
	}
	
	@Test
	public void cadastrarUsuario() throws Exception {

		irParaCriarConta();
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
	}
	
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
