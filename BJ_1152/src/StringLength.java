/**
 * @Date 22.12.20
 * @author Rahaein
 * @number 10809
 * 
 * <구상>
 * main에서 문자열 입력받
 * 메소드 생성
 * 		문자열을 공백으로 기준으로 문자열배열로 저장
 * 		문자열 배열 길이 출력 
 * 
 */

import java.util.Scanner;

public class StringLength {
	public static int numberOfWord(String s)
	{
		//int numOfWord = 0;
		String str = s.trim();
		String[] strArray = str.split(" ");
		
//		for(int i=0; i<strArray.length; i++)
//		{
//			System.out.println(strArray[i]);
//		}
		return strArray.length;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(numberOfWord(str));
	}

}
