package sec03.exam07;

public class PrimitiveAndStringConversionExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		// 타입 그대로 출력
    
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);		
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
    // valueOf를 이용한 문자열로의 타입 변환 후 출력
	}
}

// 출력 예시
// value1: 10
// value2: 3.14
// value3: true
// str1: 10
// str2: 3.14
// str3: true
