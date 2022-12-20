/**
 * @Date 22.12.20
 * @author Rahaein
 * @number 11654
 */
import java.util.Scanner;

public class changeToAscii {
	
	public static int changeIt(char s){
		int asciinum = (int)s;
		return asciinum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char m_char = sc.next().charAt(0);
		System.out.print(changeIt(m_char));
	}

}
