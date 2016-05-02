package main;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

import main.interfaces.ITransformacion;

public class ContenedorNumeros {
	// Hacemos que almacene un Array de Numeros
	private double[] numeros;

	public ContenedorNumeros(int numeroElementos) {

		if (numeroElementos > 0)
			// constructor que crea el array en memoria
			numeros = new double[numeroElementos];
	}

	// metodo que nos devuelve el contenido de un numero en una cierta posicion
	public double getNumero(int posicion) {
		double retorno = 0.0;
		if ((posicion >= 0) && posicion < numeros.length)
			retorno = numeros[posicion];
		else
			throw new ArrayIndexOutOfBoundsException("Posicion fuera del rango de los valores");
		return retorno;
	}

	public void setNumero(int posicion, double valor) {
		// la posicion sobreescribe si ya existe
		if ((posicion >= 0) && posicion < numeros.length) {
			numeros[posicion] = valor;
		}
		else 
			throw new ArrayIndexOutOfBoundsException("Posicion fuera del rango de los valores"); 
	}
	
	public double suma(ITransformacion transformacion){
		//A cada elemento le aplica una cierta transformacion y luego acumula el valor
		
	}
}
