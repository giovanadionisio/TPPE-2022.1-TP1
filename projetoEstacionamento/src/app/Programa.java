package app;

import java.util.Scanner;

public class Programa {
    Scanner input = new Scanner(System.in);
    
    public void cadastraAcesso() {
    	//
    }

    public void recebeAcesso() {
    	// (valores do objeto de estacionamento)
    	float valorFracao = 30.0f;
    	float valorHoraCheia = 0.15f;
    	float valorDiaria = 120.0f;
    	float valorDiariaNoturna = 0.45f;

    	float valorMensalista = 600.0f;
    	float valorEvento = 50.0f;
    	
    	float retornoContratante = 0.5f;
    	
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
            contratante = valorMensalista * valorContratante;
        } else if (tipoAcesso.equals("Evento")) {
            contratante = valorEvento * valorContratante;
        } else if (tipoAcesso.equals("Noturno")) {
            totalAcesso = valorDiaria * valorDiariaNoturna;
            contratante = totalAcesso * valorContratante;
        } else {
            SimpleDateFormat format = new SimpleDateFormat("HH:mm");
            Date date1 = format.parse(horaEntrada);
            Date date2 = format.parse(horaSaida);
            long difference = date2.getTime() - date1.getTime();
        }
    }

    public static void main(String[] args) {
        Programa programa = new Programa();
        programa.recebeAcesso();
    }
}
