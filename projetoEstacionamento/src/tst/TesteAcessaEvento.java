package tst;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import app.Eventos;

public class TesteAcessaEvento {
	private Eventos eventos;
	
	@Before
	public void setup() {
		eventos = new Eventos();
	}

	@Test
	public void testaExisteEvento() {
		eventos.cadastraEvento("FlaXFlu", "9:00", "13:00", "17/07/2022");
		assertTrue(eventos.existeEvento("FLAXFLU", "17/07/2022"));
		assertEquals(eventos.getHorarioInicio("FLAXFLU", "17/07/2022"), "9:00");
		assertEquals(eventos.getHorarioFim("FLAXFLU", "17/07/2022"), "13:00");
	}

}
