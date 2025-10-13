package session.nine.mathlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Function;

public class MathematicList<T extends Number> {
    private static Function<Double, Integer> binary = value -> {
        String binaryValue = Integer.toBinaryString(value.intValue());
        return Integer.parseInt(binaryValue);
    };

    private static <T extends Number> double factorial(T t) {
        double fat = 1;
        for (int i = 0; i < t.doubleValue(); i++) {
            fat = fat * (i + 1);
        }
        return fat;
    }

    private static <T extends Number> List<Double> createDoubleList(List<T> list) {
        if (list == null)
            return new ArrayList<>();
        return new ArrayList<>(list.stream().map(Number::doubleValue).toList());
    }

    public static <T extends Number> List<Double> extractOdds(List<T> list) {
        return createDoubleList(list).stream().filter(
                value -> value % 2 == 1).toList();
    }

    public static <T extends Number> List<Double> extractEvens(List<T> list) {
        return createDoubleList(list).stream().filter(
                value -> value % 2 == 0).toList();
    }

    public static <T extends Number> List<Double> noRepeatList(List<T> list) {
        TreeSet<Double> numbersSet = new TreeSet<>(createDoubleList(list));
        return numbersSet.stream().toList();
    }

    public static <T extends Number> double sum(List<T> list) {
        return createDoubleList(list).stream().mapToDouble(Double::doubleValue).sum();
    }

    public static <T extends Number> double sumDistinct(List<T> list) {
        return noRepeatList(list).stream().mapToDouble(Number::doubleValue).sum();
    }

    public static <T extends Number> Double sumMany(List<List<T>> lists) {
        List<Double> values = lists.stream().flatMap(List::stream).map(Number::doubleValue).toList();
        return sum(values);
    }

    public static <T extends Number> Double sumManyDistinct(List<List<T>> lists) {
        List<Double> values = lists.stream().flatMap(List::stream).map(Number::doubleValue).toList();
        return sumDistinct(values);
    }

    public static <T extends Number> List<Double> fats(List<T> list) {
        Function<Double, Double> factorials = value -> factorial(value.doubleValue());
        return createDoubleList(list).stream().map(factorials).toList();
    }

    public static <T extends Number> Double average(List<T> list) {
        double listTotal = sum(list);
        return listTotal / list.size();
    }

    public static <T extends Number> Double max(List<T> list) {
        List<Double> valuesDouble = createDoubleList(list).stream().toList();
        return Collections.max(valuesDouble);
    }

    public static <T extends Number> Double min(List<T> list) {
        List<Double> valuesDouble = createDoubleList(list).stream().toList();
        return Collections.min(valuesDouble);
    }

    public static <T extends Number> List<Integer> toBinaryList(List<T> list) {
        return createDoubleList(list).stream()
                .map(binary).toList();
    }

    public static <T extends Number, V extends Number> Double sumDoubleLists(List<T> firstList,
            List<V> lastList) {
        return sum(firstList) + sum(lastList);
    }

    public static <T extends Number, V extends Number> Double averageDoubleLists(List<T> firstList,
            List<V> lastList) {
        double firstAverage = average(firstList);
        double lastAverage = average(lastList);
        return (firstAverage + lastAverage) / 2;
    }

    public static <T extends Number> List<Double> unionTwo(List<T> firstList, List<T> lastList) {
        List<Double> firsts = createDoubleList(firstList);
        List<Double> lasts = createDoubleList(lastList);
        firsts.addAll(lasts);
        return firsts;
    }

    public static <T extends Number> List<Double> unionMany(List<List<T>> lists) {
        List<Double> unionResult = lists.stream().map(list -> createDoubleList(list))
                .reduce((acc, act) -> unionTwo(acc, act)).orElse(Collections.emptyList());

        return unionResult;
    }
}
