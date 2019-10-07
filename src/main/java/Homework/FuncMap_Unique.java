package Homework;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
public class FuncMap_Unique {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("cola");  list.add("pepsi");
        list.add("cola");  list.add("pepsi");
        list.add("cola");  list.add("pepsi");
        list.add("cola");  list.add("fanta");
        list.add("cola");  list.add("fanta");
        System.out.println(countInList(list));
    }
    public static Map<String,Integer> countInList(List<String> list){
        Map<String, Integer> countIn = new HashMap<>();
        Set<String> cloudySet = new HashSet<>();
        List<String> cloudyList = new ArrayList<>();
        cloudySet.addAll(list);
        for (String x: cloudySet) {
            cloudyList.add(x);
        }
        int count = 0;
        for (int i = 0; i < cloudyList.size(); i++) {

            for (int j = 0; j < list.size(); j++) {
                if(cloudyList.get(i).contains(list.get(j))){
                    count++;
                }
            }
            String str = cloudyList.get(i);
            countIn.put(str,count);
            count = 0;
        }
        return countIn;
    }
}
