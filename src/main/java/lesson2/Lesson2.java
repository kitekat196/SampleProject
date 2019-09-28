package lesson2;

import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println("d");
        int d = sc.nextInt();
        if(a  * b == d) {
            System.out.println(a+" * "+b);
        }
        if(a * c == d) {
            System.out.println(a+" * "+c);
        }
        if(c * b == d) {
            System.out.println(c+" * "+b);
        }
        if(a * a == d) {
            System.out.println(a+" * "+a);
        }
        if(b * b == d) {
            System.out.println(b+" * "+b);
        }
        if(c * c == d) {
            System.out.println(c+" * "+c);
        }



    }

}


