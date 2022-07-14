package tst;

import static org.junit.Assert.*;

import org.junit.Before;

import app.DiariaDiurna;

import org.junit.Test;

public class CadastroDiariaDiurnaTest {
	
	private DiariaDiurna diariaDiurna;
	
	@Before
	public void setup() {
		diariaDiurna = new DiariaDiurna();
	}
	

	@Test
	public void testCadastroDiariaDiurna() {
		diariaDiurna.cadastrarDiariaDiurna("G49NG", 50.0f, 9.10f, 20.30f);
		assertTrue(diariaDiurna.contemDiariaDiurna("G49NG"));
		assertEquals(diariaDiurna.getvalorDiaria("G49NG"), 50.0f, 0.1);
		assertEquals(diariaDiurna.getHorarioEntrada("G49NG"), 9.10f, 0.1f);
		assertEquals(diariaDiurna.getHorarioSaida("G49NG"), 20.30f, 0.1f);;
	}

}
