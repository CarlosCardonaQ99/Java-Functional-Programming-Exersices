package imperative;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Carlos", Gender.MALE),
                new Person("María", Gender.FEMALE),
                new Person("Lucía", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Alice", Gender.FEMALE)
        );


        //Imperative way
        List<Person> females = new ArrayList<>();
        for (Person person : people){
            if(Gender.FEMALE.equals(person.gender)){
                females.add(person);
            }
        }
        for (Person female : females){
            System.out.println(female);
        }

        //Declarative approach

        people.stream().
                filter(person -> person.gender.equals(Gender.FEMALE)).
                collect(Collectors.toList())
                .forEach(System.out::println);

    }



    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE;
    }
}
