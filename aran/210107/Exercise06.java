package day210107;

public class Exercise06 {
	public static void main(String[] args) {
	
		//for문을 이용해서 실행 결과와 같은 삼각형을 출력하는 코드를 작성해보세요.
		
		String str = "*";
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(str);
			}
			System.out.println();
		}
		
		System.out.println("------");
		
		for(int i = 0; i < 5; i++) {
			for(int j = 5; i < j; j--) {
				System.out.print(str);
			}
			System.out.println();
		}
	}
}
