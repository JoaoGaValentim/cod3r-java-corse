package session.eight.document.exceptions;

public class CpfDigitException extends IllegalArgumentException {
    public CpfDigitException() {
        super("CpfDigitException: CPF digits is numbers don't letter");
    }
}
