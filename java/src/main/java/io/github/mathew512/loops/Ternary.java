package io.github.mathew512.loops;

public class Ternary {
    public static void main(String[] args) {
        int number = 10;
        int x=100;
        int a=x++;
        int b=++x;
        int c=x++;

        int d=(a<b)? (a<c) ? a: (b<c)? b: c :x;
        System.out.println(d);

        forLoops();
       
    }
    static void forLoops(){
        for(int i=1;i<=5;i++){
            System.out.println("i:"+i);
        }
    }
}
