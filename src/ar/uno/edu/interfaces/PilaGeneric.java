package ar.uno.edu.interfaces;


public interface PilaGeneric <E> {
	
	/**
	 * @param dato
	 * 		Tipo @Generic, apila dicho dato en el tope de la pila
	 */
	public void push( E dato );
	
	/**
	 * desapila el dato apuntado por el tope de la pila
	 */
	public void pop( );
	
	/**
	 * devuelve el dato apuntado por el tope de la pila, pero no lo desapila.
	 */
	public E peek( );
	
	/**
	 * @return true/false
	 * 		verificar si la pila esta o no vacıa.
	 */
	public boolean isEmpty( );
	
	/**
	 * vaciar la pila
	 */
	public void empty( );
	
}
