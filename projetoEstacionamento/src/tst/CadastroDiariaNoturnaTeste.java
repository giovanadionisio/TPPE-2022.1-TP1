package tst;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import app.DiariaNoturna;

public class CadastroDiariaNoturnaTeste {
	
	DiariaNoturna diariaNoturna;
	
	@Before
	public void setup() {
		diariaNoturna = new DiariaNoturna();
	}

	@Test
	public void test() {
		diariaNoturna.cadastraDiariaNoturna("G49NG",70.0f, "8:30", "22:30", 10);
		assertTrue(diariaNoturna.contemDiariaNoturna("G49NG"));
		assertEquals(diariaNoturna.getValorDiariaDiurna("G49NG"), 70.0f, 0.f);
		assertEquals(diariaNoturna.getHorarioEntrada("G49NG"), "8:30");
		assertEquals(diariaNoturna.getHorarioSaida("G49NG"),  "22:30");
		assertEquals(diariaNoturna.getPercentual("G49NG"),  10, 0.1f);
		assertEquals(diariaNoturna.getValorDiariaNoturna("G49NG"),  77.0f , 0.1f);
	}

}
