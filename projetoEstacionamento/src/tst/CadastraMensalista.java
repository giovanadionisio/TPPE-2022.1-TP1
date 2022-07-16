package tst;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import app.Mensalistas;

public class CadastraMensalista {
	private Mensalistas mensalistas;
	
	@Before
	public void setup() {
		mensalistas = new Mensalistas();
	}

	@Test
	public void cadastraMensalista() {
		mensalistas.cadastraMensalista("ABC-1234");
		assertTrue(mensalistas.ehMensalista("ABC-1234"));
		assertFalse(mensalistas.ehMensalista("ABC-4321"));
	}
	
	@Test
	public void cadastraDoisMensalistas() {
		mensalistas.cadastraMensalista("ABC-1234");
		mensalistas.cadastraMensalista("ABC-4321");
		assertTrue(mensalistas.ehMensalista("ABC-4321"));
		assertTrue(mensalistas.ehMensalista("ABC-1234"));
		assertFalse(mensalistas.ehMensalista("CAB-4321"));
	}
	
	
	@Test
	public void cadastraTresMensalistas() {
		mensalistas.cadastraMensalista("ABC-1234");
		mensalistas.cadastraMensalista("ABC-4321");
		mensalistas.cadastraMensalista("CAB-4321");
		assertTrue(mensalistas.ehMensalista("ABC-4321"));
		assertTrue(mensalistas.ehMensalista("ABC-1234"));
		assertTrue(mensalistas.ehMensalista("CAB-4321"));
		assertFalse(mensalistas.ehMensalista("CAB-1234"));
	}

}
