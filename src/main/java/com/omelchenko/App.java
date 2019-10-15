package com.omelchenko;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        run();
    }
    private static void  run(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day per week= ");
        int days_per_week = scanner.nextInt();
        System.out.print("Enter hours= ");
        byte hours_per_day = scanner.nextByte();
        System.out.print("Enter exercise= ");
        char exercise_per_taining = scanner.next().charAt(0);
        System.out.print("Enter reps= ");
        short reps_per_exercise = scanner.nextShort();
        System.out.print("Enter minutes= ");
        long minutes_for_exercise = scanner.nextLong();
        System.out.print("Enter price= ");
        double price_per_month = scanner.nextDouble();
        System.out.print("Enter total= ");
        float total_exercise_per_week = scanner.nextFloat();
        System.out.print("Enter legday= ");
        boolean leg_day_monday = scanner.nextBoolean();
        System.out.print("Enter your hobby name= ");
        String hobby_name = scanner.next();
        Hobby hobby1 = new Hobby(days_per_week, hours_per_day, exercise_per_taining, reps_per_exercise, minutes_for_exercise, price_per_month, total_exercise_per_week, leg_day_monday, hobby_name);
        Hobby hobby2 = new Hobby(3, 'A', (short)4, "Training");
        Hobby hobby3 = new Hobby();

        Hobby[] array_of_hobby = {hobby1, hobby2, hobby3};
        for (int i = 0; i < array_of_hobby.length ; i++) {
            System.out.println(array_of_hobby[i]);
        }
    }
}
