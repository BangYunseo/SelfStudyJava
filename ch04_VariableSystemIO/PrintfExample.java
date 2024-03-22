package sec04.exam01;

public class PrintfExample {
	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격 : %d원\n", value);
    // 그대로 출력
    
		System.out.printf("상품의 가격 : %6d원\n", value);
    // 6자리에 맞춰 값을 출력 : 오른쪽에 값이 올 수 있도록
    
		System.out.printf("상품의 가격 : %-6d원\n", value);
    // 6자리에 맞춰 값을 출력 : 왼쪽에 값이 올 수 있도록
    
		System.out.printf("상품의 가격 : %06d원\n", value);
    // 6자리에 맞춰 값을 출력 : 오른쪽에 값이 오며 나머지 값에는 모두 0이 올 수 있도록

		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이 : %10.2f\n", 10, area);
    // 10자리에 맞춰 값을 출력 : 오른쪽에 값이 올 수 있도록 하며 소수점 2자리에서 끊도록(반올림)

		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
    // 6자리에 맞춰 값을 출력 : 오른쪽에 값이 올 수 있도록
    // 10자리에 맞춰 값을 출력 : 왼쪽에 값이 올 수 있도록
    // 10자리에 맞춰 값을 출력 : 오른쪽에 값이 올 수 있도록
	}
}

// 출력 예시
// 상품의 가격 : 123원
// 상품의 가격 :    123원
// 상품의 가격 : 123   원
// 상품의 가격 : 000123원
// 반지름이 10인 원의 넓이 :     314.16
//      1 | 홍길동        |         도적
