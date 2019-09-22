package lesson2;

import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = maxNumber(a,b,c);
        System.out.println(max);
    }
    public static int maxNumber(int a, int b, int c)
    {
        if(a > b && a > c) {
            return a;
        }
        else if(b > a && b > c){
            return b;
        }
        else if (c > a && c > b) {
            return c;
        }
        else if(a == c && a == b) {
            return a;
        }
        else {
            return 0;
        }

    }
}


