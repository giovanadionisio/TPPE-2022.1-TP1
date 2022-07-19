package tst;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import app.Estacionamento;
import app.Veiculo;
import exceptions.DescricaoEmBrancoException;
import exceptions.ValorAcessoInvalidoException;

class TesteValorContratante {
	Estacionamento estacionamento;

	@Test
	void testeValorContratante() throws ValorAcessoInvalidoException, DescricaoEmBrancoException {
		this.estacionamento = new Estacionamento(30.0f, 0.15f, 120f, 0.45f, 600f, 50f, "06:00", "22:00", 300, 0.5f);
		
		estacionamento.veiculos.add(new Veiculo("ABC-1234", true));
		estacionamento.acessoDiaraNoturna.cadastraDiariaNoturna("ABC-1234", estacionamento.valorDiaria, "19:00", "08:00", estacionamento.valorDiariaNoturna);
		estacionamento.acessoHoraCheia.cadastraAcessoHoraCheia("ABC-1234", estacionamento.valorFracao, "08:00", "08:45", estacionamento.valorHoraCheia);
		
		
		assertEquals(estacionamento.calculaValorContratante(), 146.0f, 0.1f);
		
	}

}
