package Lesson8.LesException;
import java.util.Scanner;

public class LessonException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number\nNumber One");
        int a = sc.nextInt();
        System.out.println("Number two");
        int b = sc.nextInt();
        try {
            System.out.println(a/b);
        }catch (Exception x){
            System.out.println(x.getMessage());

        }

    }
}

//e.printStackTrace