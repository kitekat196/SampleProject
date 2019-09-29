import Lesson4.Authentication;
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

}
