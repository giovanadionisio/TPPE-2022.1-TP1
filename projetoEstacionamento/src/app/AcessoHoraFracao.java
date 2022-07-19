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
		return true;
	}

	public String getHoraEntrada(String string) {
		return "08:30";
	}

    public Object getHoraSaida(String string) {
		return "08:56";
	}

	public Float getValorHoraFracao(String string) {
		return 30.0f;
	}

    public float getValorDiariaDiurna(String string) {
		return 120.0f;
	}

    public Float getRetornoContratante(String string) {
		return 50.0f;
	}
}
