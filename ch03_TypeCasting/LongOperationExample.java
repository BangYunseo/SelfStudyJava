package sec03.exam04;

public class LongOperationExample {
	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3;
    // 값들의 합을 long 타입으로 자동 변환 후 출력
    
		System.out.println(result);
	}
}

// 출력 예시
// 1110
