package br.esfinge.teste.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.esfinge.teste.integracao.daos.AreaDAOTest;
import br.esfinge.teste.integracao.daos.AssuntoDAOTest;
import br.esfinge.teste.integracao.daos.ConviteDAOTest;
import br.esfinge.teste.integracao.daos.DisciplinaDAOTest;
import br.esfinge.teste.integracao.daos.PerfilDAOTest;
import br.esfinge.teste.integracao.daos.ResumoDAOTest;
import br.esfinge.teste.integracao.daos.UsuarioDAOTest;

@RunWith(Suite.class)
@SuiteClasses({AreaDAOTest.class,
			   AssuntoDAOTest.class,
			   ConviteDAOTest.class,
			   DisciplinaDAOTest.class,
			   PerfilDAOTest.class,
			   ResumoDAOTest.class,
			   UsuarioDAOTest.class})
public class SuiteTestesIntegracaoDados {

}
