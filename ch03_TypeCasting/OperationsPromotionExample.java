package sec03.exam05;

public class OperationsPromotionExample {
	public static void main(String[] args) {	
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2;   //컴파일 에러
    // Why? 잃는 byte 값이 생김
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2;   //컴파일 에러
    // Why? 잃는 char 값이 생김
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0;   //컴파일 에러
    // Why? int에서 double로의 변환이기 때문에 잃는 값이 생김
    // 원래 double이라면 2.5가 출력되나, int면 2가 출력되면서 잃는 값 0.5가 생김
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double) x / y;
		System.out.println(result);
	} 
}

// 출력 예시
// 30
// 유니코드=66
// 출력문자=B
// 2
// 2.5
// 0.5
