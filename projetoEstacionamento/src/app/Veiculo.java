package app;

import java.util.regex.Pattern;

import exceptions.*;

public class Veiculo {
    private String placa;
    public Horario horario;
    public Boolean ehEvento;
    
    public Veiculo(String p, String hi) {
    	this.placa = p;
    	this.horario = new Horario();
    	this.horario.horario1 = hi;
    }

	
    
}