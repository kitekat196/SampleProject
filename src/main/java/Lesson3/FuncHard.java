package Lesson3;
import java.util.Scanner;
public class FuncHard
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(Strcheck(str));
    }
    public static boolean Strcheck(String s) {
        s = s.toLowerCase();
        String check = "";
        for (int i = s.length() - 1; i > -1; i--) {
            check = check + s.charAt(i);
        }
        if (s.equals(check)) {
            return true;
        } else {
            return false;
        }
    }
}