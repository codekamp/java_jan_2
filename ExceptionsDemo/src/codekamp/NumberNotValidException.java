package codekamp;

public class NumberNotValidException extends Exception {
    public String message;

    public NumberNotValidException(String msg) {
        this.message = msg;
    }
}