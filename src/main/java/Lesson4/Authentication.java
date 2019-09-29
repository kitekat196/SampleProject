package Lesson4;

public class Authentication
{
    public static boolean logIn(String login, String password)
    {
        String correctLogin = "pupil";
        String cottectPass = "pupil";
        if (correctLogin.equals(login) && cottectPass.equals(password))
        {
            return true;
        } else
        {
            return false;
        }
    }

    public static int Test2 (int a, int d){
        if(d == 0)
        {
            return -1;
        }
        return a/d;
    }

    public static String TestString(String str){
        String badWord = "love";
        String str2;
        str2 = str.replaceAll(badWord, "***");

        return str2;
    }




}
