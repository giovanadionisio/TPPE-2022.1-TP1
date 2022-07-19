package app;

import java.util.regex.Pattern;

import exceptions.*;

public class Veiculo {
    public String placa;
    public Horario horario;
    public Boolean ehEvento;
    
    public Veiculo(String p, String hi) {
    	this.placa = p;
    	this.horario = new Horario();
    	this.horario.horario1 = hi;
    	ehEvento = false;
    }
    
    public Veiculo(String p, Boolean ehEvento) {
    	this.placa = p;
    	this.ehEvento = ehEvento;
    }

	
    
}