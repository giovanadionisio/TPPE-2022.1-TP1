package app;

import java.util.HashMap;
import java.util.Map;


public class DiariaDiurna {
	
  private Map<String, Float> mapDiariaDiurna
    = new HashMap<String,Float>();

  
  private HashMap<String, Float[]> mapHorariosDiariaDiurna
  	= new HashMap<String, Float []>();
  
  public void cadastrarDiariaDiurna(String placa, float valorDiaria ,float horarioEntrada, float horarioSaida) {
	  Float[] horarios =  new Float[2];
	  
	  horarios[0] = horarioEntrada;
	  horarios[1] = horarioSaida;
	  
	  mapDiariaDiurna.put(placa, valorDiaria);
	  mapHorariosDiariaDiurna.put(placa, horarios);
  }

  public boolean contemDiariaDiurna(String placa) {
	  boolean contemPlaca  = mapDiariaDiurna.containsKey(placa);

		return contemPlaca;
  }

  public float getvalorDiaria(String placa) {
	  Float valor = (Float) mapDiariaDiurna.get(placa);
	  return valor;
  }
  
  public float getHorarioEntrada(String placa) {
	  	Float[] horarios = mapHorariosDiariaDiurna.get(placa);
	  	return horarios[0];
		
  }
  
  public float getHorarioSaida(String placa) {
	  	Float[] horarios = mapHorariosDiariaDiurna.get(placa);
	  	return horarios[1];
		
		
  }
  
  
  
}
