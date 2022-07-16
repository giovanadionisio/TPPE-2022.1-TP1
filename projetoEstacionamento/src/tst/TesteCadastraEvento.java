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
	
	@Test
	public void cadastraDoisEventos() {
		assertTrue(eventos.cadastraEvento("FlaXFlu", "9:00", "13:00", "17/07/2022"));
		assertFalse(eventos.cadastraEvento("FlaXFlu", "9:00", "13:00", "17/07/2022"));
		assertTrue(eventos.cadastraEvento("FlaXCam", "9:00", "13:00", "17/07/2022"));
	}
	
	@Test
	public void cadastraTresEventos() {
		assertTrue(eventos.cadastraEvento("FlaXFlu", "9:00", "13:00", "17/07/2022"));
		assertFalse(eventos.cadastraEvento("FlaXFlu", "9:00", "13:00", "17/07/2022"));
		assertTrue(eventos.cadastraEvento("FlaXCam", "9:00", "13:00", "17/07/2022"));
		assertTrue(eventos.cadastraEvento("FlaXVas", "14:00", "18:00", "17/07/2022"));
	}

}
