package app;

import java.util.Scanner;
import java.util.regex.Pattern;

import exceptions.*;

public class Programa {
    Scanner input = new Scanner(System.in);

    private Estacionamento estac1;
    private Estacionamento estac2;
    private Estacionamento estac3;
    private Veiculo[] veiculos;
    
    public Programa () {
    	this.cadastraEstacionamentos();
    }
    
    private void cadastraEstacionamentos() {
        this.estac1 = new Estacionamento(30.0f, 0.15f, 120.0f, 0.45f);
        estac1.cadastraValoresSecundarios(600.0f, 50.0f, 300, 0.5f);
        estac1.cadastraHorarios("06:00", "22:00");

        this.estac2 = new Estacionamento(20.0f, 0.10f, 70.0f, 0.30f);
        estac2.cadastraValoresSecundarios(455.0f, 60.0f, 120, 0.6f);
        estac2.cadastraHorarios("00:00", "23:59");
        
        this.estac3 = new Estacionamento(10.0f, 0.0f, 50.0f, 0.40f);
        estac3.cadastraValoresSecundarios(350.0f, 40.0f, 600, 0.7f);
        estac3.cadastraHorarios("06:00", "22:00");
    }

    public void recebeAcesso() {    	
    	// (valores do objeto de acesso)
        String placa = "HI139";
        String horaEntrada = "8:30";
        String horaSaida = "8:56";
        String tipoAcesso = "";
        float valorAcesso = 60.0f;
        float valorContratante = 30.0f;
        
        // total
        float totalAcesso = 0.0f;
        float contratante = 0.0f;

        if (tipoAcesso.equals("Mensalista")) {
            contratante = estac1.valorMensalista * estac1.retornoContratante;
        } else if (tipoAcesso.equals("Evento")) {
            contratante = estac1.valorEvento * estac1.retornoContratante;
        } else if (tipoAcesso.equals("Noturno")) {
            totalAcesso = estac1.valorDiaria * estac1.valorDiariaNoturna;
            contratante = totalAcesso * estac1.retornoContratante;
        } else {
        	long minutos = new Horario(horaEntrada, horaSaida).calculaMinutos();
            
            int tempo = (int) Math.round(minutos/15.0);
            System.out.println(tempo + "");
            
            if (Math.abs(tempo) < 4) {
            	totalAcesso = estac1.valorFracao * tempo;
            	contratante = totalAcesso * estac1.retornoContratante;
            	System.out.println(totalAcesso + "");
            	System.out.println(contratante + "");
            } else {
            	// Realiza calculo quando é igual ou mais de 1 hora (frações de 15 min) 
            }
        }
    }

    public static void main(String[] args) {
        Programa programa = new Programa();
        programa.recebeAcesso();
    }
}
