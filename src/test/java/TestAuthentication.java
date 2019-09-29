import Lesson4.Authentication;
import Lesson4.ArrayExaple;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestAuthentication
{
    @Test
    public void testIncorrect(){
       boolean result = Authentication.logIn("pupil", "pupil");
       assertEquals(true, result);
    }

    @Test
    public void testCorrect (){
        boolean result = Authentication.logIn("login", "pass");
        assertEquals(false, result);
    }
    @Test
    public void  testNum(){
        int result = Authentication.Test2(2,4);
        assertEquals(0,result);
    }
    @Test
    public void  testNum2(){
        int result = Authentication.Test2(0,4);
        assertEquals(0,result);
    }
    @Test
    public void  testNum3(){
        int result = Authentication.Test2(2,0);
        assertEquals(-1,result);
    }
    @Test
    public  void TestWord(){
        String res = Authentication.TestString("i love dog");
        assertEquals("i *** dog",res);
    }
    @Test
    public void  TestSrA(){
        int[] mas = {1,2,3,4};
        float res = ArrayExaple.SrATest(mas);
        assertEquals(2.5,res);
    }
    @Test
    public void  TestSrA2(){
        int[] mas = {};
        float res = ArrayExaple.SrATest(mas);
        assertEquals(0,res);
    }

}
