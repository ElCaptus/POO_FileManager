package ar.edu.unlp.info.oo2.practica4_ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileTest {
	
	File file1;
	File file2;
	File file3;
	
	File fileEmpty;
	
	//nombre - extsensión
	//nombre - extensión - fecha de creación
	//permisos - nombre - extensión - tamaño

	
	@BeforeEach
	void setUp () throws Exception{		
		
		fileEmpty = new FileData("Empty");
		
		file1 = new FileData("'Contenido File1.'");
		file1 = new StringDecorator(file1,"File1");
		file1 = new StringDecorator(file1,".txt");
		
		file2 = new FileData("'Nace Captus.'");
		file2 = new StringDecorator(file2,"Certificado de Nacimiento");
		file2 = new StringDecorator(file2,".pdf");
		file2 = new DateDecorator(file2, 11, 6, 1998);
		
		file3 = new FileData("'Juego 3d.'");
		file3 = new StringDecorator(file3,"<-rwx--x--->");
		file3 = new StringDecorator(file3,"LoL");
		file3 = new StringDecorator(file3,".exe");
		file3 = new StringDecorator(file3,"17GB");
	}
	
	@Test
	public void emptyFile() {
		assertEquals("Empty", fileEmpty.prettyPrint());
	}
	
	@Test
	public void impresionTest() {
		assertEquals("'Contenido File1.' File1 .txt",file1.prettyPrint());
		System.out.println(file1.prettyPrint());
		
		assertEquals("'Nace Captus.' Certificado de Nacimiento .pdf 11/6/98",file2.prettyPrint());
		System.out.println(file2.prettyPrint());
		
		assertEquals("'Juego 3d.' <-rwx--x---> LoL .exe 17GB",file3.prettyPrint());
		System.out.println(file3.prettyPrint());
	}

}
