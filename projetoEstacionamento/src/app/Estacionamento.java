package app;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import exceptions.DescricaoEmBrancoException;
import exceptions.ValorAcessoInvalidoException;

public class Estacionamento {
	private Scanner input = new Scanner(System.in);
	
	public float valorFracao;
	public float valorHoraCheia;
	public float valorDiaria;
	public float valorDiariaNoturna;
	
	public float valorMensalista;
	public float valorEvento;
	
	public String horarioAbre;
	public String horarioFecha;
	public int capacidade;
	public int lotacao;
	
	private Mensalistas mensalistas;
	private ArrayList<Veiculo> veiculos;
	
	public float retornoContratante;
	
	public Estacionamento() {
		this.valorFracao = 0.0f;
		this.valorHoraCheia = 0.0f;
		this.valorDiaria = 0.0f;
		this.valorDiariaNoturna = 0.0f;
		
		this.valorMensalista = 0.0f;
		this.valorEvento = 0.0f;
		
		this.horarioAbre = "";
		this.horarioFecha = "";
		this.capacidade = 0;
		this.veiculos = new ArrayList<Veiculo>();
		
		this.retornoContratante = 0.0f;
		
		this.mensalistas = new Mensalistas();
	}
	
	public Estacionamento(float valorFracao, float valorHoraCheia, float valorDiaria, float valorDiariaNoturna, 
			float valorMensalista, float valorEvento, String horarioAbre, String horarioFecha, 
			int capacidade, float retornoContratante) throws ValorAcessoInvalidoException, DescricaoEmBrancoException {
		
		this.setValorFracao(valorFracao);
		this.setValorHoraCheia(valorHoraCheia);
		this.setValorDiaria(valorDiaria);
		this.setValorDiariaNoturna(valorDiariaNoturna);
		
		this.setValorMensalista(valorMensalista);
		this.setValorEvento(valorEvento);
		
		this.setHorarioAbre(horarioAbre);
		this.setHorarioFecha(horarioFecha);
		this.setCapacidade(capacidade);
		this.setRetornoContratante(retornoContratante);
		
		this.veiculos = new ArrayList<Veiculo>();
	}

	public void setValorFracao(float valorFracao) throws ValorAcessoInvalidoException {
		if(valorFracao < 0) {
			throw new ValorAcessoInvalidoException("Valor Fração");
		} else {
			this.valorFracao = valorFracao;
		}
	}

	public void setValorHoraCheia(float valorHoraCheia) throws ValorAcessoInvalidoException {
		if(valorHoraCheia < 0) {
			throw new ValorAcessoInvalidoException("Valor Hora Cheia");
		} else {
			this.valorHoraCheia = valorHoraCheia;
		}
		
	}

	public void setValorDiaria(float valorDiaria) throws ValorAcessoInvalidoException {
		if(valorDiaria < 0) {
			throw new ValorAcessoInvalidoException("Valor Diaria");
		} else {
			this.valorDiaria = valorDiaria;
		}
		
	}

	public void setValorDiariaNoturna(float valorDiariaNoturna) throws ValorAcessoInvalidoException {
		if(valorDiariaNoturna < 0) {
			throw new ValorAcessoInvalidoException("Valor Diara Noturna");
		} else {
			this.valorDiariaNoturna = valorDiariaNoturna;
		}
		
	}

	public void setValorMensalista(float valorMensalista) throws ValorAcessoInvalidoException {
		if(valorMensalista < 0) {
			throw new ValorAcessoInvalidoException("Valor Mensalista");
		} else {
			this.valorMensalista = valorMensalista;
		}
		
	}

	public void setValorEvento(float valorEvento) throws ValorAcessoInvalidoException {
		if(valorEvento < 0) {
			throw new ValorAcessoInvalidoException("Valor Evento");
		} else {
			this.valorEvento = valorEvento;
		}
		
	}

	public void setHorarioAbre(String horarioAbre) throws DescricaoEmBrancoException {
		if(horarioAbre.isEmpty()) {
			throw new DescricaoEmBrancoException("Horário de Abertura");
		} else {
			this.horarioAbre = horarioAbre;
		}
		
	}

	public void setHorarioFecha(String horarioFecha) throws DescricaoEmBrancoException {
		if(horarioFecha.isEmpty()) {
			throw new DescricaoEmBrancoException("Horário de Fechamento");
		} else {
			this.horarioFecha = horarioFecha;
		}
		
	}

	public void setCapacidade(int capacidade) throws ValorAcessoInvalidoException {
		if(capacidade < 0) {
			throw new ValorAcessoInvalidoException("Capacidade");
		} else {
			this.capacidade = capacidade;
		}
		
	}

	public void setRetornoContratante(float retornoContratante) throws ValorAcessoInvalidoException {
		if(retornoContratante < 0) {
			throw new ValorAcessoInvalidoException("Retorno Contratante");
		} else {
			this.retornoContratante = retornoContratante;
		}
	}

	public void menuOpcoes() throws DescricaoEmBrancoException, ValorAcessoInvalidoException {
    	System.out.println("----------------------------------------------------");
        System.out.println("|                  Menu de Opções                  |");
        System.out.println("----------------------------------------------------\n");
        System.out.println("1 - Cadastrar Mensalista");
        System.out.println("2 - Cadastrar Evento");
        System.out.println("3 - Inserir Acesso");
        System.out.println("4 - Inserir Saída");
        System.out.println("5 - Calcular valores de repasse");
        System.out.println("0 - Sair");

        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                this.cadastrarMensalista();
                break;
            case 2:
                // this.estac2.menu();
                break;
            case 3:
                // this.estac3.menu();
                break;
            case 4:
                // this.estac3.menu();
                break;
            case 5:
                // this.estac3.menu();
                break;
            case 0:
                // this.running = false;
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
                
    }

	private void cadastrarMensalista() throws DescricaoEmBrancoException, ValorAcessoInvalidoException {
    	System.out.println("Insira a placa do mensalista: ");
    	String placaMensalista = input.next();
    	
    	Pattern pattern = Pattern.compile("^[A-z]{3}-[0-9]{4}$");
        if(!pattern.matcher(placaMensalista).find()) {
            throw new ValorAcessoInvalidoException("Placa");
        } else if(placaMensalista.isEmpty()) {
    		throw new DescricaoEmBrancoException("Placa");
    	} else {
    		this.mensalistas.cadastraMensalista(placaMensalista);
    		System.out.println("Mensalista Cadastrado!");
        	this.menuOpcoes();
    	}
	}
}


//	private Scanner input = new Scanner(System.in);
//	
//	public float valorFracao = 0.0f;
//	public float valorHoraCheia = 0.0f;
//	public float valorDiaria = 0.0f;
//	public float valorDiariaNoturna = 0.0f;
//	
//	public float valorMensalista = 0.0f;
//	public float valorEvento = 0.0f;
//	
//	public String horarioEntrada = "";
//	public String horarioSaida = "";
//	public int capacidade = 0;
//	public int capacidadeAtual = 0;
//	private Veiculo[] veiculos;
//	
//	public float retornoContratante = 0.0f;
//	
//	public Estacionamento(float valorFracao, float valorHoraCheia, float valorDiaria, float valorDiariaNoturna) {
//		this.valorFracao = valorFracao;
//		this.valorHoraCheia = valorHoraCheia;
//		this.valorDiaria = valorDiaria;
//		this.valorDiariaNoturna = valorDiariaNoturna;
//	}
//
//	public void cadastraValoresSecundarios(float valorMensalista, float valorEvento, int capacidade, float retornoContratante) {
//		this.valorMensalista = valorMensalista;
//		this.valorEvento = valorEvento;
//		this.capacidade = capacidade;
//		this.retornoContratante = retornoContratante;
//	}
//
//	public void ocupaVaga() {
//		this.capacidade = this.capacidade - 1;
//	}
//
//	public void atualizaCapacidade(int capacidade) {
//		this.capacidade = capacidade;
//	}
//	
//	public void cadastraHorarios(String horarioEntrada, String horarioSaida) {
//		this.horarioEntrada = horarioEntrada;
//		this.horarioSaida = horarioSaida;
//	}
//	
//	public void cadastraAcesso(){
//  
//		System.out.println("Digite a hora de entrada do veículo:");
//		String horaEntrada = input.next();
//
//		System.out.println("Digite a hora de saida do veículo:");
//		String horaSaida = input.next();
//
//		System.out.println("Digite a placa do veículo:");
//		String placa = input.next();
//
//		System.out.println("Digite o tipo de acesso desejado:");
//		String tipoAcesso = input.next();
//		
//		veiculos[this.capacidadeAtual] = new Veiculo(horarioEntrada,horarioSaida,placa,tipoAcesso);
//		this.capacidadeAtual++;
//		
//		System.out.println("Veiculo cadastrado no sistema!");
//	}
