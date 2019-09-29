package Lesson4;

import java.util.Scanner;

public class ArrayExaple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size mas");
        int size = sc.nextInt();
        int[] mas = new int[size];
        float srA = 0;
        System.out.println("Enter el mas");
        for (int i = 0; i < size; i++) {
            mas[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
                srA = srA + mas[i];
        }
        System.out.println(srA/size);


    }
}
