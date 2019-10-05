package Lesson5.KeyWordAnalyzer;

public class LengthAnalyzer implements Analyzer{
	private int length;

	public LengthAnalyzer(int length)
	{
		this.length = length;
	}

	public boolean analyse (String text)
	{
		if (text.length() > length)
		{
			return false;
		}
		return true;
	}
}
