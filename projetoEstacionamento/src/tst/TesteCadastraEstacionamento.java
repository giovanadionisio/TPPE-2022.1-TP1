package tst;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import app.Estacionamento;
import app.Programa;
import exceptions.DescricaoEmBrancoException;
import exceptions.ValorAcessoInvalidoException;

public class TesteCadastraEstacionamento {
	Programa programa;
	
	@Before
	public void setup() throws ValorAcessoInvalidoException, DescricaoEmBrancoException {
		this.programa = new Programa();
	}

	@Test
	public void testeCadastraUmEstacionamento() throws ValorAcessoInvalidoException, DescricaoEmBrancoException {
		Estacionamento estacionamento = new Estacionamento(30.0f, 0.15f, 120f, 0.45f, 600f, 50f, "06:00", "22:00", 300, 0.5f); 
		this.programa.cadastraEstacionamento(estacionamento);
		
		assertEquals(this.programa.estacionamentos.size(), 1);
	}


}
