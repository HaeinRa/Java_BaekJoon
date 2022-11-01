/**
 * Date : 2022. 10. 01
 * Name : Rahaein
 * Number : 14681
 * 
 */
import java.util.*;

public class FindQuadrant 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Hello");
		
		int x1, y1;
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		
		if(x1>0 && y1>0)
			System.out.print(1);
		
		else if(x1<0 && y1>0)
			System.out.print(2);
		
		else if(x1<0 && y1<0)
			System.out.print(3);
		
		else
			System.out.print(4);
		
	}

}
