package ar.uno.edu.interfaces.impl;

import ar.uno.edu.interfaces.Pila;

public class PilaEstatica implements Pila {
	
	public static int posicionActual = 0;
	
	private String pila[];
	
	@Override
	public void push(String dato) {
	
		if (posicionActual == pila.length) {
			
			System.err.println("La pila se encuentra llena");
			
		} else {
			
			pila[posicionActual] = dato;
			
			posicionActual++;
		}
		
	}
	
	@Override
	public void pop() {
	
		if (posicionActual == 0) {
			
			System.err.println("Pila vacia");
			
		} else if (posicionActual == pila.length) {

			//para solventar el inconveniente cuando la pila este llena y posición actual este fuera de rango
			
			posicionActual--;
			
			pila[posicionActual] = null;
			// Se vuelva a decrementar para que este en la posicion
			// correcta, porque tenia un numero demás por el insertar
			posicionActual--;
					
		} else {
			
			pila[posicionActual] = null;
			
			posicionActual--;
		
		}
		
	}
	
	@Override
	public String peek() {
	
		if (posicionActual == 0){
			
			System.err.println("La pila se encuentra vacía.");
		
			return null;
		}
		
		if (posicionActual == pila.length) {
			
			//para solventar el inconveniente cuando la pila este llena y posición actual este fuera de rango
			return pila [posicionActual--];
			
		}
		
		return pila [posicionActual];
		
	}
	
	@Override
	public boolean isEmpty() {
	
		return posicionActual == 0;
	}
	
	@Override
	public void empty() {
	
		
		
	}
	
}
