package tst;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.Mensalistas;

@RunWith(Parameterized.class)
public class TesteCadastraMensalista {
	private Mensalistas mensalistas;
	
	private String placas[];
	
	@Before
	public void setup() {
		mensalistas = new Mensalistas();
	}
	
	@Parameters
	public static Collection<Object[]> getParameters(){
		Object[][] parametros = new Object[][] {
			{new String[] {"ABC-1234", "ABC-4321"}},
			{new String[] {"ABC-1234", "ABC-4321", "CAB-4321"}}, 
			{new String[] {"ABC-1234", "ABC-4321", "CAB-4321", "CAB-1234"}}, 
		};
		
		return Arrays.asList(parametros);
	}
	
	public TesteCadastraMensalista(String strings[]) {
		this.placas = strings;
	}
	
	@Test
	@Category(TesteFuncional.class)
	public void cadastraMensalista() {
		for (int i = 0; i < placas.length-1; i++) {
			mensalistas.cadastraMensalista(placas[i]);
		}
		
		for (int i = 0; i < placas.length-1; i++) {
			assertTrue(mensalistas.ehMensalista(placas[i]));
		}
		
		assertFalse(mensalistas.ehMensalista(placas[placas.length-1]));
	}
}
