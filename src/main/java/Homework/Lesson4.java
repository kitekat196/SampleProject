package Homework;
public class Lesson4 {

    static String play(String[] roles, String[] textLines) {
        String str = "";
        for (int i = 0; i < roles.length; i++) {
            str = str + roles[i] + ": \n";
            for (int j = 0; j < textLines.length; j++) {
                if(textLines[j].startsWith(roles[i] + ": ")){
                    str = str + (j+1)+") "+ textLines[j].substring(roles[i].length()+2, textLines[j].length())+ "\n";
                }
            }
            str = str + "\n";
        }
        return str;
    }
    public static void main(String[] args) {
        String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!" };
        System.out.println(play(roles, textLines));
    }
}