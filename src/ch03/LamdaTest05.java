package ch03;

import java.util.function.Function;

public class LamdaTest05 {
    public static void main(String[] args) {

        Function<Integer,Integer> f = x->x+1;
        Function<Integer,Integer> g = x->x*2;


        // andThen
        Function<Integer,Integer> h = f.andThen(g);
        int result1 = h.apply(1);

        // f - > g
        System.out.println(result1); // 4


        // compose
        Function<Integer,Integer> h2 = f.compose(g);

        int result2 = h2.apply(1);

        // g - > f
        System.out.println(result2); // 3

    }
}
