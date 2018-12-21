package br.com.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.steps.CadastrarStepsTest;
import br.com.steps.LoginStepsTest;

@RunWith(Suite.class)
@SuiteClasses({CadastrarStepsTest.class, LoginStepsTest.class})
public class Runner {
		
}
