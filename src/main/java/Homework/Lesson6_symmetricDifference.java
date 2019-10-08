package Homework;
import java.util.HashSet;
import java.util.Set;
public class Lesson6_symmetricDifference {
    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> set3 = new HashSet<>(set1);
        set1.addAll(set2);
        set3.retainAll(set2);
        set1.removeAll(set3);
        return set1;
    }
}