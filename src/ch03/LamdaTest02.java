package ch03;

import java.io.IOException;

public class LamdaTest02 {
    public static void main(String[] args) throws IOException {

        // 람다식 표현
        Runnable r1 = () -> System.out.println("hello world");

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world 2");
            }
        };


        process(r1); // hello world
        process(r2); // hello world 2
    }

    public static void process(Runnable r){
        r.run();
    }
}
