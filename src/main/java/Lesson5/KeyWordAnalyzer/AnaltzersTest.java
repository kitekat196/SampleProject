package Lesson5.KeyWordAnalyzer;

public class AnaltzersTest
{
	public static void main(String[] args) {
//LengthAnalyzer lengthAnalyzer = new LengthAnalyzer(300);
//	  SpamAnalyzer spamAnalyzer = new SpamAnalyzer(new String[]{"спам", "кредит"});
//	  SwearAnalyzer swearAnalyzer = new SwearAnalyzer();

	String str = "I mongrel";

//	System.out.println(lengthAnalyzer.analyse(str));
//	System.out.println(spamAnalyzer.analyse(str));
//	System.out.println(swearAnalyzer.analyse(str));

	Analyzer[] analyzers = new Analyzer[3];
	analyzers[0] = new LengthAnalyzer(300);
	analyzers[1] = new SpamAnalyzer(new String[]{"спам", "кредит"});
	analyzers[2] = new SwearAnalyzer();
	int count = 0;
	for (int i = 0; i < analyzers.length; i++) {
		if(analyzers[i].analyse(str) == true) {
			count++;
		}
	}
	if(count == 3) {
		System.out.println(str);
	}



	}
}
