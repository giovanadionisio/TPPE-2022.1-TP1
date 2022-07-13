package app;

import java.util.ArrayList;

public class Mensalistas {
	ArrayList<String> mensalistas;
	
	public Mensalistas(){
		this.mensalistas = new ArrayList<String>();
	}

	public void cadastraMensalista(String nome) {
		this.mensalistas.add(nome);
	}

	public boolean ehMensalista(String nome) {
		for (String s : this.mensalistas) {
			if (s.equalsIgnoreCase(nome)) {
				return true;
			}
		}
		return false;
	}
	
	
}
