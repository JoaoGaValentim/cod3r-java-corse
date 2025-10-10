package session.eight.document.exceptions;

public class CpfMatcherException extends DocumentMatcherException {
    public CpfMatcherException(String cpf) {
        super(String.format("CpfMatcherException: CPF(%s) format is invalid", cpf));
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
