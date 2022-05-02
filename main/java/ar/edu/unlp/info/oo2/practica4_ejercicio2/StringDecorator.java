package ar.edu.unlp.info.oo2.practica4_ejercicio2;

public class StringDecorator extends FileDecorator {
	
	private String data;

	public StringDecorator(File wrappee, String data) {
		super(wrappee);
		this.data = data;
	}

	@Override
	public String prettyPrint() {
		return String.format("%s %s",wrappee.prettyPrint(), data);
	}

}
