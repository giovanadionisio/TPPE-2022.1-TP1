package app;

import java.util.ArrayList;

public class DiariaDiurna {
	
	ArrayList<String> placa;
	ArrayList<Float> valorDiaria;
	ArrayList<String> horarioEntrada;
	ArrayList<String> horarioSaida;
	
	
	public DiariaDiurna(){
		this.placa = new ArrayList<String>();
		this.valorDiaria = new ArrayList<Float>();
		this.horarioEntrada = new ArrayList<String>();
		this.horarioSaida = new ArrayList<String>();
	}


	public void cadastraDiariaDiurna(String placa, float valorDiaria, String horarioEntrada, String horarioSaida) {
		this.placa.add(placa);
		this.valorDiaria.add(valorDiaria);
		this.horarioEntrada.add(horarioEntrada);
		this.horarioSaida.add(horarioSaida);
		
	}

	public boolean contemDiariaDiurna(String placa) {
		boolean resposta = false; 
		for (String p:this.placa) {
			if (p.equalsIgnoreCase(placa))
				return true;
		}
		
		return resposta;
	}


	public Float getValorDiaria(String placa) {
		int pos= 0;
		for (String p:this.placa) {
			if (p.equalsIgnoreCase(placa))
				pos = p.indexOf(placa);
		}
		
		return this.valorDiaria.get(pos);
	}


	public String getHorarioEntrada(String placa) {
		int pos= 0;
		for (String p:this.placa) {
			if (p.equalsIgnoreCase(placa))
				pos = p.indexOf(placa);
		}
		
		return this.horarioEntrada.get(pos);
	}


	public String getHorarioSaida(String placa) {
		int pos= 0;
		for (String p:this.placa) {
			if (p.equalsIgnoreCase(placa))
				pos = p.indexOf(placa);
		}
		
		return this.horarioSaida.get(pos);
	}
	
	
	
 
  
}
