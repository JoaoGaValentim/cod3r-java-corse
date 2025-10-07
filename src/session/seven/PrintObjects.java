package session.seven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class PrintObjects {
    public static void main(String[] args) {
        List<String> approves = Arrays.asList(
                "João", "Clara", "Lucas", "Maria", "Pedro", "Ana", "Carlos", "Fernanda",
                "Rafael", "Juliana", "Bruno", "Patrícia", "Gabriel", "Amanda", "Felipe",
                "Camila", "Rodrigo", "Larissa", "Gustavo", "Beatriz", "Eduardo", "Sofia",
                "Leonardo", "Isabela", "Matheus", "Letícia", "Vinícius", "Mariana", "Thiago",
                "Aline", "Daniel", "Carolina", "André", "Gabriela", "Diego", "Renata", "Vitor",
                "Tatiane", "Samuel", "Vanessa", "Ricardo", "Simone", "Fábio", "Elaine", "Paulo",
                "Débora", "Alex", "Michele", "Roberto", "Cristiane", "Sérgio", "Jéssica", "Marcelo",
                "Natália", "Fernando", "Priscila", "Leandro", "Sandra", "Maurício", "Monique", "Caio");

        System.out.println("--- usando for(var v: l) ---");

        for (String names : approves) {
            System.out.println(names);
        }

        System.out.println("--- usando iterator ---");

        Iterator<String> it = approves.iterator();

        while (it.hasNext()) {
            System.out.println(it.next()); // ocorre internamente
        }

        Stream<String> st = approves.stream();

        System.out.println("--- usando stream ---");

        List<String> namesWithJ = st
                .filter(name -> name.startsWith("J"))
                .map(name -> name)
                .toList();

        namesWithJ.forEach(System.out::println);
    }
}
