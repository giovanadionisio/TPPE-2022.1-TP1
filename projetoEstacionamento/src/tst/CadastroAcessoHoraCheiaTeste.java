package tst;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.AcessoHoraCheia;

@RunWith(Parameterized.class)
public class CadastroAcessoHoraCheiaTeste {

	AcessoHoraCheia acessoHoraCheia;
	
	private String placa;
	private Float valorFracao;
	private Float percentual;
	private Float valorAcessoHoraCheia;
	private String horarioEntrada;
	private String horarioSaida;

	@Parameters
	public static List<Object[]> getParameters() {
		Object[][] parameters = new Object[][] {
			{"G49NG",30.0f, "8:30", "9:30", 15, 102.0f },
			{"AC50M",20.0f, "8:00", "11:00", 10, 216.0f },
			{"AM31J",10.0f, "12:00", "16:00", 0, 160.0f }
		};

		return Arrays.asList(parameters);
	}

	public CadastroAcessoHoraCheiaTeste (String placa, float valorFracao, String horarioEntrada, String horarioSaida, float percentual,Float valorAcessoHoraCheia ) {
		this.placa = placa;
		this.valorFracao =valorFracao;
		this.horarioEntrada = horarioEntrada;
		this.percentual = percentual;
		this.horarioSaida = horarioSaida;
		this.valorAcessoHoraCheia = valorAcessoHoraCheia;
	}
	@Before
	public void setup() {
		acessoHoraCheia = new AcessoHoraCheia();
	}

	@Test
	public void testCadastraAcessoHoraCheia() {
		acessoHoraCheia.cadastraAcessoHoraCheia(placa,valorFracao, horarioEntrada, horarioSaida, percentual);
		assertTrue(acessoHoraCheia.contemAcessoHoraCheia(placa));
		assertEquals(acessoHoraCheia.getValorFracao(placa), valorFracao, 0.1f);
		assertEquals(acessoHoraCheia.getHorarioEntrada(placa), horarioEntrada);
		assertEquals(acessoHoraCheia.getHorarioSaida(placa),  horarioSaida);
		assertEquals(acessoHoraCheia.getPercentual(placa),  percentual, 0.1f);
		assertEquals(acessoHoraCheia.getValorAcessoHoraCheia(placa),  valorAcessoHoraCheia, 0.1f);
	}
}