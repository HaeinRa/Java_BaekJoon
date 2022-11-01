import java.util.Scanner;

public class Main 
{
	public static void digit(int number, int target)
	{
		if(target >=0 && target<=9)
		{
			String strNum = Integer.toString(number);
			String charTarget = Integer.toString(target);
			char Target = charTarget.charAt(0);
			System.out.print(strNum.length() - strNum.replace(String.valueOf(Target), "").length()+"\n");
		}
		else System.out.println(0);
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int testnum = s.nextInt();
		for(int i=0; i<testnum; i++)
		{
			int number = s.nextInt();
			int target = s.nextInt();
			//System.out.println(digit(number, target));
			digit(number, target);
		}
	}
}
