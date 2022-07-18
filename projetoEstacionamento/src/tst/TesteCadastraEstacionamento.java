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
	
	@Test
	public void testeCadastraDoisEstacionamentos() throws ValorAcessoInvalidoException, DescricaoEmBrancoException {
		Estacionamento estacionamento = new Estacionamento(30.0f, 0.15f, 120f, 0.45f, 600f, 50f, "06:00", "22:00", 300, 0.5f);
		Estacionamento estacionamento2 = new Estacionamento(20.0f, 0.1f, 70f, 0.3f, 455f, 60f, "00:00", "00:00", 120, 0.7f);
		
		this.programa.cadastraEstacionamento(estacionamento);
		this.programa.cadastraEstacionamento(estacionamento2);
		
		assertEquals(this.programa.estacionamentos.size(), 2);
	}
	
	@Test
	public void testeCadastraTresEstacionamentos() throws ValorAcessoInvalidoException, DescricaoEmBrancoException {
		Estacionamento estacionamento = new Estacionamento(30.0f, 0.15f, 120f, 0.45f, 600f, 50f, "06:00", "22:00", 300, 0.5f);
		Estacionamento estacionamento2 = new Estacionamento(20.0f, 0.1f, 70f, 0.3f, 455f, 60f, "00:00", "00:00", 120, 0.6f);
		Estacionamento estacionamento3 = new Estacionamento(10.0f, 0f, 50f, 0.4f, 350f, 40f, "06:00", "22:00", 600, 0.7f);
		
		this.programa.cadastraEstacionamento(estacionamento);
		this.programa.cadastraEstacionamento(estacionamento2);
		this.programa.cadastraEstacionamento(estacionamento3);
		
		assertEquals(this.programa.estacionamentos.size(), 3);
	}


}
