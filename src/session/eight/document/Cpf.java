package session.eight.document;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import session.eight.document.exceptions.CpfMatcherException;
import session.eight.document.exceptions.CpfDigitException;
import session.eight.document.exceptions.CpfFieldValueException;

public class Cpf extends Document {
    private Pattern cpfPattern;
    private Matcher cpfMatcher;
    private final boolean cpfFormatIsValid;

    public Cpf(String value) {
        super(14, "(^\\d{3}\\x2E\\d{3}\\x2E\\d{3}\\x2D\\d{2}$)", value);
        validateValue();
        validateDigit();
        cpfFormatIsValid = isValid();
        validateMatcher();
    }

    @Override
    public void validateValue() {
        if (value == null || value.trim().isEmpty()) {
            throw new CpfFieldValueException();
        }
    }

    @Override
    public void validateMatcher() {
        if (!cpfFormatIsValid) {
            throw new CpfMatcherException(value);
        }
    }

    @Override
    public void validateDigit() {
        boolean cpfIsAllNumber = extractDigits().matches(NUMBERS_REGEXP);
        if (!cpfIsAllNumber) {
            throw new CpfDigitException();
        }
    }

    @Override
    public void showDocument() {
        System.out.println(value);
    }

    @Override
    public boolean isValid() {
        cpfPattern = Pattern.compile(pattern);
        cpfMatcher = cpfPattern.matcher(value);
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
