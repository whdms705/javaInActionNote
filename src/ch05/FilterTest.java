package ch05;

import ch04.Dish;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork",false,800,Dish.Type.MEAT),
                new Dish("beef",false,700,Dish.Type.MEAT),
                new Dish("chichken",false,400,Dish.Type.MEAT),
                new Dish("french fires",true,530,Dish.Type.OTHER),

                new Dish("rice",true,350,Dish.Type.OTHER),
                new Dish("season fruit",true,120,Dish.Type.OTHER),
                new Dish("pizza",true,550,Dish.Type.OTHER),
                new Dish("prawns",false,300,Dish.Type.FISH),
                new Dish("salmon",false,450,Dish.Type.FISH)
        );

        List<Dish> vegetarianMenu = menu.stream()
                                        .filter(Dish::isVefetarian)
                                        .collect(Collectors.toList());

        System.out.println(vegetarianMenu);

        // 고유 요소 필터링

        List<Integer> numbers = Arrays.asList(1,2,1,3,3,2,4);
        numbers.stream()
                .filter(i->i%2==0)
                .distinct()
                .forEach(System.out::println);


        // 스트림 축소
        List<Dish> dishes1 = menu.stream()
                                .filter(dish -> dish.getCalories() > 300)
                                .limit(3)
                                .collect(Collectors.toList());

        // 요소 건너뛰기
        List<Dish> dishes2 = menu.stream()
                                .filter(dish -> dish.getCalories() > 300)
                                .skip(2)
                                .collect(Collectors.toList());


    }
}
