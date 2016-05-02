package main;

public class App {

	public static void main(String[] args) {
		
//		creo el objeto de tipo ContenedorNumeros
		ContenedorNumeros cont = new ContenedorNumeros(6); 
		
//		le doy valores 
		cont.setNumero(0, 1.0);
		cont.setNumero(1, 2.0);
		cont.setNumero(3, 3.0);
		
//		hacemos la suma
		cont.suma(transformacion); 
	}
}
