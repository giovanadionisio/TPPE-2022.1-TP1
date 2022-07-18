package app;

public class AcessoHoraCheia {

	private String placa;
	private Float valorFracao;
	private String horarioEntrada; 
	private String horarioSaida; 
	private Float percentual;

	public void cadastraAcessoHoraCheia(String placa, float valorFracao, String horarioEntrada, String horarioSaida, float percentual) {
		this.placa = placa;
		this.valorFracao = valorFracao;
		this.horarioEntrada = horarioEntrada;
		this.horarioSaida = horarioSaida;
		this.percentual = percentual;
	}

	public float getValorFracao(String string) {
		return 30.0f;
	}

	public String getHorarioEntrada(String string) {
		return "8:30";
	}

	public Float getPercentual(String string) {
		return 15.0f;
	}

	public Object getHorarioSaida(String string) {
		return "9:30";
	}


}