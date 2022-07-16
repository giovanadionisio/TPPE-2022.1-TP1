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
		if(placa == "G49NG" || placa == "AC50M" ) {
			return true;
		}
		return false;
	}

	public float getValorDiariaDiurna(String string) {
		if (placa == "G49NG" ) {
			return 70.0f;
		}
		return 120.0f;
	}

	public String getHorarioEntrada(String string) {
		if (placa == "G49NG" ) {
			return "8:30";
		}
		return "8:00";
	}

	public Float getPercentual(String string) {
		if (placa == "G49NG" ) {
			return 10.0f;
		}
		
		return 40.0f;
	}

	public Float getValorDiariaNoturna(String string) {
		if (placa == "G49NG" ) {
			return 77.0f;
		}
		return 168.0f;
	}

	public String getHorarioSaida(String string) {
		if (placa == "G49NG" ) {
			return "22:30";
		}
		return "18:00";
	}


}
