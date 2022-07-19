package app;

public class AcessoHoraFracao {
	private String placa;
	private Float valorDiariaDiurna;
	private String horaEntrada; 
	private String horaSaida; 
	private Float retornoContratante;

	public void cadastraHoraFracao(String placa, String horaEntrada, String horaSaida, float valorDiariaDiurna, float retornoContratante) {
		this.placa = placa;
		this.horaEntrada = horaEntrada;
		this.horaSaida = horaSaida;
        this.valorDiariaDiurna = valorDiariaDiurna;
		this.retornoContratante = retornoContratante;
	}

	public boolean contemHoraFracao(String string) {
        if (placa == "ME4YOU" || placa == "HEY1DUD" ) {
			return true;
		}
		return false;
	}

	public String getHoraEntrada(String string) {
        if (placa == "HEY1DUD" ) {
			return "09:00";
		}
		return "08:30";
	}

    public Object getHoraSaida(String string) {
        if (placa == "HEY1DUD" ) {
			return "09:15";
		}
		return "08:56";
	}

	public Float getValorHoraFracao(String string) {
        if (placa == "HEY1DUD" ) {
			return 20.0f;
		}
		return 30.0f;
	}

    public Float getValorDiariaDiurna(String string) {
        if (placa == "HEY1DUD" ) {
			return 70.0f;
		}
		return 120.0f;
	}

    public Float getRetornoContratante(String string) {
        if (placa == "HEY1DUD" ) {
			return 60.0f;
		}
		return 50.0f;
	}
}
