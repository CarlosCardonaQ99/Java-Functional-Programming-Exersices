package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        //modo tradicional
        int increment = incrementByOne(1);
        System.out.println(increment);

        //FUNCTION takes one argument and produces one result

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2 + " using funcional programming");

        //AndThen Function's method

       int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(1 ) + " With andThen");

        //BIFUNCTION takes two arguments and produces one result

        System.out.println(incrementByOneAndMultyplyBifunction.apply(4, 100) + " using bifunction");


    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

   static BiFunction<Integer, Integer, Integer> incrementByOneAndMultyplyBifunction
            = (numberToIncrementByOne, numberToMulplyBy)
            -> (numberToIncrementByOne +1) * numberToMulplyBy;

   //normal way
    static int incrementByOne(int number) {
        return number + 1;
    }


}
