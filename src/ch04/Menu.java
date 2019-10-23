package ch04;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Menu {
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

        List<String> threeHighCaloricDishNames =
                menu.stream()
                    .filter(dish -> dish.getCalories() > 300)
                    .map(Dish::getName)
                    .limit(3)
                    .collect(toList());

        System.out.println(threeHighCaloricDishNames);


        List<String> title = Arrays.asList("java","In","action");
        Stream<String> s = title.stream();
        s.forEach(System.out::println);
        s.forEach(System.out::println);

        //java collection 외부 반복
        List<String> names1 = new ArrayList<>();
        for(Dish dish:menu){
            names1.add(dish.getName());
        }

        // 스트림 내부 반복
        List<String> names2 = menu.stream()
                                    .map(Dish::getName)
                                    .collect(toList());


    }
}
