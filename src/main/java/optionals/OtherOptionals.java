package optionals;

import java.util.Optional;

public class OtherOptionals {
    public static void main(String[] args) {
        Person person = new Person("Carlos", "CARLOS@GMAIL.COM");

        String email = person.getEmail()
                .map(String::toLowerCase)
                .orElse("Email no provided");

        System.out.println(email);

                //ANOTHER WAY TO DO
       /* if(person.getEmail().isPresent()){
            String email = person.getEmail().get();
            System.out.println(email.toLowerCase());

        }else {
            System.out.println(" No email provided ");
        }*/
    }

    static class Person {
        private final String name;
        private final String email;

        public Person(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public Optional<String> getEmail() {
            return Optional.ofNullable(email);
        }
    }

}
