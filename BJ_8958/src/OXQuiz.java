/**
 * @
 * @author Rahaein
 * 
 * 
 * 
 * 변수 1 : 테스트 케이스 개수 입력받기 -> 배열 개수 변수 2 : 점수 계산
 * 
 * 한 테스트에 대해서
 * for(int i= 0; i<배열의 크기만큼; i++) { if(array[i] == 'O') { int sum = 0, middle sum = 0; 
 * // 이건 반복문 밖에다가ㅇㅇ middle sum += 1; } else if(array[i] == 'X') { sum += middle sum; middle sum = 0; } }
 * 
 * 그럼 각 테스트마다 동적배열을 생성해야하는데 그 배열의 최대 크기는 80으로 제한하는 것이고, 각 동적배열에 순서대로dj 입력시키고...
 * 
 * ??? : 입력하는 즉시 계산하는 식으로 할까
 * 이거는 데이터를 입력받으면서 하는데 바로 테스트 한 개 끝나고 바로 출력이 아니니까 점수들만 따로 계산하고 저장할 배열이 필요함
 * 
 * ??? : 입력을 마치고 데이터를 검사하는 식으로 할까
 * 이건 예를 들어 5개의 테스트를 다 입력하고 테스트를 수행하는 식이니까 즉 데이터는 이미 다 주어져 있으니까 점수들 저장 없이 
 * 바로 출력할 수 있음 이게 더 편할 듯
 * 
 * 각 배열에 엔터칠때까지 배열에 입력 엔터치고 나선 다음 동적배열에 입력 그럼 배열의 개수도 정해진 게 아니니까 
 * 2중배열? 그걸 써야될 듯 싶은디... 잘모르는뎀..일단 기기 그러고나선 배열 개수만큼 즉 변수 1만큼 반복문 실행해서 테스트 돌리면 되고 
 * 그 테스트 안은 위에서 써놓은 반복문이 돌아가면 되지 않을까..?

ver1. 입력하는 즉시 계산하는 식
ver2. 입력을 모두 마치고 데이터 검사하는 식
ver3. 배열의 크기를 미리 정해놓는 식
ver4. 배열의 크기를 미리 정해놓지 않고 입력받은 수만큼 반복해서 그만큼 생성하게 만드는 식


[ ver4.
	for문으로 테스트 크기만큼 반복하게 하고, 
	그 안에 while문으로 테스트값 입력하게 하고 80개가 되거나 엔터를 누르면 
	while문 종료
]
+
[ ver2.
	모두 입력받고 생각하기 
]


 */

import java.util.Scanner;

public class OXQuiz {
	
	public static int score(String OX)
	{
		char[] oxString = OX.toCharArray();
		int score = 0, finalscore = 0;
		
		for(int i=0; i<oxString.length; i++)
		{
			if(oxString[i] == 'O')
			{
				score++;
				//System.out.print("점수추가 : "+score+"\n");
				finalscore += score;
			}
			else
			{
				score = 0;
				//System.out.print("점수리셋 : "+score+"\n");
				//System.out.print("파이널 점수 : "+finalscore+"\n");
			}
		}
		
		return finalscore;
	}

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int numCase = sc.nextInt();
		
		
		for(int i=0; i<numCase; i++)
		{
			String OX = sc.next();
			System.out.print(score(OX)+"\n");
		}
	}
}
