package Lesson4;

import java.util.Scanner;

public class ArrayExaple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size mas");
        int size = sc.nextInt();
        int[] mas = new int[size];

        System.out.println("Enter el mas");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextInt();
        }



        System.out.println(SrATest(mas));

    }
    public static float SrATest(int[] mas) {
        float srA = 0;
        for (int i = 0; i < mas.length; i++) {
            srA = srA + mas[i];
        }
        if(mas.length == 0)
        {
            return 0;
        }
        return srA/mas.length;
    }
}
