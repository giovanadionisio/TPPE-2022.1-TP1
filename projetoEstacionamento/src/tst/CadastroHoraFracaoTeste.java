package tst;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import app.AcessoHoraFracao;

public class CadastroHoraFracaoTeste {

	AcessoHoraFracao horaFracao;

	@Before
	public void setup() {
		horaFracao = new AcessoHoraFracao();
	}

	@Test
	public void test() {
		horaFracao.cadastraHoraFracao("ME4YOU", "08:30", "08:56", 120.0f, 50.0f);
		assertTrue(horaFracao.contemHoraFracao("ME4YOU"));
		assertEquals(horaFracao.getValorDiariaDiurna("ME4YOU"), 120.0f, 0.f);
		assertEquals(horaFracao.getHoraEntrada("ME4YOU"), "08:30");
		assertEquals(horaFracao.getHoraSaida("ME4YOU"), "08:56");
		assertEquals(horaFracao.getValorDiariaDiurna("ME4YOU"), 30.0f , 0.1f);
		assertEquals(horaFracao.getRetornoContratante("ME4YOU"), 50, 0.1f);
	}

}
