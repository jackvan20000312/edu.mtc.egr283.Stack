package edu.mtc.egr283.Stack;

public class StackPopException extends Exception {
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor.  Calls the parent Exception class.
	 * @param newMessage The message to display.
	 */
	public StackPopException(String newMessage) {
		super(newMessage);
	}// Ending bracket of constructor
	
	/**
	 * Default constructor. Sets default message to read "Item is not in the list".
	 */
	public StackPopException() {
		this("Stack Is Empty.");
	}// Ending bracket of default constructor
}
