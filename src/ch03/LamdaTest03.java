package ch03;


import java.util.*;

import static java.util.Comparator.comparing;

// MethodReferenseTest
public class LamdaTest03 {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.addAll(Arrays.asList(
                new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN),
                new Apple(120, Color.RED)
        ));

        // 2단계 : 익명 클래스 사용

        inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple a1, Apple a2) {
                return a1.getWeight() - a2.getWeight();
            }
        });

        // 3단계 : 람다표현식 사용
        inventory.sort((Apple a1, Apple a2)-> a1.getWeight() - a2.getWeight());

        // 자바 컴파일러는 람다 표현식에 사용된 콘텍스트를 활용해서 람다의 파라미터 형식을 추론할 수 있어 아래와 같이 코드를 사용할 수 있다.
        inventory.sort((a1, a2)-> a1.getWeight() - a2.getWeight());

        // 4단계 : 메소드 참조 이용

        inventory.sort(comparing(Apple::getWeight));



        // Comparator 조합

        inventory.sort(comparing(Apple::getWeight).reversed());

        // 두번째 비교자

        inventory.sort(comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));


    }

    // 1단계 : 코드 전달
    static class AppleComparator implements Comparator<Apple> {

        @Override
        public int compare(Apple a1, Apple a2) {
            return a1.getWeight() - a2.getWeight();
        }
    }
}
