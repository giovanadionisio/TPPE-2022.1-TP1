package tst;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import app.AcessoHoraCheia;

public class CadastroAcessoHoraCheiaTeste {

	AcessoHoraCheia acessoHoraCheia;

	@Before
	public void setup() {
		acessoHoraCheia = new AcessoHoraCheia();
	}

	@Test
	public void test() {
		acessoHoraCheia.cadastraAcessoHoraCheia("G49NG",30.0f, "8:30", "9:30", 15);
		assertTrue(acessoHoraCheia.contemAcessoHoraCheia("G49NG"));
		assertEquals(acessoHoraCheia.getValorFracao("G49NG"), 30.0f, 0.f);
		assertEquals(acessoHoraCheia.getHorarioEntrada("G49NG"), "8:30");
		assertEquals(acessoHoraCheia.getHorarioSaida("G49NG"),  "9:30");
		assertEquals(acessoHoraCheia.getPercentual("G49NG"),  15, 0.1f);

}