import Homework.Lesson6_DeleteLong;
import Homework.Lesson6_FuncMap_Unique;
import Homework.Lesson6_symmetricDifference;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestHomeworkLesson6
{
    @Test
    public  void  countInListTest() {
        List<String> list = new ArrayList<>();
        list.add("cola");  list.add("pepsi");
        list.add("cola");  list.add("pepsi");
        list.add("cola");  list.add("pepsi");
        list.add("cola");  list.add("fanta");
        list.add("fanta"); list.add("sprite");
        Map<String,Integer> map = new HashMap<>();
        map.put("cola", 4);
        map.put("pepsi", 3);
        map.put("fanta", 2);
        map.put("sprite",1);
        Map<String,Integer> res = Lesson6_FuncMap_Unique.countInList(list);
        assertEquals(map,res);
    }
    @Test
    public void SymmetricDifferenceTest() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);        set2.add(4);
        set1.add(2);        set2.add(5);
        set1.add(3);        set2.add(6);
        set1.add(4);        set2.add(7);
        set1.add(5);        set2.add(8);
        Set<Integer> setInt = Lesson6_symmetricDifference.symmetricDifference(set1,set2);
        Set<Integer> res = new HashSet<>();
        res.add(1);
        res.add(2);
        res.add(3);
        res.add(6);
        res.add(7);
        res.add(8);
        assertEquals(res,setInt);
    }
    @Test
    public void DeleteLongTest(){
        List<String> list = new ArrayList<>();
        list.add("I like dog");
        list.add("I like cat");
        List<String> listTest = new ArrayList<>();
        listTest.add("I like dog");
        listTest.add("I like cat");
        listTest.add("I like hamster");
        listTest.add("I like horse");
        int n = 10;
        Lesson6_DeleteLong.deleteLong(listTest, n);
        assertEquals(list,listTest);
    }
}
