package ch05;

import ch04.Dish;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingTest {
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

        /* 5.3.1 스트림의 각 요소에 함수 적용하기 EX */
        List<String> words = Arrays.asList("modern","java","in","action");

        List<Integer> wordLength = words.stream()
                                        .map(String::length)
                                        .collect(Collectors.toList());

        /*고유문자로 이루어진 리스트를 반환해보기*/

        List<String> words2 = Arrays.asList("hello","world");

        List<String> uniqueCharacters = words2.stream()
                                                .map(word->word.split(""))
                                                .flatMap(Arrays::stream)
                                                .distinct()
                                                .collect(Collectors.toList());





    }
}
