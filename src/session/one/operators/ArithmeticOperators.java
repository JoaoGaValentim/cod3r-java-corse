package session.one.operators;

public class ArithmeticOperators {
   public static void main(String[] args) {
     var salary = 3000.5;
     var percentDiscount = 0.34;

     System.out.println(salary - (salary * percentDiscount));
     System.out.println(salary * percentDiscount);
     
     System.out.println(25 % 2);
     System.out.println(25 / 5.0);
     System.out.println(25 / 5.0 + 2 * 4 + 1);
   }
}
