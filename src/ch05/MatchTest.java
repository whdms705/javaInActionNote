package ch05;

import ch04.Dish;

import java.util.Arrays;
import java.util.List;

public class MatchTest {
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

        /*5.4.1 프레디케이트가 적어도 한 요소와 일치하는지 확인  EX */
        if(menu.stream().anyMatch(Dish::isVefetarian)){
            System.out.println("isVefetarian");
        }

        /*5.4.2 프레디케이트가 모든 요소와 일치하는지 검사 - allMatch */
        boolean isHealthy = menu.stream()
                                .allMatch(dish -> dish.getCalories() < 1000);

    }
}
