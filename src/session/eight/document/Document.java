package session.eight.document;

public abstract class Document {
    protected int totalNumbers;
    protected String pattern;
    protected final String value;
    protected final String NUMBERS_REGEXP = "^[0-9]*$";

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

    public String getValue() {
        return value;
    }

    public abstract void validateMatcher();

    public abstract void validateValue();

    public abstract void validateDigit();

    public abstract void showDocument();

    public abstract boolean isValid();

    public abstract int getDigits();
}
