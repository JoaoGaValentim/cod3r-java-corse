package session.eight.document.exceptions;

public class CpfFieldValueException extends IllegalArgumentException {
    public CpfFieldValueException() {
        super("CpfFieldValueException: CPF don't have null or empty value");
    }
}
