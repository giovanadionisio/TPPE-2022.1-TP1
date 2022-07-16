package app;

import java.util.ArrayList;

public class Eventos {
	ArrayList<Evento> eventos;
	
	public Eventos() {
		this.eventos = new ArrayList<Evento>();
	}

	public Boolean cadastraEvento(String n, String hi, String hf, String d) {
		for (Evento e : this.eventos) {
			if (e.nome.equalsIgnoreCase(n) && e.data.equalsIgnoreCase(d)) {
				return false;
			}
		}
		
		eventos.add(new Evento(n, hi, hf, d));
		return true;
	}
}
