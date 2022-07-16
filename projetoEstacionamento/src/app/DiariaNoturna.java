package app;


public class DiariaNoturna {
	
	private String placa;
	private Float valorDiariaDiurna;
	private String horarioEntrada; 
	private String horarioSaida; 
	private Float percentual;

	public void cadastraDiariaNoturna(String placa, float valorDiariaDiurna, String horarioEntrada, String horarioSaida, float percentual) {
		this.placa = placa;
		this.valorDiariaDiurna = valorDiariaDiurna;
		this.horarioEntrada = horarioEntrada;
		this.horarioSaida = horarioSaida;
		this.percentual = percentual;
	}

	public boolean contemDiariaNoturna(String string) {
		return true;
	}

	public float getValorDiariaDiurna(String string) {
		return 70.0f;
	}

	public String getHorarioEntrada(String string) {
		return "8:30";
	}

	public Float getPercentual(String string) {
		return 10.0f;
	}

	public Float getValorDiariaNoturna(String string) {
		return 77.0f;
	}

	public Object getHorarioSaida(String string) {
		return "22:30";
	}


}
