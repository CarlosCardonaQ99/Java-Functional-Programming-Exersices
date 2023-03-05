package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        //Imperative Java
        System.out.println("Without Predicate");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("090004573000"));

        //Test method
        System.out.println("With Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("090004573000"));

        System.out.println(
                "Is phone number valid and contains number 3 " +
                        isPhoneNumberValidPredicate.and(containsNumber3).test("0723454323"));

        System.out.println(
                "Is phone number valid and contains number 3 " +
                        isPhoneNumberValidPredicate.and(containsNumber3).test("07000000030"));
    }

    //Imperative
    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    //Predicate represents a predicate (boolean-valued function) of one argument
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}

