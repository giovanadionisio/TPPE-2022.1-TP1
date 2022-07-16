package app;

import java.util.ArrayList;

public class Mensalistas {
	ArrayList<String> mensalistas;
	
	public Mensalistas(){
		this.mensalistas = new ArrayList<String>();
	}

	public void cadastraMensalista(String placa) {
		this.mensalistas.add(placa);
	}

	public boolean ehMensalista(String placa) {
		for (String s : this.mensalistas) {
			if (s.equalsIgnoreCase(placa)) {
				return true;
			}
		}
		return false;
	}
	
	
}
