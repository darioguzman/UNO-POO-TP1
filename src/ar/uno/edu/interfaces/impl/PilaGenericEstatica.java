package ar.uno.edu.interfaces.impl;

import java.lang.reflect.Array;

import ar.uno.edu.interfaces.PilaGeneric;


public class PilaGenericEstatica <E> implements PilaGeneric<E> {
	
	public static int posicionActual = 0;
	
	private E pila[];
	
	private Integer tamanoPila;
	
	private String genericClass;
	
	public PilaGenericEstatica(Class<E> clazz , Integer tamanoPila){
	
		this.pila = (E[]) Array.newInstance(clazz, tamanoPila);
		
		this.tamanoPila = tamanoPila;
		
	}
	
	@Override
	public void push(E dato) {
	
		if (posicionActual == pila.length) {
			
			System.err.println("La pila se encuentra llena");
			
		} else {
			
			try {

				pila[posicionActual] = dato;
				
				posicionActual++;
				
			} catch (Exception e) {

				System.err.println("No se puede insertar el dato: " + dato + " ya que no es del tipo: " + pila.getClass().getSimpleName());
		
			}
				
				
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
	public E peek() {
	
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
	
		this.pila = (E[]) Array.newInstance(this.pila.getClass(), tamanoPila);
		
	}
	
}
