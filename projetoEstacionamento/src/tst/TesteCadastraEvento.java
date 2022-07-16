package tst;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import app.Eventos;

public class TesteCadastraEvento {
	private Eventos eventos;
	
	@Before
	public void setup() {
		eventos = new Eventos();
	}

	@Test
	public void cadastraEvento() {
		assertTrue(eventos.cadastraEvento("FlaXFlu", "9:00", "13:00", "17/07/2022"));
	}

}
