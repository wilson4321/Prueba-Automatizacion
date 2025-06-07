package exceptions;

public class ResultadoInesperado extends AssertionError{

    public ResultadoInesperado (String message, Throwable cause){

        super(message, cause);
    }
}