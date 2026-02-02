package io.github.mathew512.generics;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        step1RawCollections(); 
        step2GenericList(); 
        step3GenericClass(); 
        step4PairClass(); 
        step5GenericMethods(); 
        step6TypeBounds(); 
        step7Wildcards(); 
        step8TypeErasure();
        step9GenericInterfaces();

        List list=new ArrayList();
        list.add("Mathew");
        list.add("Kasanga");
        list.add(123);
        list.add(new Date());

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        String first =(String) list.get(0);
        String second =(String) list.get(1);
        Integer number =(Integer) list.get(2);
        Date date =(Date) list.get(3);

    }


    private static void step1RawCollections(){
        List list=new ArrayList();
        list.add("Mathew");
        list.add("Kasanga");
        list.add(123);
        list.add(new Date());

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        String first =(String) list.get(0);
        String second =(String) list.get(1);
        Integer number =(Integer) list.get(2);
        Date date =(Date) list.get(3);
    }

    private static void step2GenericList(){
        List<String> list=new ArrayList<>();
        list.add("Mathew");
        list.add("Kasanga");

        System.out.println("\nStep 2: Generic List");
        for(String name : list){
            System.out.println(name.toUpperCase());
        }
    }

    private static void step3GenericClass(){
        Box<String> stringBox=new Box<>("Hello Generics");
        Box<Integer> intBox=new Box<>(12345);

        System.out.println("\nStep 3: Generic Class");
        System.out.println( stringBox);
        System.out.println( intBox);
    }

    private static void step4PairClass(){
        Pair<String, Integer> agePair = new Pair<>("Age", 25);
        System.out.println("\nStep 4: Generic Pair Class");
        System.out.println(agePair);
    }

    private static void step5GenericMethods(){
        String[] arr = {"Mathew", "Kasanga", "Java"};
        GenericMethods.printArray(arr);

        List<Integer> nums = List.of(10, 20, 30, 40);
        GenericMethods utils = new GenericMethods();
        System.out.println("\nStep 5: Generic Methods");
        System.out.println("First element: " + utils.getFirstElement(nums));
    }
    
    private static void step6TypeBounds(){
        NumberBox<Integer> intBox = new NumberBox<>(5);
        NumberBox<Double> doubleBox = new NumberBox<>(3.14);

        System.out.println("\nStep 6: Type Bounds");
        System.out.println("Integer box value: " + intBox.getSquare());
        System.out.println("Double box value: " + doubleBox.getSquare());
    }

    private static void step7Wildcards(){
        List<Integer> numbers = List.of(10, 20, 30);
        List<Number> objects = new ArrayList<>();

        System.out.println("\nStep 7: Wildcard Types");
        WildcardUtils.printList(numbers);
        WildcardUtils.printList(objects);
        System.out.println("Sum of integers: " + WildcardUtils.sumOfList(numbers));
        System.out.println("Sum of objects: " + WildcardUtils.sumOfList(objects));
    }

    private static void step8TypeErasure(){
        System.out.println("\nStep 9: Type Erasure");
        ErasureDemo.checkListType(new ArrayList<String>());
    }

    private static void step9GenericInterfaces(){
        StudentRepository repo = new StudentRepository();
        repo.save(new Student(1, "Mathew"));
        repo.save(new Student(2, "Kasanga"));

        System.out.println("\nStep 10: Generic Interfaces");
        System.out.println(repo.findAll());
    }
}
