import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception{ // ex 3 ~ ex 5로 인한 throws Exception 작성
	    // ex 1 : printf
	    int value = 123;
	    System.out.printf("상품의 가격 : %d원\n", value);
	    System.out.printf("상품의 가격 : %6d원\n", value);
	    System.out.printf("상품의 가격 : %-6d원\n", value);
	    System.out.printf("상품의 가격 : %06d원\n", value);

	    double area = 3.14159 * 10 * 10;
	    System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);

	    String name = "홍길동";
	    String job = "도적";
	    System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	    
	    // 출력 예시
	    // 상품의 가격 : 123원
	    // 상품의 가격 :    123원
	    // 상품의 가격 : 123   원
	    // 상품의 가격 : 000123원
	    // 반지름이 10인 원의 넓이:    314.16
	    // 1 | 홍길동        |         도적

	    
	    // ex 2 : key code

	    int keyCode;

	    keyCode = System.in.read();
	    System.out.println("keyCode : " + keyCode);
		
	    keyCode = System.in.read();
	    System.out.println("keyCode : " + keyCode);
		
	    keyCode = System.in.read();
	    System.out.println("keyCode : " + keyCode);

	    // 출력 예시(각각 A, B, C를 누른 후 엔터를 친 경우)
	    // keyCode : 65
	    // keyCode : 66
	    // keyCode : 67


	    // ex 3 : throws Exception

	    int keyCode;
	    while(true) {
		    keyCode = System.in.read();
		    System.out.println("keyCode : " + keyCode);
	    }
	    
	    // 출력 예시
	    // keyCode : 65


	    // ex 4 : stop while
	    
	    int keyCode;
	    while(true) {
		    keyCode = System.in.read();
		    System.out.println("keyCode: " + keyCode);
		    if(keyCode == 113) break;		// keyCode가 113과 동일할 경우
	    }
	    System.out.println("종료");

	    // 출력 예시
	    // keyCode : 113
	    // 종료


	    // ex 5 : stop while
	    
	    Scanner scanner = new Scanner(System.in);
	    String inputData;
	    while(true) {
		    inputData = scanner.nextLine();
		    System.out.println("입력된 문자열 : \"" + inputData + "\"");
		    if(inputData.equals("q")) break;
	    }
		
	    System.out.println("종료");

	    // 출력 예시
	    // 입력된 문자열 : "q"
	    // 종료
    }
}
