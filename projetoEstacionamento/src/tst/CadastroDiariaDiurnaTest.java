package tst;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.DiariaDiurna;

@RunWith(Parameterized.class)
public class CadastroDiariaDiurnaTest {
	
	DiariaDiurna diariaDiurna;
	
	private String placa;
	private  Float valorDiaria;
	private  String horarioEntrada;
	private String horarioSaida;
	
	@Parameters
	public static List<Object[]> getParameters() {
		Object[][] parameters = new Object[][] {
			{"G49NG",70.0f, "8:30", "22:30" },
			{"AC50M",120.0f, "8:00", "18:00" },
			{"AM31J",50.53f, "10:33", "19:47" }
		};
		
		return Arrays.asList(parameters);
	}
	
	public CadastroDiariaDiurnaTest(String placa, float valorDiaria, String horarioEntrada, String horarioSaida) {
		this.placa = placa;
		this.valorDiaria =valorDiaria;
		this.horarioEntrada = horarioEntrada;
		this.horarioSaida = horarioSaida;
	}
	
	
	@Before
	public void setup() {
		diariaDiurna = new DiariaDiurna();
	}

	@Test
	public void testCadastraDiariaDiurna() {
		diariaDiurna.cadastraDiariaDiurna(placa,valorDiaria, horarioEntrada, horarioSaida);
		assertTrue(diariaDiurna.contemDiariaDiurna(placa));
		assertEquals(diariaDiurna.getValorDiaria(placa), valorDiaria, 0.1f);
		assertEquals(diariaDiurna.getHorarioEntrada(placa), horarioEntrada);
		assertEquals(diariaDiurna.getHorarioSaida(placa),  horarioSaida);
	}
	
	
}
