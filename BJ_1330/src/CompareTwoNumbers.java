/**
 * Date : 2022. 10. 01
 * Name : Rahaein
 * Number : 1330
 * 
 */
import java.util.Scanner;
public class CompareTwoNumbers {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		int num1, num2;
		//System.out.print("input num1");
		num1 = userInput.nextInt();
		//System.out.print("input num2");
		num2 = userInput.nextInt();
		
		if (num1>num2)
			System.out.print('>');
		
		else if (num1<num2)
			System.out.print('<');
		
		else 
			System.out.print("==");
	}

}
