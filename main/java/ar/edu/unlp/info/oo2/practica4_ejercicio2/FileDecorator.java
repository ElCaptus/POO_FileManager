package ar.edu.unlp.info.oo2.practica4_ejercicio2;

public abstract class FileDecorator implements File {
	
	protected File wrappee;
	
	public FileDecorator(File wrappee) {
		this.wrappee = wrappee;
	}
	
}
