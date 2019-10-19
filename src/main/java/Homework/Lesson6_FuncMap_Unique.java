package Homework;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
public class Lesson6_FuncMap_Unique {
    public static Map<String,Integer> countInList(List<String> list){
        Map<String, Integer> countIn = new HashMap<>();
        for(String x : list){
            if(countIn.containsKey(x)){
                countIn.put(x, countIn.get(x)+1);
            } else {
                countIn.put(x, 1);
            }
        }
        return countIn;
    }
}
