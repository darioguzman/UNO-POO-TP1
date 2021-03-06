package ar.uno.edu.interfaces.impl;

import ar.uno.edu.interfaces.Pila;

public class PilaEstatica implements Pila {
	
	public static int posicionActual = 0;
	
	private Integer pila[];
	
	private Integer tamanoPila;
	
	
	public PilaEstatica(Integer tamanoPila){
	
		this.pila = new Integer[tamanoPila];
		
		this.tamanoPila = tamanoPila;
	}
	
	@Override
	public void push(Integer dato) {
	
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
			
			return;
			
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
	public Integer peek() {
	
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
	
		this.pila = new Integer [tamanoPila];
		
	}
	
	
	
	public Integer[] getPila() {
		
		return pila;
	}

	
	public void setPila(Integer[] pila) {
	
		this.pila = pila;
	}

	
	public Integer getTamanoPila() {
	
		return tamanoPila;
	}

	
	public void setTamanoPila(Integer tamanoPila) {
	
		this.tamanoPila = tamanoPila;
	}

	
}
