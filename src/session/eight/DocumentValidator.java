package session.eight;

import java.util.Scanner;

import session.eight.document.Cpf;
import session.eight.document.exceptions.CpfMatcherException;
import session.eight.document.exceptions.CpfDigitException;
import session.eight.document.exceptions.CpfFieldValueException;

public class DocumentValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um CPF >> ");
        String entry = sc.nextLine();
        try {
            Cpf cpf = new Cpf(entry);
            cpf.showDocument();
            System.out.println(cpf.extractDigits());
            System.out.println(cpf.isValid());
        } catch (CpfFieldValueException e) {
            System.out.println(e.getMessage());
        } catch (CpfDigitException e) {
            System.out.println(e.getMessage());
        } catch (CpfMatcherException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim da validação.");
        sc.close();
    }
}
