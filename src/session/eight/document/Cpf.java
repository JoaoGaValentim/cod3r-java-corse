package session.eight.document;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import session.eight.document.exceptions.CpfMatcherException;
import session.eight.document.exceptions.CpfFieldValueException;

public class Cpf extends Document {
    private final Pattern cpfPattern;
    private final Matcher cpfMatcher;

    public Cpf(String value) {
        super(14, "(^\\d{3}\\x2E\\d{3}\\x2E\\d{3}\\x2D\\d{2}$)", value);
        validateDocumentIsFieldValue();
        cpfPattern = Pattern.compile(pattern);
        cpfMatcher = cpfPattern.matcher(value);
        validateMatcherDocument();
    }

    @Override
    public void validateDocumentIsFieldValue() {
        if (value == null || value.trim().isEmpty()) {
            throw new CpfFieldValueException();
        }
    }

    @Override
    public void validateMatcherDocument() {
        if (!cpfMatcher.matches()) {
            throw new CpfMatcherException(value);
        }
    }

    @Override
    public void showDocument() {
        System.out.println(value);
    }

    @Override
    public boolean isValid() {
        return cpfMatcher.matches();
    }

    public String getValue() {
        return value;
    }

    @Override
    public int getDigits() {
        return totalNumbers;
    }

    public String extractDigits() {
        return value.replace(".", "")
                .replace("-", "");
    }
}
