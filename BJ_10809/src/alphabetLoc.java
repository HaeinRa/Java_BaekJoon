import java.util.Scanner;

public class alphabetLoc {
	
	public static void checkLoc(String s)
	{
		for(int i=0; i<26; i++)
		{
			System.out.print(s.indexOf(i+97)+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		checkLoc(S);
	}

}
