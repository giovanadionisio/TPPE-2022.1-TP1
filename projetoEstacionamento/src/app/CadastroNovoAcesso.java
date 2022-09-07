package app;

import java.util.Scanner;

public class CadastroNovoAcesso {
	private Scanner input = new Scanner(System.in);
	
    private int veiculosQnt;
    private Eventos eventos;
    private int estacionamentoTam;
    private String acessoPorEvento = "S";

    public CadastroNovoAcesso(int veiculosQnt, Eventos eventos, int estacionamentoTam) {
        this.veiculosQnt = veiculosQnt;
        this.eventos = eventos;
        this.estacionamentoTam = estacionamentoTam;
    }
    
    public Veiculo computar() {
        if(this.veiculosQnt == this.estacionamentoTam) {
            System.out.println("Estacionamento lotado!");
        } else {
            if (this.eventos.eventos.size() > 0) {
                System.out.println("Acesso por evento? (S/n)");
                String ev = input.next();
                if(ev.contentEquals(acessoPorEvento) || ev.contentEquals(acessoPorEvento.toLowerCase())) {
                    System.out.println("Selecione o evento: ");
                    for (int i = 0; i < this.eventos.eventos.size(); i++) {
                        System.out.printf("%d - %s | Início %s | Fim %s\n", i+1, eventos.eventos.get(i).nome, eventos.eventos.get(i).horaInicio, eventos.eventos.get(i).horaFim);
                    }
                    int op = input.nextInt();
                    
                    System.out.println("Insira a placa do veículo:");
                    String pe = input.next();
                    
                    Veiculo v = new Veiculo(pe, this.eventos.eventos.get(op-1).horaInicio);
                    v.ehEvento = true;
                    v.horario.horario2 = this.eventos.eventos.get(op-1).horaFim;
                    
                    System.out.println("Veículo Cadastrado!");
                    return v;
                }
            } else {	
                System.out.println("Insira a placa do veículo:");
                String p = input.next();
                System.out.println("Insira o horário de entrada (HH:mi):");
                String hi = input.next();
                
                Veiculo v = new Veiculo(p, hi);
                System.out.println("Veículo Cadastrado!");
                return v;
            }
        }
        return null;
    }
}
