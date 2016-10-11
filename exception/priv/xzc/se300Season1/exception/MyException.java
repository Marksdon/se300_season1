package priv.xzc.se300Season1.exception;

/**
 * 
 * @author randall
 *
 */
public class MyException extends Exception{
	
    /**
     * Constructs an {@code MyException} with {@code null}
     * as its error detail message.
     */
	public MyException(){
	}

    /**
     * Constructs an {@code MyException} with the specified detail message.
     *
     * @param message
     *        The detail message (which is saved for later retrieval
     *        by the {@link #getMessage()} method)
     */
    public MyException(String message) {
        super(message);
    }
}
