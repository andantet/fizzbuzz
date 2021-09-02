package me.andante.fizzbuzz;

import com.google.common.collect.ImmutableMap;

import java.util.Map;
import java.util.function.Predicate;

public class FizzBuzz {
    public static final ImmutableMap<Predicate<Integer>, String> PREDICATES =
        new ImmutableMap.Builder<Predicate<Integer>, String>()
            .put(i -> i % 3 == 0, "Fizz")
            .put(i -> i % 5 == 0, "Buzz")
        .build();

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            StringBuilder builder = new StringBuilder();
            for (Map.Entry<Predicate<Integer>, String> entry : PREDICATES.entrySet()) {
                Predicate<Integer> p = entry.getKey();
                if (p.test(i)) {
                    builder.append(entry.getValue());
                }
            }

            System.out.println(builder.isEmpty() ? i : builder.toString());
        }
    }
}
