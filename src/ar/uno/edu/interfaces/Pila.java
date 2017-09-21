package ar.uno.edu.interfaces;


public interface Pila {
	
	/**
	 * @param dato
	 * 		Tipo String, apila dicho dato en el tope de la pila
	 */
	public void push( String dato );
	
	/**
	 * desapila el dato apuntado por el tope de la pila
	 */
	public void pop( );
	
	/**
	 * devuelve el dato apuntado por el tope de la pila, pero no lo desapila.
	 */
	public String peek( );
	
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
