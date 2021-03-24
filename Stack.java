package edu.mtc.egr283.Stack;

import edu.mtc.egr283.dll.DLL;

/**
 * @author Jacob Vaught
 *
 * @param <T>
 */
public class Stack<T> {

	public DLL<T> top;

	/**
	 * Default Constructor
	 */
	public Stack() {
		DLL<T> top = new DLL<T>();
	}//ending bracket of method
	
	/**
	 * @return boolean <code>isEmpty</code>
	 */
	public boolean isEmpty() {
		return top.isEmpty();
	}//ending bracket of method
	
	/**
	 * @return T data at head of List, else returns null
	 */
	public T peek() {
		if(this.isEmpty()) {
			return null;
		} else {
			return top.getDataAtPosition(0);
		}//ending bracket of if
	}//ending bracket of method
	
	/**
	 * @return T <code>returnData</code>
	 * @throws <code>StackPopException</code>
	 */
	public T pop() throws StackPopException {
		if(this.isEmpty()) {
			throw new StackPopException("Tried to pop an empty stack.");
		} else {
			T returnData = top.getDataAtPosition(0);
			top.remove(0);
			return returnData;
		}//ending bracket of if
	}//ending bracket of method
	
	// CAVEAT: Note that we always assume we have enough memory to
	// add to the underlying linked list. Runaway programs
	// will crash ungracefully.
	
	
	/**
	 * @param T <code>newStackData</code>
	 */
	public void push(T newStackData){
		top.addAtHead(newStackData);
	}//ending bracket of method

}//ending bracket of class
