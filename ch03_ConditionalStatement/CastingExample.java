package sec03.exam02;

public class CastingExample {
	public static void main(String[] args) {
		// 강제 타입 변환
		
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		// int형으로 44032인 값을 char형으로 : 가
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		// long형으로 500인 값을 int형으로 : 500
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);	
		// double형으로 3.14인 값을 int형으로 : 3(뒤에 소수점이 짤림)
	} 
}

// 출력 예시
// 가
// 500
// 3
