package app;

import java.util.regex.Pattern;

import exceptions.*;

public class Veiculo {
    private String placa;
    public Horario horario;
    public String tipoAcesso;

    public String getPlaca() {
        return this.placa;
    }
    
    public String tipoAcesso() {
        return this.tipoAcesso;
    }
    
    public void cadastraVeiculo(String horarioEntrada, String horarioSaida, String placa, String tipoAcesso) throws ValorAcessoInvalidoException, DescricaoEmBrancoException{
    	
    	this.horario = new Horario(horarioEntrada,horarioSaida);
    	
    	placa = placa.trim();
        if(placa.isEmpty()) {
            throw new DescricaoEmBrancoException("Placa");
        }
        
        //formato placa "antiga"
        Pattern pattern = Pattern.compile("^[A-z]{3}-[0-9]{4}$");
        if(!pattern.matcher(placa).find()) {
            throw new ValorAcessoInvalidoException("Placa");
        } else {
            this.placa = placa.toUpperCase();
        }
        
        if(tipoAcesso.isEmpty()) {
            throw new DescricaoEmBrancoException("Tipo Acesso");
        }
    }
}
