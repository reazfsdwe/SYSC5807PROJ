package qua;
public class NotEnoughPrecisionException extends Exception {
public NotEnoughPrecisionException() {
        super("Not enough precision to perform accurate calculation.");
        }

public NotEnoughPrecisionException(String message) {
        super(message);
        }
        }