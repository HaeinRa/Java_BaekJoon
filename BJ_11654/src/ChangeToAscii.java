/**
 * @Date 22.12.19
 * @author Rahaein
 * @number 11654
 * 
 * <구상>
 * main 함수에서 문자 입력받기
 * 문자를 아스키코드로 바꾸는 함수 따로 만들어서 처리하기
 * 
 */

import java.util.Scanner;

public class ChangeToAscii {
	
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
