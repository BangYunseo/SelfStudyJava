package sec03.exam01;

public class PromotionExample {
	public static void main(String[] args) {
		//자동 타입 변환
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue : " + intValue);
		// int형 그대로 출력

		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드 : " + intValue);
		// char형인 charValue를 int형에 넣어서 출력
		// -> '가'가 int형으로 변환
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);	
		// int형인 intValue를 long형에 넣어서 출력
		
		longValue = 100;
		float floatValue = longValue; 
		System.out.println("floatValue : " + floatValue);
		// long형인 longValue를 float형에 넣어서 출력
		// -> float의 특성처럼 소수점으로 출력된 모습을 확인할 수 있음
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue : " + doubleValue);
		// float형인 floatValue를 double형에 넣어서 출력
	} 
}

// 출력 예시
// intValue : 10
// 가의 유니코드 : 44032
// longValue : 50
// floatValue : 100.0
// doubleValue : 100.5
