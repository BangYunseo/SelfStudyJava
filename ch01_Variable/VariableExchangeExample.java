package sec01.exam03;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
    // int형 변수 x, y 선언 후 각각 3과 5로 초기화
		System.out.println("x : " + x + ", y : " + y);
		
		int temp = x;
		x = y;
		y = temp;
    // int형 변수 temp를 통해 x와 y의 값을 보존하며 교환
		System.out.println("x : " + x + ", y : " + y);
	}
}

// 출력 예시
// x : 3, y : 5
// x : 5, y : 3
