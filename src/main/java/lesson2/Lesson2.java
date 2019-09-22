package lesson2;

import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean max = maxNumber(a);
        System.out.println(max);
    }
    public static boolean maxNumber(int a)
    {
        while ( a % 2 == 0 &&  a != 1) {
            a = a / 2;
        }
        if (a == 1) {
            return true;
        } else{
            return false;
        }
    }
}


