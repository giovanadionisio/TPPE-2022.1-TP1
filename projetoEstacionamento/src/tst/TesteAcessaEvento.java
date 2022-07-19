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
public class TesteAcessaEvento {
	private Eventos eventos;
	
	private String dados[][];
	
	@Before
	public void setup() {
		eventos = new Eventos();
	}
	
	@Parameters
	public static Collection<Object[]> getParameters(){
		Object[][] parametros = new Object[][] {
			{new String[][] {{"FlaXFlu", "9:00", "13:00", "17/07/2022"}}},
			{new String[][] {{"FlaXFlu", "9:00", "13:00", "17/07/2022"}, {"FlaXCam", "19:00", "23:00", "20/07/2022"}}},
			{new String[][] {{"FlaXFlu", "9:00", "13:00", "17/07/2022"}, {"FlaXCam", "19:00", "23:00", "20/07/2022"}, {"FlaXVas", "14:00", "18:00", "17/07/2022"}}}
		};
		
		return Arrays.asList(parametros);
	}
	
	public TesteAcessaEvento(String d[][]) {
		this.dados = d;
	}

	@Test
	@Category(TesteFuncional.class)
	public void testaExisteEvento() {
		eventos.cadastraEvento("FlaXFlu", "9:00", "13:00");
		assertTrue(eventos.existeEvento("FLAXFLU"));
		assertEquals(eventos.getHorarioInicio("FLAXFLU"), "9:00");
		assertEquals(eventos.getHorarioFim("FLAXFLU"), "13:00");
		
		for (String s[] : dados) {
			eventos.cadastraEvento(s[0], s[1], s[2]);
		}
		
		for (String s[] : dados) {
			assertTrue(eventos.existeEvento(s[0]));
			
			assertEquals(eventos.getHorarioInicio(s[0]), s[1]);
			assertEquals(eventos.getHorarioFim(s[0]), s[2]);
		}
		
	}
}
