package br.esfinge.teste.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({SuiteTestesIntegracao.class,
			   SuiteTestesUnitarios.class})
public class SuiteTestes {

}