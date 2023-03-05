package streams;


import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;

public class _Stream {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Carlos", MALE),
                new Person("María", FEMALE),
                new Person("Lucía", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );

        //retorna los géneros que hay dentro de la lista people,
        // Collectors.ToSet() elimina los duplicados
        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);


        //Mostrar la longitud de los nombres
        people.stream().map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        //allMatch retorna true únicamente si todos los valores dentro del stream son iguales
        //anyMatch retorna true si existe al menos un elemento dentro del stream que cumpla la condición indicada
        // noneMatch retorna true si ningún elemento del stream coincide con el predicado proporcionado
        // o si el flujo está vacío; de lo contrario, es falso.

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);

        boolean containsOnlyFemale = people.stream().anyMatch(personPredicate);
        System.out.println(containsOnlyFemale);



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
