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
		if(s.isEmpty() || s.isBlank()) return 0; // 아예 입력 안 하거나 띄어쓰기만 있으면 0 반환
		String str = s.trim(); // 앞 뒤 공백 없애기
		String[] strArray = str.split(" "); // 공백으로 단어 분리
		return strArray.length;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(numberOfWord(str));
	}

}
