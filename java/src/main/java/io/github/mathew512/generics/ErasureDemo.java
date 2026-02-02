package io.github.mathew512.generics;

import java.util.List;

public class ErasureDemo {

    // Demonstrates type erasure with instanceof
    public static void checkListType(Object obj) {
        if (obj instanceof List<?>) {
            System.out.println("It's a list (type erased)");
        } else {
            System.out.println("Not a list");
        }
    }

    // Demonstrates generic array creation workaround
    public static <T> T[] createArray(Class<T> clazz, int size) {
        @SuppressWarnings("unchecked")
        T[] array = (T[]) java.lang.reflect.Array.newInstance(clazz, size);
        return array;
    }
}
