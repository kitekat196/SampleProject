package Homework;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArithOrGeomProgression {

    public static boolean Progression(String path){

        List<Integer> numb = new ArrayList<>();
        try(FileReader reader = new FileReader(path)) {
            Scanner sc = new Scanner(reader);
            while (sc.hasNext()) {
                int num = sc.nextInt();
                numb.add(num);
            }
            int arifm;
            int geom;
            if (numb.size() > 1) {
                arifm = numb.get(1) - numb.get(0);
                if(numb.get(0) > 0){
                    geom = numb.get(1) / numb.get(0);
                } else {
                    geom = 0;
                }

                for (int i = 0; i < numb.size()-1; i++) {
                    if(arifm != (numb.get(i+1) - numb.get(i)) && geom != (numb.get(i+1) / numb.get(i))){
                        return false;
                    }
                }
            } else {
                System.out.println("Проверьте содержимое файла\\nЧисел в файле должно быть больше одного и разделены пробелами");
                return false;
            }

        }catch (IOException e) {
            System.out.println("Ошибка при чтении файла\n" + e.getMessage());
            return false;
        } catch (ArithmeticException e){
        }
        return true;
    }
}