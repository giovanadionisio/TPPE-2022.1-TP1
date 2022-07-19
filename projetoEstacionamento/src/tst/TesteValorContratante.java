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
		this.estacionamento = new Estacionamento(30.0f, 15f, 120f, 45f, 600f, 50f, "06:00", "22:00", 300, 0.5f);
		
		estacionamento.veiculos.add(new Veiculo("ABC-1234", true));
		estacionamento.acessoDiaraNoturna.cadastraDiariaNoturna("ABC-1234", estacionamento.valorDiaria, "19:00", "08:00", estacionamento.valorDiariaNoturna);
		estacionamento.acessoHoraCheia.cadastraAcessoHoraCheia("ABC-1234", estacionamento.valorFracao, "08:00", "09:00", estacionamento.valorHoraCheia);
		
		
		assertEquals(estacionamento.calculaValorContratante(), 326.0f, 0.1f);
	}
	
	@Test
	void testeValorContratanteDois() throws ValorAcessoInvalidoException, DescricaoEmBrancoException {
		this.estacionamento = new Estacionamento(30.0f, 15f, 120f, 45f, 600f, 50f, "06:00", "22:00", 300, 0.5f);
		
		estacionamento.veiculos.add(new Veiculo("ABC-1234", true)); //50
		estacionamento.veiculos.add(new Veiculo("CAB-1234", true));
		estacionamento.acessoDiaraNoturna.cadastraDiariaNoturna("ABC-1234", estacionamento.valorDiaria, "19:00", "08:00", estacionamento.valorDiariaNoturna); //174
		estacionamento.acessoDiaraNoturna.cadastraDiariaNoturna("CAB-1234", estacionamento.valorDiaria, "19:00", "08:00", estacionamento.valorDiariaNoturna);
		estacionamento.acessoHoraCheia.cadastraAcessoHoraCheia("ABC-1234", estacionamento.valorFracao, "08:00", "09:00", estacionamento.valorHoraCheia); //102
		estacionamento.acessoHoraCheia.cadastraAcessoHoraCheia("CAB-1234", estacionamento.valorFracao, "08:00", "09:00", estacionamento.valorHoraCheia);
		
		
		assertEquals(estacionamento.calculaValorContratante(), 652.0f, 0.1f);
	}
	
	@Test
	void testeValorContratanteTres() throws ValorAcessoInvalidoException, DescricaoEmBrancoException {
		this.estacionamento = new Estacionamento(30.0f, 15f, 120f, 45f, 600f, 50f, "06:00", "22:00", 300, 0.5f);
		
		estacionamento.veiculos.add(new Veiculo("ABC-1234", true)); //50
		estacionamento.veiculos.add(new Veiculo("CAB-1234", true));
		estacionamento.veiculos.add(new Veiculo("CAB-4321", true));
		
		estacionamento.acessoDiaraNoturna.cadastraDiariaNoturna("ABC-1234", estacionamento.valorDiaria, "19:00", "08:00", estacionamento.valorDiariaNoturna); //174
		estacionamento.acessoDiaraNoturna.cadastraDiariaNoturna("CAB-1234", estacionamento.valorDiaria, "19:00", "08:00", estacionamento.valorDiariaNoturna);
		estacionamento.acessoDiaraNoturna.cadastraDiariaNoturna("CAB-4321", estacionamento.valorDiaria, "19:00", "08:00", estacionamento.valorDiariaNoturna);
		
		estacionamento.acessoHoraCheia.cadastraAcessoHoraCheia("ABC-1234", estacionamento.valorFracao, "08:00", "09:00", estacionamento.valorHoraCheia); //102
		estacionamento.acessoHoraCheia.cadastraAcessoHoraCheia("CAB-1234", estacionamento.valorFracao, "08:00", "09:00", estacionamento.valorHoraCheia);
		estacionamento.acessoHoraCheia.cadastraAcessoHoraCheia("CAB-4321", estacionamento.valorFracao, "08:00", "09:00", estacionamento.valorHoraCheia);
		
		assertEquals(estacionamento.calculaValorContratante(), 978.0f, 0.1f);
	}

}
