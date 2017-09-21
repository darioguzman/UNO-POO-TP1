package ar.uno.edu.interfaces.impl;

import java.util.LinkedList;

import ar.uno.edu.interfaces.Pila;


public class PilaDinamica implements Pila {
	
	LinkedList<Integer> pila = new LinkedList<Integer>();
	
	@Override
	public void push(Integer dato) {
	
		pila.addLast(dato);
	}
	
	@Override
	public void pop() {
	
		if (pila.isEmpty()) {
			
			System.err.println("La pila se encuentra vacía.");
			
			return;
			
		}
		
		pila.removeLast();
	}
	
	@Override
	public Integer peek() {
	
		if (pila.isEmpty()) {
			
			System.err.println("La pila se encuentra vacía.");
			
			return null;
			
		}

		return pila.peekLast();
		
	}
	
	@Override
	public boolean isEmpty() {
	
		return pila.isEmpty();
	}
	
	@Override
	public void empty() {
	
		pila.clear();
		
	}
	
}
