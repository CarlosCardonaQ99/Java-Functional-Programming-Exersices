package optionals;

import java.util.Optional;

public class MoreOptionals {
    public static void main(String[] args) {

        Optional<String> hello = Optional.ofNullable("pepitos");

        System.out.println("Is present? " + hello.isPresent());    //isPresent tells us if there is a value inside that optional
        System.out.println("Is empty? " + hello.isEmpty());     //if there is not a value inside that optional


        String orElseGetMerthod = hello.map(String::toUpperCase)
                .orElseGet(() -> {
                    //... EXTRA COMPUTATION TO RETRIEVE THE VALUE
                    return "world, null value";
                });
        System.out.println(orElseGetMerthod);

        //if hello is no present, print "the value is not present"
        String the_value_is_or_not_present = hello.orElse("The value is not present");
        System.out.println(the_value_is_or_not_present);

    }

}
