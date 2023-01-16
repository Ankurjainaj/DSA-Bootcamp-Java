package com.Ankur;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.regex.Pattern;

public class FunctionalInterfaceImpl {

    public static void main(String[] args) {
        //(Function<T,R> R== return type, T== input argument type)
        System.out.println("--------------- Functional Interface --------------");
        Function<Integer, Double> fun = a -> a / 2.0;
        System.out.println(fun.apply(40));
        fun = fun.andThen(b -> b * 5);
        System.out.println(fun.apply(40));
//        Function<Integer, Double>
        fun = fun.compose(a -> a / 4);
        System.out.println(fun.apply(40));
        Function<Object, Object> identity = Function.identity();
        UnaryOperator<Object> identity1 = UnaryOperator.identity();
        System.out.println(identity.apply(35));
        System.out.println(identity1.apply(35));

        class Employee {
            int age;
            String gender;

            public Employee(int age, String gender) {
                this.age = age;
                this.gender = gender;
            }
        }
        //Predicate && BiPredicate
        System.out.println("--------------- Predicate Interface --------------");

        Predicate<Employee> male = e -> e.gender.equals("Male");
        Predicate<Employee> adult = e -> e.age > 18;
        System.out.println(male.test(new Employee(12, "Male")));
        Predicate<Employee> maleAdult = male.and(adult).negate();
        BiPredicate<Integer, String> bp = (p, q) -> p > 18 && q.equalsIgnoreCase("Male");

        Predicate<String> pattern = Pattern.compile("asdf").asPredicate();

//        Consumer
        // Consumer to display a number
        System.out.println("--------------- Consumer Interface --------------");

        Consumer<Integer> display = System.out::println;
        // Implement display using accept()
        display.accept(10);
        Consumer<List<Integer>> modify = list -> list.replaceAll(integer -> 2 * integer);

        // Consumer to display a list of numbers
        Consumer<List<Integer>> dispList = list -> list.forEach(a -> System.out.print(a + " "));

        List<Integer> list = Arrays.asList(2, 1, 3);
        // Implement modify using accept() and included display using andThen()
        modify.andThen(dispList).accept(list);
        System.out.println();
//        Supplier
        System.out.println("--------------- Supplier Interface --------------");

        DoubleSupplier s1 = Math::random;
        System.out.println(s1.getAsDouble());

        Supplier<Double> s = Math::random;
        System.out.println(s.get());
    }
}
