/**
 * Date : 2022. 10. 02
 * Name : Rahaein
 * Number : 10952
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class PrintSum 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> sum = new ArrayList<>();
		Scanner userInput = new Scanner(System.in);

		int num1 = 1, num2 = 1;
		
		while(num1 != 0 && num2 != 0)
		{
			num1 = userInput.nextInt();
			num2 = userInput.nextInt();
			sum.add(num1 + num2);
		}
		
		for(int i = 0; i<sum.size()-1; i++)
		{
			System.out.format("%d\n", sum.get(i));
		}
	}
}