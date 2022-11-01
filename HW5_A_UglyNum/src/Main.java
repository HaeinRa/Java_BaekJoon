import java.util.Scanner;

public class Main 
{
	public static boolean test(int test)
	{	
		if(test == 0) return false;
		if(test == 1) return true;
		
		if(test % 2 == 0) {
			test /= 2;
			return test(test);
		}
		if(test % 3 == 0) {
			test /= 3;
			return test(test);
		}
		if(test % 5 == 0) {
			test /= 5;
			return test(test);
		}
		return false;
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int testnum = s.nextInt();
		for(int i=0; i<testnum; i++)
		{
			int testCase = s.nextInt();
			System.out.println(test(testCase));
		}
		s.close();
	}
}
