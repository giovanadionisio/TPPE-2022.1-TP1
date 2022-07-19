package app;

import java.util.ArrayList;

public class AcessoHoraFracao {

	ArrayList<String> placa;
	ArrayList<String> horaEntrada; 
	ArrayList<String> horaSaida;
	ArrayList<Float> valorFracao;
	ArrayList<Float> retornoContratante;

    public AcessoHoraFracao() {
		this.placa = new ArrayList<String>();
		this.horaEntrada = new ArrayList<String>();
		this.horaSaida = new ArrayList<String>();
        this.valorFracao = new ArrayList<Float>();
		this.retornoContratante = new ArrayList<Float>();
	}

	public void cadastraHoraFracao(String placa, String horaEntrada, String horaSaida, float valorFracao, float retornoContratante) {
		this.placa.add(placa);
		this.horaEntrada.add(horaEntrada);
		this.horaSaida.add(horaSaida);
        this.valorFracao.add(valorFracao);
		this.retornoContratante.add(retornoContratante);
	}

	public boolean contemHoraFracao(String placa) {
		boolean booleano = false; 
		for (String p: this.placa) {
			if (p.equalsIgnoreCase(placa))
				return true;
		}
		return booleano;
	}

	public String getHoraEntrada(String placa) {
        int pos = 0;
		for (String p: this.placa) {
			if (p.equalsIgnoreCase(placa))
				pos = p.indexOf(placa);
        }
		return this.horaEntrada.get(pos);
	}

    public Object getHoraSaida(String placa) {
    	int pos = 0;
		for (String p: this.placa) {
			if (p.equalsIgnoreCase(placa))
				pos = p.indexOf(placa);
		}
		return this.horaSaida.get(pos);
	}

    public Float getValorFracao(String placa) {
    	int pos = 0;
		for (String p: this.placa) {
			if (p.equalsIgnoreCase(placa))
				pos = p.indexOf(placa);
		}
		return this.valorFracao.get(pos);
	}

    public Float getRetornoContratante(String placa) {
    	int pos = 0;
		for (String p: this.placa) {
			if (p.equalsIgnoreCase(placa))
				pos = p.indexOf(placa);
		}
		return this.retornoContratante.get(pos);
	}
    
    public Float getValorAcessoHoraFracao(String placa) {
		int pos = 0;
		for (String p: this.placa) {
			if (p.equalsIgnoreCase(placa))
				pos = p.indexOf(placa);
		}

		long minutos = new Horario(horaEntrada.get(pos), horaSaida.get(pos)).calculaMinutos();
		System.out.println(minutos);
        int tempo = (int) Math.round(minutos / 15.0);

        float valorAcesso = valorFracao.get(pos) * tempo;
		
		return valorAcesso;
	}
}
