package io.github.mathew512.methods;

import java.util.Arrays;
public class StudentGrdaeCalculator {

    //calculate average of grades
    public static double calculatAverage(int[] grades){
     int sum =0;
     for(int grade: grades){
        sum += grade;
     }
        return (double) sum/grades.length;   
    }

    //find the highest grade
    public static int findHighestGrade(int[] grades){
        int highest = grades[0];
        for(int grade: grades){
            if(grade > highest){
                highest = grade;
            }
        }
        return highest;
    }

    //find the lowest grade
    public static int findLowestGrade(int[] grades){
        int lowest = grades[0];
        for(int grade: grades){
            if(grade < lowest){
                lowest = grade;
            }
        }
        return lowest;
    }

    // convert score to letter
    public static String getGradeLetter(double score){
        if (score >= 90) return "A";
        else if (score >=80) return "B";
        else if (score >=70) return "C";
        else if (score >=60) return "D";
        else return "F";
    }

    //print formatted grade report
    public static void printGradeReport(String name, int[] grades){
        double average = calculatAverage(grades);
        int highest = findHighestGrade(grades);
        int lowest = findLowestGrade(grades);
        String letter = getGradeLetter(average);

        System.out.println("Student: " + name);
        System.out.println("Grades: " + Arrays.toString(grades));
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);


    }

    public static void main(String[] args){

        System.out.println("=======STUDENT GRADES=======");
        int[] grades = {85, 92, 78, 90};
        printGradeReport("John Doe", grades);

        int[] mathewGrades = {88, 95, 72, 81, 90};
        printGradeReport("Mathew Kasanga", mathewGrades);
    }
}
