package app;
import java.util.Scanner;

public class Estacionamento {
	private Scanner input = new Scanner(System.in);
	
	public float valorFracao = 0.0f;
	public float valorHoraCheia = 0.0f;
	public float valorDiaria = 0.0f;
	public float valorDiariaNoturna = 0.0f;
	
	public float valorMensalista = 0.0f;
	public float valorEvento = 0.0f;
	
	public String horarioEntrada = "";
	public String horarioSaida = "";
	public int capacidade = 0;
	public int capacidadeAtual = 0;
	private Veiculo[] veiculos;
	
	public float retornoContratante = 0.0f;
	
	public Estacionamento(float valorFracao, float valorHoraCheia, float valorDiaria, float valorDiariaNoturna) {
		this.valorFracao = valorFracao;
		this.valorHoraCheia = valorHoraCheia;
		this.valorDiaria = valorDiaria;
		this.valorDiariaNoturna = valorDiariaNoturna;
	}

	public void cadastraValoresSecundarios(float valorMensalista, float valorEvento, int capacidade, float retornoContratante) {
		this.valorMensalista = valorMensalista;
		this.valorEvento = valorEvento;
		this.capacidade = capacidade;
		this.retornoContratante = retornoContratante;
	}

	public void ocupaVaga() {
		this.capacidade = this.capacidade - 1;
	}

	public void atualizaCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public void cadastraHorarios(String horarioEntrada, String horarioSaida) {
		this.horarioEntrada = horarioEntrada;
		this.horarioSaida = horarioSaida;
	}
	
	public void cadastraAcesso(){
  
		System.out.println("Digite a hora de entrada do veículo:");
		String horaEntrada = input.next();

		System.out.println("Digite a hora de saida do veículo:");
		String horaSaida = input.next();

		System.out.println("Digite a placa do veículo:");
		String placa = input.next();

		System.out.println("Digite o tipo de acesso desejado:");
		String tipoAcesso = input.next();
		
		veiculos[this.capacidadeAtual] = new Veiculo(horarioEntrada,horarioSaida,placa,tipoAcesso);
		this.capacidadeAtual++;
		
		System.out.println("Veiculo cadastrado no sistema!");
	}
}
