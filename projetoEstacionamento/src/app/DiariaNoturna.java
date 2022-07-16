package app;

import java.util.ArrayList;

public class DiariaNoturna {
	
	
	ArrayList<String> placa;
	ArrayList<Float> valorDiariaDiurna;
	ArrayList<Float> percentual;
	ArrayList<String> horarioEntrada;
	ArrayList<String> horarioSaida;
	
	
	public DiariaNoturna(){
		this.placa = new ArrayList<String>();
		this.valorDiariaDiurna = new ArrayList<Float>();
		this.horarioEntrada = new ArrayList<String>();
		this.horarioSaida = new ArrayList<String>();
		this.percentual = new ArrayList<Float>();
	}


	public void cadastraDiariaNoturna(String placa, float valorDiaria, String horarioEntrada, String horarioSaida, float percentual) {
		this.placa.add(placa);
		this.valorDiariaDiurna.add(valorDiaria);
		this.horarioEntrada.add(horarioEntrada);
		this.horarioSaida.add(horarioSaida);
		this.percentual.add(percentual);
		
	}

	public boolean contemDiariaNoturna(String placa) {
		boolean resposta = false; 
		for (String p:this.placa) {
			if (p.equalsIgnoreCase(placa))
				return true;
		}
		
		return resposta;
	}

	
	public Float getValorDiariaDiurna(String placa) {
		int pos= 0;
		for (String p:this.placa) {
			if (p.equalsIgnoreCase(placa))
				pos = p.indexOf(placa);
		}
		
		return this.valorDiariaDiurna.get(pos);
	}


	public Float getValorDiariaNoturna(String placa) {
		int pos= 0;
		for (String p:this.placa) {
			if (p.equalsIgnoreCase(placa))
				pos = p.indexOf(placa);
		}
		
		float valor = this.valorDiariaDiurna.get(pos) * (1 +  (this.percentual.get(pos)/100.0f));
		
		return valor;
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
	
	public Float getPercentual (String placa) {
		int pos= 0;
		for (String p:this.placa) {
			if (p.equalsIgnoreCase(placa))
				pos = p.indexOf(placa);
		}
		
		return this.percentual.get(pos);
	}

}