package ar.edu.unlp.info.oo2.practica4_ejercicio2;

public class FileData implements File {

	private String info;
	private String nombre;
	
	public FileData( String info ) {
		this.info = info;
	}
	
	@Override
	public String prettyPrint() {
		return info;
	}

}
