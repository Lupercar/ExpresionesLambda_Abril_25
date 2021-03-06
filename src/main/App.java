package main;

public class App {

	public static void main(String[] args) {

		// creo el objeto de tipo ContenedorNumeros
		ContenedorNumeros cont = new ContenedorNumeros(6);

		// le doy valores
		cont.setNumero(0, 1.0);
		cont.setNumero(1, -2.0);
		cont.setNumero(2, 3.0);

		// ver contenido de una array
		System.out.println(cont);

		// hacemos la suma mediante la interfaz funcional tiene un parametro le
		// llamo v al parametro -> cada elemento lo multiplico por 2 y lo sumo
		System.out.println("La suma del array vale: " + cont.suma(v -> v * 2));

		// Multiplico por 2, le aplico el valor absoluto y sumo
		System.out.println("La suma valor absoluto del array vale: " + cont.suma(v -> Math.abs(v * 2)));
	}
}
