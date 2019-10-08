package Homework;
import java.util.List;
public class Lesson6_DeleteLong {

    public static void deleteLong(List<String> list, int n) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > n) {
                list.remove(i);
                i--;
            }
        }
    }
}