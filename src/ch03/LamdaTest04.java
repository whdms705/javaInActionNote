package ch03;

import java.util.*;
import java.util.function.Predicate;

public class LamdaTest04 {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN),
                new Apple(120, Color.RED)
        );

        List<Apple> redApples = filter(inventory, (Apple a) -> a.getColor() == Color.RED);

        System.out.println(redApples);

        // Predicate 조합
        // negate



        //


    }
    public static List<Apple> filter(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    interface ApplePredicate {

        boolean test(Apple a);

    }
}
