package com.shishonok.task07.model.exception;

/**
 * This exception may be thrown by methods of TrainCompany when there is no
 * train.
 * 
 * @version 1 20.06.2018
 * @author Alexander Shishonok
 */
public class NoTrainsException extends Exception {

    private static final long serialVersionUID = 1L;

    public NoTrainsException() {
    }

    public NoTrainsException(String message, Throwable cause) {
	super(message, cause);
    }

    public NoTrainsException(String message) {
	super(message);
    }

    public NoTrainsException(Throwable cause) {
	super(cause);
    }

}
