package app;

import java.util.ArrayList;

public class AcessoHoraCheia {

	ArrayList<String> placa;
	ArrayList<Float> valorFracao;
	ArrayList<Float> percentual;
	ArrayList<String> horarioEntrada;
	ArrayList<String> horarioSaida;
	
	public AcessoHoraCheia(){
		this.placa = new ArrayList<String>();
		this.valorFracao = new ArrayList<Float>();
		this.percentual = new ArrayList<Float>();
		this.horarioEntrada = new ArrayList<String>();
		this.horarioSaida = new ArrayList<String>();
	}

	public void cadastraAcessoHoraCheia(String placa, float valorFracao, String horarioEntrada, String horarioSaida, float percentual) {
		this.placa.add(placa);
		this.valorFracao.add(valorFracao);
		this.horarioEntrada.add(horarioEntrada);
		this.horarioSaida.add(horarioSaida);
		this.percentual.add(percentual);
	}
	
	public boolean contemAcessoHoraCheia(String placa) {
		boolean resposta = false; 
		for (String p:this.placa) {
			if (p.equalsIgnoreCase(placa))
				return true;
		}
		return resposta; 
	}

	public float getValorFracao(String placa) {
		int pos= 0;
		for (String p:this.placa) {
			if (p.equalsIgnoreCase(placa))
				pos = p.indexOf(placa);
		}
		return this.valorFracao.get(pos);
	}

	public Float getValorAcessoHoraCheia(String placa) {
		int pos= 0;
		for (String p:this.placa) {
			if (p.equalsIgnoreCase(placa))
				pos = p.indexOf(placa);
		}
		
		long minutos = new Horario(horarioEntrada.get(pos),horarioSaida.get(pos)).calculaMinutos();
       		float valor = ((minutos/60) * 4 * (1 -  (this.percentual.get(pos)/100.0f)) * this.valorFracao.get(pos));

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

	public Float getPercentual(String placa) {
		int pos= 0;
		for (String p:this.placa) {
			if (p.equalsIgnoreCase(placa))
				pos = p.indexOf(placa);
		}
		
		return this.percentual.get(pos);
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
