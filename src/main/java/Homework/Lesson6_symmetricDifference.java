package Homework;
import java.util.HashSet;
import java.util.Set;
public class Lesson6_symmetricDifference {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);        set2.add(3);
        set1.add(2);        set2.add(4);
        set1.add(3);        set2.add(5);
        set1.add(4);        set2.add(6);
        set1.add(5);        set2.add(7);
        System.out.println(symmetricDifference(set1,set2));
    }
    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> set3 = new HashSet<>();
        for (Integer x: set1) {
            for (Integer y: set2) {
                if(x.equals(y)) {
                    set3.add(y);
                }
            }
        }
        set1.addAll(set2);
        set1.removeAll(set3);
        return set1;
    }
}