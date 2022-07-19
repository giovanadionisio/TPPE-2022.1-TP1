package app;

import java.util.ArrayList;

public class Eventos {
	public ArrayList<Evento> eventos;
	
	public Eventos() {
		this.eventos = new ArrayList<Evento>();
	}

	public Boolean cadastraEvento(String n, String hi, String hf) {
		for (Evento e : this.eventos) {
			if (e.nome.equalsIgnoreCase(n)) {
				return false;
			}
		}
		
		eventos.add(new Evento(n, hi, hf));
		return true;
	}

	public boolean existeEvento(String n) {
		for (Evento e : this.eventos) {
			if (e.nome.equalsIgnoreCase(n)) {
				return true;
			}
		}
		return false;
	}

	public String getHorarioInicio(String n) {
		for (Evento e : this.eventos) {
			if (e.nome.equalsIgnoreCase(n)) {
				return e.horaInicio;
			}
		}
		return null;
	}
	
	public String getHorarioFim(String n) {
		for (Evento e : this.eventos) {
			if (e.nome.equalsIgnoreCase(n)) {
				return e.horaFim;
			}
		}
		return null;
	}
}
