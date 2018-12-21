package br.com.steps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import br.com.pages.CadastrarPage;
import br.com.suporte.Web;

public class CadastrarStepsTest {

	private WebDriver navegador;

	@Before
	public void before() {
		navegador = Web.criarNavegador();
	}

	@Test
	public void cadastrarUsuario() {
					
					//Abordagem Funcional
		new CadastrarPage(navegador).
					irParaCriarConta(). 
					criarCadastro().
					validarCadastro();
		
					//Abordagem Estrutural
					/*
					irParaCriarConta().
					selecionarRadioMr().
					preencherNome().
					preencherSobreNome().
					preencherEmailCadastro().
					preencherSenha().
					preencherDataNascimento().
					clicarNosCheckbox().
					preencherPrimeiroNome().
					preencherSegundoNome().
					preencherEmpresa().
					preencherEndereco().	
					preencherEndereco2().
					preencherCidade().
					selecionarEstado().
					preencherCodigoPostal().
					selecionarPais().
					preencherInformacaoAdicional().
					preencherTelefoneFixo().
					preencherTelefoneCelular().
					referenciaFutura().
					clicarRegistrar().
					validarCadastro();
					*/
	}

	@After
	public void tearDown() {
		navegador.quit();
	}
}
