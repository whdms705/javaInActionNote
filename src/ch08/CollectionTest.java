package ch08;

import com.sun.tools.javac.util.List;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        /* 8.1 */
        // 리스트 팩토리
        List<String> friends = List.of("eunho","eunho2","eunho3");
        System.out.println(friends);


        //리트스 팩토리를 사용하기 전 - Before
        List<String> beforeFriends = (List<String>)Arrays.asList("eun","eun2","eun3");
        System.out.println(beforeFriends);


        // 집합 팩토리
        Set<String> friends2 = Set.of("eunho","eunho2","eunho3");

        // 맵 팩토리
        Map<String, Integer> ageOfFriends = Map.of("eunho",20,"eunho2",30,"eunho3",40);


        /* 8.3 */

        // Map의 반복 - before
        Map<String, Integer> ages = new HashMap<>();
        ages.put("eunho",10);
        ages.put("eunho2",20);
        ages.put("eunho3",30);

        for(Map.Entry<String,Integer> entry:ages.entrySet()){
            String friendName = entry.getKey();
            Integer age = entry.getValue();
            System.out.println(friendName+" / "+age);
        }

        // java8부터 지원하는 forEach메서드
        ages.forEach((friendName,age)-> System.out.println(friendName+" / "+age));

        //정렬 메서드

        // 사람의 이름을 알파벳 순으로 스트림 요소로 처리
        ages.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEachOrdered(System.out::println);



    }
}
