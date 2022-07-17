package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Horario {
	private SimpleDateFormat format;
	public String horario1;
	public String horario2;
	
	public Horario(String horario1, String horario2) {
		format = new SimpleDateFormat("HH:mm");
		this.horario1 = horario1;
		this.horario2 = horario2;
	}
	
	public long calculaMinutos() {
        Date date1 = null;
        Date date2 = null;
        
		try {
			date1 = format.parse(horario1);
			date2 = format.parse(horario2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        long difference = (date2.getTime() - date1.getTime()) / 60000;
        return difference;
	}
}
