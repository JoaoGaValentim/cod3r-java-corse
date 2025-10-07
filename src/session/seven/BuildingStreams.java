package session.seven;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class BuildingStreams {
    public static void main(String[] args) {
        Consumer<Object> print = System.out::println;

        Stream<String> programmingLanguages = Stream.of(
                "Java", "Python", "C++", "JavaScript", "C#", "Ruby", "Go", "Kotlin",
                "Swift", "PHP", "Rust", "TypeScript", "Scala", "Perl", "Objective-C",
                "Dart", "Haskell", "Elixir", "Clojure", "F#", "R", "MATLAB", "Groovy",
                "Lua", "Erlang", "Fortran", "COBOL", "Visual Basic", "Assembly", "Julia",
                "Shell", "PowerShell", "Delphi", "Prolog", "Scheme", "Smalltalk", "Ada",
                "Crystal", "OCaml", "Solidity", "VHDL", "PL/SQL", "ABAP", "Scratch",
                "SAS", "LabVIEW", "Awk", "PostScript", "Lisp", "Tcl", "Verilog");

        print.accept("--- actual/old ---");
        programmingLanguages.forEach(print);

        String[] oldProgrammingLanguages = {
                "Fortran", // 1957
                "Lisp", // 1958
                "COBOL", // 1959
                "ALGOL", // 1958
                "BASIC", // 1964
                "PL/I", // 1964
                "Simula", // 1967
                "Pascal", // 1970
                "C", // 1972
                "Prolog", // 1972
                "Smalltalk", // 1972
                "ML", // 1973
                "Ada", // 1980
                "Assembly" // 1940s-1950s
        };

        print.accept("--- old ---");
        Stream.of(oldProgrammingLanguages).forEach(print);
        print.accept("------");
        Arrays.stream(oldProgrammingLanguages).forEach(print);
        print.accept("------");
        Arrays.stream(oldProgrammingLanguages, 0, 5).forEach(print);

        // List of new programming languages (2020-now)
        List<String> latestProgrammingLanguages = Arrays.asList(
                "Bosque", // 2020
                "Vale", // 2020
                "V", // 2019 (gained traction in 2020s)
                "Bicep", // 2021
                "Wing", // 2022
                "Carbon", // 2022
                "Zig", // 2016 (gained popularity in 2020s)
                "Koka", // 2020
                "Nickel", // 2021
                "Hylo" // 2023
        );
        print.accept("--- new (2020-now) ---");
        latestProgrammingLanguages.stream().forEach(print);
        print.accept("--- new (2020-now) parallel ---");
        latestProgrammingLanguages.parallelStream().forEach(print);

        // Stream.generate(() -> "a").forEach(print);
        // Stream.iterate(0, n -> n + 1).forEach(print); <- Infinity
    }
}
