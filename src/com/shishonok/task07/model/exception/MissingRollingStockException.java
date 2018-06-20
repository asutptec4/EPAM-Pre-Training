package com.shishonok.task07.model.exception;

/**
 * This exception may be thrown by methods of TrainManager class when there is
 * no rolling stock in train.
 * 
 * @version 1 20.06.2018
 * @author Alexander Shishonok
 */
public class MissingRollingStockException extends Exception {
    public static final String NO_LOCOMOTIVE = "The train does not have a locomotive.";
    public static final String NO_RAILCARS = "The train does not have any railcars.";

    private static final long serialVersionUID = 1L;

    public MissingRollingStockException() {
    }

    public MissingRollingStockException(String arg0, Throwable arg1) {
	super(arg0, arg1);
    }

    public MissingRollingStockException(String arg0) {
	super(arg0);
    }

    public MissingRollingStockException(Throwable arg0) {
	super(arg0);
    }

}
