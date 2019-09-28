package Lesson3;

import java.util.Scanner;

public class Pogreshnost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float length = sc.nextFloat();
        float el = sc.nextFloat();
        float num = -1;
        while(num != 0){
            num = sc.nextFloat();
            if(num < length - el || num > length + el)
            {
                System.out.println("No, Bad");
            } else {
                System.out.println("Well, Good");
            }
        }
    }
}