import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
	    // ex 1 : Promotion
	    // 자동 타입 변환
	    
	    byte byteValue = 10;
	    int intValue = byteValue;
	    System.out.println("intValue : " + intValue);

	    char charValue = '가';
	    intValue = charValue;
	    System.out.println("가의 유니코드 : " + intValue);
		
	    intValue = 50;
	    long longValue = intValue;
	    System.out.println("longValue : " + longValue);	
		
	    longValue = 100;
	    float floatValue = longValue; 
	    System.out.println("floatValue : " + floatValue);
		
	    floatValue = 100.5f;
	    double doubleValue = floatValue;
	    System.out.println("doubleValue : " + doubleValue);
	    
	    // 출력 예시
	    // intValue : 10
	    // 가의 유니코드 : 44032
	    // longValue : 50
	    // floatValue : 100.0
	    // doubleValue : 100.5


	    // ex 2 : Casting
	    
	    int intValue = 44032;
	    char charValue = (char) intValue;
	    System.out.println(charValue);
		
	    long longValue = 500;
	    intValue = (int) longValue;
	    System.out.println(intValue);
		
	    double doubleValue = 3.14;
	    intValue = (int) doubleValue;
	    System.out.print(intValue);
	    // 실수형을 정수형으로 변환 시 정수 부분만 출력

	    // 출력 예시
	    // 가
	    // 500
	    // 3
	    

	    // ex 3 : Byte Operation
	    
	    byte result1 = 10 + 20;
	    System.out.println(result1);
		
	    byte x = 10;
	    byte y = 20;
	    int result2 = x + y;
	    System.out.print(result2);

	    // 출력 예시
	    // 30
	    // 30


	    // ex 4 : LongOperation

	    byte value1 = 10;
	    int value2 = 100;
	    long value3 = 1000L;
	    long result = value1 + value2 + value3;
	    System.out.print(result);

	    // 출력 예시
	    // 1110


	    // ex 5 : Operations Promotion

	    byte byteValue1 = 10;
	    byte byteValue2 = 20;
	    //byte byteValue3 = byteValue1 + byteValue2;   // 컴파일 에러
	    int intValue1 = byteValue1 + byteValue2;
	    System.out.println(intValue1);
		
	    char charValue1 = 'A';
	    char charValue2 = 1;
	    //char charValue3 = charValue1 + charValue2;   // 컴파일 에러
	    int intValue2 = charValue1 + charValue2;
	    System.out.println("유니코드 :" + intValue2);
	    System.out.println("출력문자 :" + (char)intValue2);
		
	    int intValue3 = 10;
	    int intValue4 = intValue3/4;
	    System.out.println(intValue4);
		
	    int intValue5 = 10;
	    //int intValue6 = 10 / 4.0;   //컴파일 에러
	    double doubleValue = intValue5 / 4.0;
	    System.out.println(doubleValue);
		
	    int x = 1;
	    int y = 2;
	    double result = (double) x / y;
	    System.out.println(result);

	    // 출력 예시
	    // 30
	    // 유니코드 : 66
	    // 출력문자 : B
	    // 2
	    // 2.5
	    // 0.5


	    // ex 6 : String Concat

	    //숫자 연산
	    int value = 10 + 2 + 8;
	    System.out.println("value : " + value);
		
	    //결합 연산
	    String str1 = 10 + 2 + "8";
	    System.out.println("str1 : " + str1);
		
	    String str2 = 10 + "2" + 8;
	    System.out.println("str2 : " + str2);
		
	    String str3 = "10" + 2 + 8;
	    System.out.println("str3 : " + str3);
		
	    String str4 = "10" + (2 + 8);
	    System.out.println("str4 : " + str4);

	    // 출력 예시
	    // value : 20
	    // str1 : 128
	    // str2 : 1028
	    // str3 : 1028
	    // str4 : 1010


	    // ex 7 : Conversion

	    int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);		
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);

	    // 출력 예시
	    // value1 : 10
	    // value2 : 3.14
	    // value3 : true
	    // str1 : 10
	    // str2 : 3.14
	    // str3 : true
    }
}
