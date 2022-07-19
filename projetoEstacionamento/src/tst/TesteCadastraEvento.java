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

import app.Eventos;

@RunWith(Parameterized.class)
public class TesteCadastraEvento {
	private Eventos eventos;
	private String dados[][];
	
	@Before
	public void setup() {
		eventos = new Eventos();
	}
	
	@Parameters 
	public static Collection<Object[]> getParameters(){
		Object[][] parametros = new Object [][] {
			{new String[][] {{"FlaXFlu", "9:00", "13:00"}}},
			{new String[][] {{"FlaXFlu", "9:00", "13:00"}, {"FlaXCam", "9:00", "13:00"}}},
			{new String[][] {{"FlaXFlu", "9:00", "13:00"}, {"FlaXCam", "9:00", "13:00"}, {"FlaXVas", "14:00", "18:00", "17/07/2022"}}}
		};
		
		return Arrays.asList(parametros);
	}
	
	public TesteCadastraEvento(String d[][]) {
		this.dados = d;
	}

	@Test
	@Category(TesteFuncional.class)
	public void cadastraEventos() {
		for (String s[] : dados) {
			assertTrue(eventos.cadastraEvento(s[0], s[1], s[2]));
		}
	}

}
