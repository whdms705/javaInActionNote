package ch03;


import java.util.Comparator;

// MethodReferenseTest
public class LamdaTest03 {
    public static void main(String[] args) {




    }

    public class AppleComparator implements Comparator<Apple>{
        @Override
        public int compare(Apple o1, Apple o2) {
            return o1.getWeight().compareTo(o2.getWeight());
        }
    }
}
