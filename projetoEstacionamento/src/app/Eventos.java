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

	public boolean existeEvento(String n, String d) {
		for (Evento e : this.eventos) {
			if (e.nome.equalsIgnoreCase(n) && e.data.equalsIgnoreCase(d)) {
				return true;
			}
		}
		return false;
	}

	public String getHorarioInicio(String n, String d) {
		for (Evento e : this.eventos) {
			if (e.nome.equalsIgnoreCase(n) && e.data.equalsIgnoreCase(d)) {
				return e.horaInicio;
			}
		}
		return null;
	}
	
	public String getHorarioFim(String n, String d) {
		for (Evento e : this.eventos) {
			if (e.nome.equalsIgnoreCase(n) && e.data.equalsIgnoreCase(d)) {
				return e.horaFim;
			}
		}
		return null;
	}
}
