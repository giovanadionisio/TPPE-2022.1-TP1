package app;

import java.util.Scanner;

public class Programa {
    Scanner input = new Scanner(System.in);

    public String placa;
    public String horaEntrada;
    public String horaSaida;

    public Veiculo(String placa, String horaEntrada, String horaSaida) throws DescricaoEmBrancoException, ValorInvalidoException {
        try {
            setPlaca(placa);
        } catch(DescricaoEmBrancoException | ValorInvalidoException e) {
            throw e;
        }
    }

    public String getPlaca() {
        return placa;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setPlaca(String placa) throws ValorInvalidoException, DescricaoEmBrancoException {
        placa = placa.trim();
        if(placa.isEmpty()) {
            throw new DescricaoEmBrancoException("Placa");
        
        }
        
        //formato placa "antiga"
        Pattern pattern = Pattern.compile("^[A-z]{3}-[0-9]{4}$");
        if(!pattern.matcher(placa).find()) {
            throw new ValorInvalidoException("Placa");
        } else {
            this.placa = placa.toUpperCase();
        }
    }
    public void setHoraEntrada(String horaEntrada){
        //
    }

    public void setHoraSaida(String horaSaida){
        //
    }
    
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
            contratante = valorMensalista * retornoContratante;
        } else if (tipoAcesso.equals("Evento")) {
            contratante = valorEvento * retornoContratante;
        } else if (tipoAcesso.equals("Noturno")) {
            totalAcesso = valorDiaria * valorDiariaNoturna;
            contratante = totalAcesso * retornoContratante;
        } else {
        	long minutos = new Horario(horaEntrada, horaSaida).calculaMinutos();
            
            int tempo = (int) Math.round(minutos/15.0);
            System.out.println(tempo + "");
            
            if (tempo < 4) {
            	totalAcesso = valorFracao * tempo;
            	contratante = totalAcesso * retornoContratante;
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
