package session.seven;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class StringStream {

    private StringStream() {
        // não pode instanciar
    }

    public static final Function<String, String> toUpper = lang -> lang.toUpperCase();
    public static final UnaryOperator<String> firstLetter = lang -> lang.charAt(0) + "";
    public static final Consumer<Object> print = System.out::println;
    public static final String vocals = "aeiouãõAEIOUÃÕ";
    public static final Function<String, String> letterClassify = letter -> vocals.contains(letter) ? "Vogal"
            : "Consoante";
    public static final Function<List<String>, Set<String>> noRepeat = langs -> {
        Set<String> values = new HashSet<String>(langs);
        values.addAll(values);
        return values;
    };
}
