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
	
	@Test
	public void testaExisteDoisEventos() {
		eventos.cadastraEvento("FlaXFlu", "9:00", "13:00", "17/07/2022");
		eventos.cadastraEvento("FlaXCam", "19:00", "23:00", "20/07/2022");
		
		assertTrue(eventos.existeEvento("FLAXFLU", "17/07/2022"));
		assertTrue(eventos.existeEvento("FLAXCAM", "20/07/2022"));
		
		assertEquals(eventos.getHorarioInicio("FLAXFLU", "17/07/2022"), "9:00");
		assertEquals(eventos.getHorarioFim("FLAXFLU", "17/07/2022"), "13:00");
		
		assertEquals(eventos.getHorarioInicio("FLAXCAM", "20/07/2022"), "19:00");
		assertEquals(eventos.getHorarioFim("FLAXCAM", "20/07/2022"), "23:00");
	}
	
	@Test
	public void testaExisteTresEventos() {
		eventos.cadastraEvento("FlaXFlu", "9:00", "13:00", "17/07/2022");
		eventos.cadastraEvento("FlaXCam", "19:00", "23:00", "20/07/2022");
		eventos.cadastraEvento("FlaXVas", "14:00", "18:00", "17/07/2022");
		
		assertTrue(eventos.existeEvento("FLAXFLU", "17/07/2022"));
		assertTrue(eventos.existeEvento("FLAXCAM", "20/07/2022"));
		assertTrue(eventos.existeEvento("flaxvas", "17/07/2022"));
		
		assertEquals(eventos.getHorarioInicio("FLAXFLU", "17/07/2022"), "9:00");
		assertEquals(eventos.getHorarioInicio("FLAXCAM", "20/07/2022"), "19:00");
		assertEquals(eventos.getHorarioInicio("flaxvas", "17/07/2022"), "14:00");
		
		assertEquals(eventos.getHorarioFim("FLAXFLU", "17/07/2022"), "13:00");		
		assertEquals(eventos.getHorarioFim("FLAXCAM", "20/07/2022"), "23:00");
		assertEquals(eventos.getHorarioFim("flaxvas", "17/07/2022"), "18:00");
	}

}
