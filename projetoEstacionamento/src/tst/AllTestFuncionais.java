package tst;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Categories.class)
@Categories.IncludeCategory(TesteFuncional.class)
@SuiteClasses({ CadastroAcessoHoraCheiaTeste.class, CadastroDiariaDiurnaTest.class, CadastroDiariaNoturnaTeste.class,
		TesteAcessaEvento.class, TesteCadastraEstacionamento.class, TesteCadastraEvento.class,
		TesteCadastraMensalista.class })
public class AllTestFuncionais {

}
