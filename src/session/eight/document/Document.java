package session.eight.document;

public abstract class Document {
    protected int totalNumbers;
    protected String pattern;
    protected final String value;

    protected Document() {
        totalNumbers = 0;
        pattern = null;
        value = null;
    }

    public Document(int totalNumbers, String pattern, String value) {
        this.totalNumbers = totalNumbers;
        this.pattern = pattern;
        this.value = value;
    }

    public abstract void validateDocumentIsFieldValue();

    public abstract void validateMatcherDocument();

    public abstract void showDocument();

    public abstract boolean isValid();

    public abstract int getDigits();
}
