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
	private Eventos eventos;
	
	public float retornoContratante;
	
	public ArrayList<Veiculo> veiculos;
	public AcessoHoraCheia acessoHoraCheia;
	public DiariaNoturna acessoDiaraNoturna;
	public DiariaDiurna acessoDiariaDiurna;
	
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
		this.lotacao = 0;
		
		this.retornoContratante = 0.0f;
		
		this.mensalistas = new Mensalistas();
		this.eventos = new Eventos();
		
		this.veiculos = new ArrayList<Veiculo>();
		this.acessoHoraCheia = new AcessoHoraCheia();
		this.acessoDiaraNoturna = new DiariaNoturna();
		this.acessoDiariaDiurna = new DiariaDiurna();
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
		
		this.mensalistas = new Mensalistas();
		this.eventos = new Eventos();
		
		this.veiculos = new ArrayList<Veiculo>();
		this.acessoHoraCheia = new AcessoHoraCheia();
		this.acessoDiaraNoturna = new DiariaNoturna();
		this.acessoDiariaDiurna = new DiariaDiurna();
		
		this.veiculos.add(new Veiculo("ABC-1234", "08:30"));
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
        System.out.println("6 - Listar Eventos");
        System.out.println("0 - Sair");

        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                this.cadastrarMensalista();
                break;
            case 2:
                this.cadastrarEvento();
                break;
            case 3:
                this.novoAcesso();
                break;
            case 4:
                this.saida();
                break;
            case 5:
                // this.estac3.menu();
                break;
            case 6:
                this.listaEventos();
                break;
            case 0:
                // this.running = false;
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
                
    }

	private void saida() throws DescricaoEmBrancoException, ValorAcessoInvalidoException {
		if(this.veiculos.size() == 0) {
			System.out.println("Nenhum veículo cadastrado");
		} else {
			int op = menuSelecaoCarros();
			
			infereTipoAcessoSaida(op);
			
			this.menuOpcoes();
			
		}
		
	}

	private void infereTipoAcessoSaida(int op) {
		if(this.veiculos.get(op-1).ehEvento) {
			System.out.printf("Valor de evento (R$%.2f)\n", this.valorEvento);
		} else if (this.mensalistas.ehMensalista(this.veiculos.get(op-1).placa)) {
			System.out.printf("Valor de mensalista (R$%.2f mensais)\n", this.valorMensalista);
		} else {
			System.out.printf("Insira o horário de saída (HH:mi)\n");
			String hf = input.next();
			this.veiculos.get(op-1).horario.horario2 = hf;
			
			Horario h1 = new Horario("20:00", this.veiculos.get(op-1).horario.horario1);
			Horario h2 = new Horario(this.veiculos.get(op-1).horario.horario2, "08:00");
			
			System.out.print(h1.horario1);
			System.out.print(h1.horario2);
			System.out.print(h2.horario1);
			System.out.print(h2.horario2);
			
			if (h1.calculaMinutos() > 0 && h2.calculaMinutos() > 0) {
				this.acessoDiaraNoturna.cadastraDiariaNoturna(this.veiculos.get(op-1).placa, this.valorDiaria, this.veiculos.get(op-1).horario.horario1, this.veiculos.get(op-1).horario.horario2, this.valorDiariaNoturna);
				System.out.printf("Diaria Norturna %f\n", this.acessoDiaraNoturna.getValorDiariaNoturna(this.veiculos.get(op-1).placa));
			} else if (this.veiculos.get(op-1).horario.calculaMinutos() >= 360) {
				this.acessoDiariaDiurna.cadastraDiariaDiurna(this.veiculos.get(op-1).placa, this.valorDiaria, this.veiculos.get(op-1).horario.horario1, this.veiculos.get(op-1).horario.horario2);
				System.out.printf("Diaria Diurna %f\n", this.acessoDiariaDiurna.getValorDiaria(this.veiculos.get(op-1).placa));
			} else {
				this.acessoHoraCheia.cadastraAcessoHoraCheia(this.veiculos.get(op-1).placa, this.valorFracao, this.veiculos.get(op-1).horario.horario1, this.veiculos.get(op-1).horario.horario2, this.valorHoraCheia);
				System.out.printf("Hora Cheia %f\n", this.acessoHoraCheia.getValorAcessoHoraCheia(this.veiculos.get(op-1).placa));
			}
		}
	}

	private int menuSelecaoCarros() {
		System.out.println("Selecione o veículo");
		for (int i = 0; i < this.veiculos.size(); i++) {
			System.out.printf("%d - Placa: %s | Entrada: %s", i+1, this.veiculos.get(i).placa, this.veiculos.get(i).horario.horario1);
		}
		int op = input.nextInt();
		return op;
	}

	private void novoAcesso() throws DescricaoEmBrancoException, ValorAcessoInvalidoException {
		Veiculo novoVeiculo = new CadastroNovoAcesso(this.veiculos.size(), this.eventos, this.capacidade).computar();
		this.veiculos.add(novoVeiculo);
		this.menuOpcoes();
	}

	private void listaEventos() throws DescricaoEmBrancoException, ValorAcessoInvalidoException {
		if (this.eventos.eventos.size() == 0) {
			System.out.println("Nenhum evento cadastrado!\n\n");
			this.menuOpcoes();
		} else {
			for (int i = 0; i < this.eventos.eventos.size(); i++) {
				System.out.printf("%s | Início %s | Fim %s\n", eventos.eventos.get(i).nome, eventos.eventos.get(i).horaInicio, eventos.eventos.get(i).horaFim);
				System.out.printf("****************************\n\n");
			}
			this.menuOpcoes();
		}
		
	}

	private void cadastrarEvento() throws DescricaoEmBrancoException, ValorAcessoInvalidoException {
		System.out.println("Insira o nome do evento:");
		String n = input.next();
		System.out.println("Insira o horário de início do evento (HH:mm):");
		String hi = input.next();
		System.out.println("Insira o horário de fim do evento (HH:mm):");
		String hf = input.next();
		
		if (this.eventos.cadastraEvento(n, hi, hf)) {
			System.out.println("Evento cadastrado!");
			this.menuOpcoes();
		} else {
			System.out.println("Nome já utilizado!");
			this.cadastrarEvento();
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

	public float calculaValorContratante() {
		float montante = 0.0f;
		for (Veiculo v : veiculos) {
			if (v.ehEvento) {
				montante = montante + this.valorEvento;
			}
		}
		
		for (String s : this.acessoDiaraNoturna.placa) {
			montante = montante + this.acessoDiaraNoturna.getValorDiariaNoturna(s);
		}
		
		for (String s : this.acessoHoraCheia.placa) {
			montante = montante + this.acessoHoraCheia.getValorAcessoHoraCheia(s);
		}
		
		return montante;
	}
}
