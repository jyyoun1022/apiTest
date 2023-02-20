package org.codej.rest.JPA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterLab {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());

        Consumer<String> consumer = (str) -> System.out.println(str.split(" ")[0]);
        consumer.andThen(x -> System.out.println(x)).accept("Hello World");

        Function<String,Integer> function = (str) -> str.length();
        Integer result = function.apply("Hello World");
        System.out.println(result);

        Predicate<String> predicate = (str) -> str.length() == 11;
        boolean yesOrNo = predicate.test("Hello World");
        System.out.println(yesOrNo);
    }
}
