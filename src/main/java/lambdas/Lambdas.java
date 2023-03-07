package lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {

        Function<String, String> upperCaseName = name -> name.toUpperCase();

        Function<String, String> upperCaseName2 = String::toUpperCase;

        Function<String, String> upperCaseName3 = name -> {
            if (name.isBlank()) throw new IllegalArgumentException("");
            return name.toUpperCase();
        };

        BiFunction<String, Integer, String> upperCaseNameBiFucntion = (name, age) -> {
            if (name.isBlank()) throw new IllegalArgumentException("Error. name must not be empty");
            System.out.println(age);
            return name.toUpperCase();
        };

        System.out.println(upperCaseName.apply("Carlos"));
        System.out.println(upperCaseName2.apply("carlitos"));
        System.out.println(upperCaseName3.apply("carl"));

        System.out.println(upperCaseNameBiFucntion.apply("Carlos", 25) + " Using Bifunction");

    }
}
