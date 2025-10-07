package session.seven;

import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class MapStream {
    public static void main(String[] args) {
        List<String> programmingLanguages = List.of(
                "Java", "Python", "C++", "JavaScript", "C#", "Ruby", "Go", "Kotlin",
                "Swift", "PHP", "Rust", "TypeScript", "Scala", "Perl", "Objective-C",
                "Dart", "Haskell", "Elixir", "Clojure", "F#", "R", "MATLAB", "Groovy",
                "Lua", "Erlang", "Fortran", "COBOL", "Visual Basic", "Assembly", "Julia",
                "Shell", "PowerShell", "Delphi", "Prolog", "Scheme", "Smalltalk", "Ada",
                "Crystal", "OCaml", "Solidity", "VHDL", "PL/SQL", "ABAP", "Scratch",
                "SAS", "LabVIEW", "Awk", "PostScript", "Lisp", "Tcl", "Verilog");

        var programmingLanguagesList = getList(programmingLanguages);

        System.out.println("-- repetir --");
        programmingLanguagesList.forEach(StringStream.print);
        System.out.println("-- sem repetir --");
        forEachByFunc(StringStream.noRepeat, programmingLanguagesList);
    }

    static List<String> getList(List<String> list) {
        return list.stream()
                .map(StringStream.toUpper)
                .map(StringStream.firstLetter)
                .map(StringStream.letterClassify)
                .toList();
    }

    static void forEachByFunc(Function<List<String>, Set<String>> function, List<String> list) {
        function.apply(list)
                .forEach(StringStream.print);
    }
}
