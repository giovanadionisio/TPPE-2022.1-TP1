package tst;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.Estacionamento;
import app.Programa;
import exceptions.DescricaoEmBrancoException;
import exceptions.ValorAcessoInvalidoException;

@RunWith(Parameterized.class)
public class TesteCadastraEstacionamento {
	Programa programa;
	
	Estacionamento estacionamentos[];
	
	@Before
	public void setup() throws ValorAcessoInvalidoException, DescricaoEmBrancoException {
		this.programa = new Programa();
	}
	
	@Parameters
	public static Collection<Object[]> getParameters() throws ValorAcessoInvalidoException, DescricaoEmBrancoException{
		Object[][] parametros = new Object[][] {
			{new Estacionamento[] {new Estacionamento(30.0f, 0.15f, 120f, 0.45f, 600f, 50f, "06:00", "22:00", 300, 0.5f)}},
			{new Estacionamento[] {new Estacionamento(30.0f, 0.15f, 120f, 0.45f, 600f, 50f, "06:00", "22:00", 300, 0.5f), new Estacionamento(20.0f, 0.1f, 70f, 0.3f, 455f, 60f, "00:00", "00:00", 120, 0.7f)}},
			{new Estacionamento[] {new Estacionamento(30.0f, 0.15f, 120f, 0.45f, 600f, 50f, "06:00", "22:00", 300, 0.5f), new Estacionamento(20.0f, 0.1f, 70f, 0.3f, 455f, 60f, "00:00", "00:00", 120, 0.7f), new Estacionamento(10.0f, 0f, 50f, 0.4f, 350f, 40f, "06:00", "22:00", 600, 0.7f)}},
		};
		
		return Arrays.asList(parametros);
	}
	
	public TesteCadastraEstacionamento (Estacionamento estacionamentos[]) {
		this.estacionamentos = estacionamentos;
	}
	
	

	@Test
	@Category(TesteFuncional.class)
	public void testeCadastraEstacionamentos() throws ValorAcessoInvalidoException, DescricaoEmBrancoException {
		for (Estacionamento e : estacionamentos) {
			programa.cadastraEstacionamento(e);
		}
		
		assertEquals(programa.estacionamentos.size(), estacionamentos.length);
	}
}
