package session.one.operators;

public class LogicOperatorsTest {
    public static void main(String[] args) {
        var yorkOneIsDone = false;
        var yorkTwoIsDone = true;
        var buyIceCream = yorkOneIsDone || yorkTwoIsDone;
        // trabalho na terça (V ou F)
        System.out.println(yorkOneIsDone && yorkTwoIsDone ? "TV de 50''" : "Não comprou 50''");
        // trabalho na quinta (V ou F)
        System.out.println(yorkOneIsDone ^ yorkTwoIsDone ? "TV de 32''" : "Não comprou 32''");

        System.out.println(buyIceCream ? "Comprar sorvete" : "Ficar saldável!");
    }
}
