package tst;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.DiariaNoturna;

@RunWith(Parameterized.class)
public class CadastroDiariaNoturnaTeste {
	DiariaNoturna diariaNoturna;

	private String placa;
	private Float valorDiariaDiurna;
	private Float percentual;
	private Float valorDiariaNoturna;
	private String horarioEntrada;
	private String horarioSaida;
	
	@Parameters
	public static List<Object[]> getParameters() {
		Object[][] parameters = new Object[][] {
			{"G49NG",70.0f, "18:30", "08:30", 10, 77.0f },
			{"AC50M",120.0f, "18:00", "08:00", 40, 168.0f },
			{"AM31J",50.53f, "22:33", "09:47", 25, 63.1625f },
			{"HI139", 40.0f, "20:33", "05:12", 15, 46.0f}
		};
		
		return Arrays.asList(parameters);
	}
	
	public CadastroDiariaNoturnaTeste (String placa, float valorDiariaDiurna, String horarioEntrada, String horarioSaida, float percentual,Float valorDiariaNoturna ) {
		this.placa = placa;
		this.valorDiariaDiurna =valorDiariaDiurna;
		this.horarioEntrada = horarioEntrada;
		this.percentual = percentual;
		this.horarioSaida = horarioSaida;
		this.valorDiariaNoturna = valorDiariaNoturna;
	}
	
	
	@Before
	public void setup() {
		diariaNoturna = new DiariaNoturna();
	}
	
	
	@Test
	@Category(TesteFuncional.class)
	public void testCadastraDiariaNoturna() {
		diariaNoturna.cadastraDiariaNoturna(placa,valorDiariaDiurna, horarioEntrada, horarioSaida, percentual);
		assertTrue(diariaNoturna.contemDiariaNoturna(placa));
		assertEquals(diariaNoturna.getValorDiariaDiurna(placa), valorDiariaDiurna, 0.1f);
		assertEquals(diariaNoturna.getHorarioEntrada(placa), horarioEntrada);
		assertEquals(diariaNoturna.getHorarioSaida(placa),  horarioSaida);
		assertEquals(diariaNoturna.getPercentual(placa),  percentual);
		assertEquals(diariaNoturna.getValorDiariaNoturna(placa),  valorDiariaNoturna, 0.1f);
	}
	
}
