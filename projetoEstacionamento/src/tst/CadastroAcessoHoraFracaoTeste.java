package tst;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.AcessoHoraFracao;

@RunWith(Parameterized.class)
public class CadastroAcessoHoraFracaoTeste {
	
	AcessoHoraFracao horaFracao;

	private String placa;
	private String horaEntrada; 
	private String horaSaida;
    private Float valorFracao;
	private Float retornoContratante;
    private Float valorAcessoHoraParcial;

    @Parameters
	public static List<Object[]> getParameters() {
		Object[][] parameters = new Object[][] {
			{ "HI139", "08:30", "08:56", 30.0f, 50.0f, 60.0f },
			{ "G49NG", "15:12", "15:40", 20.0f, 60.0f, 40.0f },
			{ "MA3TD", "09:00", "09:45", 10.0f, 25.0f, 30.0f },
			{ "HEY1D", "10:03", "10:37", 40.0f, 15.0f, 80.0f }
		};

		return Arrays.asList(parameters);
	}

    public CadastroAcessoHoraFracaoTeste(String placa, String horaEntrada, String horaSaida, float valorFracao, float retornoContratante, float valorAcessoHoraParcial) {
		this.placa = placa;
		this.horaEntrada = horaEntrada;
		this.horaSaida = horaSaida;
        this.valorFracao = valorFracao;
		this.retornoContratante = retornoContratante;
        this.valorAcessoHoraParcial = valorAcessoHoraParcial;
	}

	@Before
	public void setup() {
		horaFracao = new AcessoHoraFracao();
	}

	@Test
	public void testCadastraHoraFracao() {
		horaFracao.cadastraHoraFracao(placa, horaEntrada, horaSaida, valorFracao, retornoContratante);
		assertTrue(horaFracao.contemHoraFracao(placa));
		assertEquals(horaFracao.getValorFracao(placa), valorFracao, 0.1f);
		assertEquals(horaFracao.getHoraEntrada(placa), horaEntrada);
		assertEquals(horaFracao.getHoraSaida(placa), horaSaida);
		assertEquals(horaFracao.getValorFracao(placa), valorFracao, 0.1f);
		assertEquals(horaFracao.getRetornoContratante(placa), retornoContratante, 0.1f);
        assertEquals(horaFracao.getValorAcessoHoraFracao(placa), valorAcessoHoraParcial, 0.1f);
	}

}
