package io.github.mathew512.generics;

import java.util.List;

public class WildcardUtils {
    
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static double sumOfList(List<? extends Number> list){
        double sum=0.0;
        for(Number n:list){
            sum+=n.doubleValue();
        }
        return sum;
    }

    public static void addIntegers(List<? super Integer> list){
        list.add(1);
        list.add(2);
        list.add(3);
    }
}
