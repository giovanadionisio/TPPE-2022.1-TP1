package app;

import java.util.ArrayList;
import java.util.Scanner;

import exceptions.DescricaoEmBrancoException;
import exceptions.ValorAcessoInvalidoException;

public class Programa {
    private boolean running = true;
    private Scanner input = new Scanner(System.in);

    public ArrayList<Estacionamento> estacionamentos; 
    public Estacionamento estacionamentoAtual;
    

    public Programa() throws DescricaoEmBrancoException, ValorAcessoInvalidoException {
        this.estacionamentos = new ArrayList<Estacionamento>();
    }

	public void cadastraEstacionamento(Estacionamento estacionamento) {
		this.estacionamentos.add(estacionamento);
	}

    private void boasVindas() throws DescricaoEmBrancoException, ValorAcessoInvalidoException {
        while (this.running) {
            System.out.println("----------------------------------------------------");
            System.out.println("|      Bem-vindo ao sistema de estacionamento!     |");
            System.out.println("----------------------------------------------------\n");
            System.out.println("Para começar, selecione a opção desejada:");
            System.out.println("1 - Cadastrar Estacionamento");
            System.out.println("2 - Selecionar Estacionamento Existente");
            System.out.println("3 - Ver dados dos Estacionamentos Cadastrados");
            System.out.println("0 - Sair");

            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    this.cadastrarEstacionamento();
                    break;
                case 2:
                    this.selecionaEstacionamento();
                    break;
                case 3:
                    this.visualizarEstacionamentos();
                    break;
                case 0:
                    this.running = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
    
    private void cadastrarEstacionamento() throws ValorAcessoInvalidoException, DescricaoEmBrancoException {
    	 System.out.println("----------------------------------------------------");
         System.out.println("|          Cadastro de estacionamento!             |");
         System.out.println("----------------------------------------------------\n");
         
         System.out.println("Infome a capacidade do estacionamento:");
         int capacidade = input.nextInt();
         System.out.println("Infome o valor da fração de hora (R$):");
         float valorFracao = Float.parseFloat(input.next());
         System.out.println("Infome o valor da hora cheia (R$):");
         float valorHoraCheia = Float.parseFloat(input.next());
         System.out.println("Infome o valor da diária diurna (R$):");
         float valorDiaria = Float.parseFloat(input.next());
         System.out.println("Infome o percentual da diária noturna aplicado sobre o valor da diária diurna (%):");
         float valorDiariaNoturna = Float.parseFloat(input.next());
         System.out.println("Infome o valor do acesso mensalista (R$):");
         float valorMensalista = Float.parseFloat(input.next());
         System.out.println("Infome o valor do acesso por evento (R$):");
         float valorEvento = Float.parseFloat(input.next());
         System.out.println("Infome o horário de abertura do estacionamento:");
         String horarioAbre = input.next();
         System.out.println("Infome o horário de fechamento do estacionamento:");
         String horarioFecha = input.next();
         System.out.println("Infome o valor repassado ao contratante:");
         float retornoContratante = Float.parseFloat(input.next());
         
         this.cadastraEstacionamento(new Estacionamento(valorFracao, valorHoraCheia, valorDiaria, valorDiariaNoturna, valorMensalista, valorEvento, horarioAbre, horarioFecha, capacidade, retornoContratante));
         System.out.println("Estacionamento Cadastrado!\n\n");
         
         this.boasVindas();
    }

	private void visualizarEstacionamentos() {
		if(this.estacionamentos.size() == 0) {
			System.out.println("Nenhum estacionamento cadastrado!\n\n");
		} else {	
			for (int i = 0; i < estacionamentos.size(); i++) {
				System.out.printf("Estacionamento %d\n", i+1);
				System.out.printf("Valor fração: %f\n", estacionamentos.get(i).valorFracao);
				System.out.printf("Valor hora cheia: %f\n", estacionamentos.get(i).valorHoraCheia);
				System.out.printf("Valor diária diurna: %f\n", estacionamentos.get(i).valorDiaria);
				System.out.printf("Valor diária noturna: %f\n", estacionamentos.get(i).valorDiariaNoturna);
				System.out.printf("Valor acesso mensalista: %f\n", estacionamentos.get(i).valorMensalista);
				System.out.printf("Valor acesso evento: %f\n", estacionamentos.get(i).valorEvento);
				System.out.printf("Horario Abertura: %s\n", estacionamentos.get(i).horarioAbre);
				System.out.printf("Horario Fechamento: %s\n", estacionamentos.get(i).horarioFecha);
				System.out.printf("Capacidade: %d\n", estacionamentos.get(i).capacidade);
				System.out.printf("Retorno contratante: %f\n", estacionamentos.get(i).retornoContratante);
				System.out.printf("*******************************************************************\n\n");
			}
		}
	}

	private void selecionaEstacionamento() throws DescricaoEmBrancoException, ValorAcessoInvalidoException {
		if(this.estacionamentos.size() == 0) {
			System.out.println("Nenhum estacionamento cadastrado!\n\n");
		} else {
			for (int i = 0; i < estacionamentos.size(); i++) {
				System.out.printf("%d - Estacionamento %d\n",i+1, i+1);
			}
			
			int opcao = input.nextInt();
			this.estacionamentoAtual = estacionamentos.get(opcao-1);
			
			this.estacionamentoAtual.menuOpcoes();
		}
	}
    
    public static void main(String[] args) throws DescricaoEmBrancoException, ValorAcessoInvalidoException {
        Programa programa = new Programa();
        programa.boasVindas();
    }
}
