package api.Aula3_Desafios;

public class SenhaInvalidaException extends RuntimeException {
    private String message;
    
    public SenhaInvalidaException(String message) {
        this.message = message;
    }
    
    @Override
    public String getMessage() {
        return this.message;
    }
    
}
