package ar.uno.edu.interfaces;


public interface ColaGeneric <E> {
	
	/**
	 * @param dato
	 * 	Tipo E @Generic, acola un dato en la cola.
	 */
	public void offer(E dato);
	
	/**
	 * desacola el dato de la cola.
	 */
	public void poll();
	
	/**
	 * devuelva el dato próximo a desacolarse, pero no lo desacola.
	 */
	public String peek(); 
	
	/**
	 * @return true/false
	 * verificar si la cola esta o no vacía.
	 */
	public boolean isEmpty( );
	
	/**
	 * vaciar la cola
	 */
	public void empty( );
}
