package io.github.mathew512;

public class Main {
    public static void main(String[] args){
    int age;
    String name;
    double salary;
    forLoops();

    //Declaration
    int score=90;
    String Name="MATHEW";
    double Sal=4567.89;

    System.out.println("score:"+score);
    System.out.println("Name:"+Name);
    System.out.println("Sal:"+Sal);

    String $name="John";
    String firstname="John";
    String _lastname="Doe";
    String fullname=$name+" "+_lastname;
    System.out.println("Full Name:"+fullname);

    byte b=100; // -18 to 127
    short s=10000; //-32,768 to 32,767
    int i=100000; //-2,147,483,648 to 2,147,483,647
    long l=100000L;//-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

    System.out.println("byte:"+b);
    System.out.println(Long.MAX_VALUE);
    System.out.println(Float.MIN_VALUE);

    char grade ='A';
    boolean isPassed = true;
    long numberOfStudents=1500;
    short numberoFcLasses=250;
    short numOfTeachers=(short)150;//Type casting

    System.out.println("Grade:"+grade);
    System.out.println(numOfTeachers);

    String names="Mathew Kasanga";
    System.out.println("Names:"+names);

    int[] K={10,20,30,40,50};

    int[] M=new int[10];


    //Operators
    arithmeticOperators();
    assignmentOperators();
    comparisonOperators();
    logicalOperators();
    incrementDecrementOperators();

    }
    public static void arithmeticOperators(){
        int a=10;
        int b=5;
        System.out.println("Sum:"+(a+b));
        System.out.println("Difference:"+(a-b));
        System.out.println("Product:"+(a*b));
        System.out.println("Quotient:"+(a/b));
        System.out.println("Remainder:"+(a%b));
        double Result =(double) a/b;
        System.out.println("result:"+Result);

    }
    public static void assignmentOperators(){
        System.out.println("=====assignmentOperators=====");
        int balance=20000;
        balance=balance+5000;
        System.out.println("Balance:"+balance);
        //withdraw
        balance=balance-3000;
        System.out.println("Balance after withdrawal:"+balance);
        //charity work
        balance=balance/3;
        System.out.println("Balance after charity:"+balance);
        
        int y=30;
        y+=5; //y=y+5
        y-=3; //y=y-3
        y*=2; //y=y*2
        y/=4; //y=y/4
        y%=3; //y=y%3
        System.out.println("y:"+y);
    }
    public static void comparisonOperators(){
        System.out.println("=====comparisonOperators=====");
        int x=10;
        int y=20;
        int z=19;
        System.out.println("x==y:"+(x==y));
        System.out.println("x!=y:"+(x!=y));
        System.out.println("x>y:"+(x>y));
        System.out.println("x<y:"+(x<y));
        System.out.println("x>=y:"+(x>=y));
        System.out.println("x<=y:"+(x<=y));
        System.out.println("y>z:"+(y>z));
        System.out.println("y<z:"+(y<z));
        System.out.println("y>=z:"+(y>=z));
        System.out.println("y<=z:"+(y<=z));

    }
    public static void logicalOperators(){
        System.out.println("=====logicalOperators=====");
        boolean a=true;
        boolean b=false;
        int T=10000;
        int U=20000;
        System.out.println("withdraw:" +((T>U) && (U>T)));

        System.out.println("a && b:"+(a && b));
        System.out.println("a || b:"+(a || b));
        System.out.println("!a:" +(!a));
        System.out.println("!b:" +(!b));

    }
    public static void incrementDecrementOperators(){
        System.out.println("=====incrementDecrementOperators=====");
        int a=5;
        System.out.println("a:"+a);
        System.out.println("++a:"+(++a)); //pre-increment
        System.out.println("a++:"+(a++)); //post-increment
        System.out.println("a after post-increment:"+a);

        System.out.println("--a:"+(--a)); //pre-decrement
        System.out.println("a--:"+(a--)); //post-decrement
        System.out.println("a after post-decrement:"+a);
    }
    static void forLoops(){
        for(int i=1;i<=5;i++){
            System.out.println("i:"+i);
        }
    }

}
