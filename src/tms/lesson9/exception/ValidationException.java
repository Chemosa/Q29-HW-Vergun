package tms.lesson9.exception;

public class ValidationException extends RuntimeException {

    private String validateMessage;

    public ValidationException(String validateMessage) {
        this.validateMessage = validateMessage;
    }

    public String getValidateMessage() {
        return validateMessage;
    }
}
