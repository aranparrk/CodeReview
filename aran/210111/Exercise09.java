import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		// 다음은 키보드로부터 학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및  평균 점수를 구하는 프로그램입니다. 실행 결과를 보고, 알맞게 작성해보세요 (참고로 16라인에서 Scanner의 nextInt() 메소드는 콘솔에 입력된 숫자를 읽고 리턴합니다.)
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = scanner.nextInt();
				
			// 학생수 입력 받기
			if(selectNo == 1) {
				System.out.print("학생수 > ");
				studentNum = scanner.nextInt(); //사용자로부터 학생수 입력 받기
				scores = new int[studentNum]; //score배열에 입력 받은 학생수를 객체로 생성
				
			// 각 학생에 대한 점수 입력 받기
			} else if(selectNo == 2) {
				for(int i = 0; i < scores.length; i++) { //i가 studentNum에 입력 받은 수 만큼 실행문을 반복
					System.out.print("scores[" + (i+1) + "]> "); //배열이 0부터 시작하므로 i에 1을 더함
					scores[i] = scanner.nextInt(); //사용자로부터 점수 입력 받기
				}
			
			// 입력 받은 점수 조회	
			} else if(selectNo == 3) {
				for(int i = 0; i < scores.length; i++) { //입력된 학생수만큼 실행문 반복
				System.out.println("scores[" + (i+1) + "] " + scores[i]); //입력된 점수 출력
				}
			
			// 최고 점수와 평균 점수 구하기
			} else if(selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				
				for (int i = 0; i < scores.length; i++) { //입력된 학생수만큼 실행문 반복
					max = (max < scores[i]) ? scores[i] : max; //i배열 값이 max보다 작으면 그대로 두고, 아니면 max값으로 덮어씌움
					sum += scores[i]; //점수 총합 구하기
				}
				
				avg = (double) sum / scores.length; // 평균 구하기
				
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
				
			} else if(selectNo == 5) {
				run = false;
			}
		}

		System.out.println("프로그램 종료");
		
	}

}
