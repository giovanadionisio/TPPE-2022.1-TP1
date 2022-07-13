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
		mensalistas.cadastraMensalista("Fulano");
		assertTrue(mensalistas.ehMensalista("Fulano"));
		assertFalse(mensalistas.ehMensalista("Ciclano"));
	}

}
