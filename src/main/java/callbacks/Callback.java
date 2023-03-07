package callbacks;

import java.util.function.Consumer;

public class Callback {

    public static void main(String[] args) {

        hello("Carlos", null, value -> {
            System.out.println("No lastname provided for " + value);
        });

        hello2("Carlos 2", null, () -> System.out.println("No lastname provided"));
    }

                    //  Consumer with arguments
    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

                     //Runnable, without arguments
    static void hello2(String firstName, String lastName, Runnable callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.run();
        }
    }
}
