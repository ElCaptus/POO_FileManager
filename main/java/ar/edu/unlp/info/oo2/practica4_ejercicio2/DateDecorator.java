package ar.edu.unlp.info.oo2.practica4_ejercicio2;

import java.util.Calendar;
import java.util.Date;

public class DateDecorator extends FileDecorator{
	
	private Date date;

	public DateDecorator(File wrappee, int day, int month, int year){
		super(wrappee);
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month, day);
		this.date = (Date) calendar.getTime();
	}

	@SuppressWarnings("deprecation")
	@Override
	public String prettyPrint() {
		return String.format("%s %s/%s/%s", wrappee.prettyPrint(),date.getDate(),date.getMonth(),date.getYear());
	}

}
