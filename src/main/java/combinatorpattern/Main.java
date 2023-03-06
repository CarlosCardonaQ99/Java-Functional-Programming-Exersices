package combinatorpattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Allice", "alice@gmail.com",
                "+0989879", LocalDate.of(2000, 1, 1));

        //NORMAL WAY

        /*CustomerValidatorService validatorService = new CustomerValidatorService();
        System.out.println(validatorService.isValid(customer));*/

        // System.out.println(new CustomerValidatorService().isValid(customer));
        // if is valid we can store customer in db

        //USING COMBINATOR PATTERN
        ValidationResult result = CustomerRegistrationValidator
                .isEmailValid()
                .and(CustomerRegistrationValidator.isPhoneNumberValid())
                .and(CustomerRegistrationValidator.IsAdult())
                .apply(customer);
        System.out.println(result);
        if (result != ValidationResult.SUCCES) {
            throw new IllegalStateException(result.name());
        }
    }
}
