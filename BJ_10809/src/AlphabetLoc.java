/**
 * @Date 22.12.20
 * @author Rahaein
 * @number 10809
 * 
 * <구상>
 * main에서 소문자 문자열 입력받기
 * 반복해서 문자열 점검하는 메소드 생성
 * 	    문자열을 문자배열로 변환(안해도 될 수도,, 스트링메소드 사용ㅇㅇ) 문자열에서 알파벳 
 *  	각 알파벳 처음 등장하는 부분을 찾기 
 * 	    굳이 저장할 필요 없이 바로 print
 * 
 */
import java.util.Scanner;

public class AlphabetLoc {
	
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
