import Homework.ArithOrGeomProgression;
import org.junit.jupiter.api.Test;

public class ArifOrGeomProg {
    @Test
    public void AOGPTest(){
        String path = "src\\main\\java\\resources\\ForTestAOGP.txt";
        System.out.println(ArithOrGeomProgression.Progression(path));
    }
}
