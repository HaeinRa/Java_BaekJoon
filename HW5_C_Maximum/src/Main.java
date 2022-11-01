import java.util.Scanner;

public class Main 
{
	public static void replace(int num)
	{
		String s1 = Integer.toString(num);
		String s2 = s1.replaceFirst("6", "9");
		System.out.println(s2);
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int testnum = s.nextInt();
		
		for(int i=0; i<testnum; i++)
		{
			int testCase = s.nextInt();
			replace(testCase);
		}
	}
}
