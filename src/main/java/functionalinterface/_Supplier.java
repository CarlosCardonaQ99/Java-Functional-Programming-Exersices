package functionalinterface;

import java.util.function.Supplier;

//Supplier represents a suplier of results
public class _Supplier {
    public static void main(String[] args) {

        System.out.println(getDBConnectionUrl());

        //Supplier
        System.out.println(getDBConnectionUrlSuplier.get());

    }

    static String getDBConnectionUrl (){
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getDBConnectionUrlSuplier = () ->
            "jdbc://localhost:5432/users";
}
