/**
 * Date : 2022. 10. 04
 * Name : Rahaein
 * Number : 10818
 * 
 * 		[ Conception ]
 * 		변수 1 : 숫자 개수 받기
 * 		배열 1 : 변수1에서 입력받은 수의 크기만큼 배열 생성하여 입력받기
 * 		min이나 max함수가 있다면 이용하거나
 * 		배열에 입력받은 수들을 정렬시키기
 * 		변수 2 : min을 구해서 변수 2에 저장
 * 		변수 3 : max을 구해서 변수 3에 저장
 * 		출력 (min max)
 * 
 */
import java.util.Arrays;
import java.util.Scanner;

public class ExtractMinMax 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int min, max;
		
		int[] numStorage = new int[num];
		for(int i=0; i<numStorage.length; i++)
		{
			numStorage[i] = sc.nextInt();
		}
		
		Arrays.sort(numStorage);
		min = numStorage[0];
		max = numStorage[num-1];
		
		System.out.printf("%d %d", min, max);		
	}
}

/*
 * scanner 사용 : https://ssungkang.tistory.com/77
 * 배열 생성 : https://zoosso.tistory.com/666
 * 배열에서 최댓값, 최솟값 구하는 방법 : https://wakestand.tistory.com/423
 */
