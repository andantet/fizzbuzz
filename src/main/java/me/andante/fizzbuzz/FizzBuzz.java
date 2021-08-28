package me.andante.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            boolean fizz = i % 3 == 0;
            boolean buzz = i % 5 == 0;

            StringBuilder builder = new StringBuilder();
            if (fizz) {
                builder.append("Fizz");
            }
            if (buzz) {
                builder.append("Buzz");
            }

            System.out.println(builder.isEmpty() ? i : builder.toString());
        }
    }
}
