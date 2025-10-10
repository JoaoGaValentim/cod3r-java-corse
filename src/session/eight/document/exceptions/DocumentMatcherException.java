package session.eight.document.exceptions;

public abstract class DocumentMatcherException extends NullPointerException {

    private final String message;

    public DocumentMatcherException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return String.format("%s", message);
    }
}
