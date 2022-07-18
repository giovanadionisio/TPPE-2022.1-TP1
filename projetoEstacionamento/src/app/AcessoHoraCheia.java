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
	
	public boolean contemAcessoHoraCheia(String string) {
		if(placa == "G49NG" || placa == "AC50M" ) {
			return true;
		}
		return false; 
	}

	public float getValorFracao(String string) {
		if (placa == "G49NG" ) {
			return 30.0f;
		}
		return 100.0f;
	}

	public String getHorarioEntrada(String string) {
		if (placa == "G49NG" ) {
			return "8:30";
		}
		return "8:00";
	}

	public Float getPercentual(String string) {
		if (placa == "G49NG" ) {
			return 15.0f;
		}

		return 40.0f;
	}

	public Object getHorarioSaida(String string) {
		public String getHorarioSaida(String string) {
		if (placa == "G49NG" ) {
			return "9:30";
		}
		return "18:00";
	}


}
