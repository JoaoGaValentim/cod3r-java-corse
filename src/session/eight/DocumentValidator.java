package session.eight;

import session.eight.document.Cpf;
import session.eight.document.exceptions.CpfMatcherException;
import session.eight.document.exceptions.CpfFieldValueException;

public class DocumentValidator {
    public static void main(String[] args) {
        try {
            Cpf cpf = new Cpf("333.433.221-22");
            cpf.showDocument();
            System.out.println(cpf.extractDigits());
        } catch (CpfMatcherException e) {
            System.err.println(e.getMessage());
        } catch (CpfFieldValueException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim da validação.");
    }
}
