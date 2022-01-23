import java.util.regex.*;

class RegexExample2
{
	public static void main(String args[])
	{
		System.out.println(Pattern.matches("[amn]","abcd"));//false
		System.out.println(Pattern.matches("[amn]","a"));//true
		System.out.println(Pattern.matches("[amn]","ammmmma"));//false
	}
}