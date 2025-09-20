package session.one.operators;

public class TernaryOperators {
    public static void main(String[] args) {
        var age = 18;
        var isLegalAge = age >= 18 ? "Maior de idade" : "Menor de idade";

        System.out.println("IDADE = " + age);
        System.out.println(isLegalAge);

        var average = 10.0;
        var studentIsApproved = average <= 10 && average >= 5 ? "Aluno aprovado" : "Aluno Reprovado";
        System.out.println("MÉDIA = " + average);
        System.out.println(studentIsApproved);
    }
}
