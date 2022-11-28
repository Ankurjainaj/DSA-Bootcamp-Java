package com.Ankur;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionalInterfaceImpl {

    public static void main(String[] args) {
        Function<Integer, Double> fun = a -> a / 2.0;
        System.out.println(fun.apply(40));
        fun = fun.andThen(b -> b * 5);
        System.out.println(fun.apply(40));
        fun = fun.compose(a -> a % 4);
        System.out.println(fun.apply(40));
        Function<Object, Object> identity = Function.identity();
        UnaryOperator<Object> identity1 = UnaryOperator.identity();
        System.out.println(identity.apply(35));
        System.out.println(identity1.apply(35));
    }
}
