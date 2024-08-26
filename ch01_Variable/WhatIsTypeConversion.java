import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
	    // ex 1 : Integer Literal
	    
	    int var1 = 0b1011;		// 2진수		
	    int var2 = 0206;		// 8진수
	    int var3 = 365;		// 10진수
	    int var4 = 0xB3;		// 16진수
		
	    System.out.println("var1 : " + var1);
	    System.out.println("var2 : " + var2);
	    System.out.println("var3 : " + var3);
	    System.out.println("var4 : " + var4);
	    
	    // 출력 예시
	    // var1 : 11
	    // var2 : 134
	    // var3 : 365
	    // var4 : 179


	    // ex 2 : Byte Type
	    
	    byte var5 = -128;
	    byte var6 = 127;
	    // byte var3 = 128; 
	    // Compile Error(Type mismatch: cannot covert from int to byte)
	    
	    System.out.println(var5);
	    System.out.println(var6);

	    // 출력 예시
	    // -128
	    // 127
	    

	    // ex 3 : Long
	    
	    long var7 = 10;		
	    long var8 = 20L;		
	    // long var3 = 1000000000000;     
	    // Compile Error
	    long var9 = 1000000000000L;
		
	    System.out.println(var7);
	    System.out.println(var8);
	    System.out.println(var9);

	    // 출력 예시
	    // 10
	    // 20
	    // 1000000000000


	    // ex 4 : Char

	    char c1 = 'A';          	// 문자 그대로 저장
	    char c2 = 65;          	// 10진수로 저장
	    char c3 = '\u0041';    	// 16진수로 저장
	    
	    char c4 = '가';         	// 문자 그대로 저장
	    char c5 = 44032;      	// 10진수로 저장
	    char c6 = '\uac00';    	// 16진수로 저장
		
	    System.out.println(c1);
	    System.out.println(c2);
	    System.out.println(c3);
	    
	    System.out.println(c4);
	    System.out.println(c5);
	    System.out.println(c6);

	    // 출력 예시
	    // A
	    // A
	    // A
	    // 가
	    // 가
	    // 가


	    // ex 5 : String

	    String name = "방윤서";
	    String job = "게임 클라이언트 프로그래머";
		
	    System.out.println(name);
	    System.out.println(job);

	    // 출력 예시
	    // 방윤서
	    // 게임 클라이언트 프로그래머


	    // ex 6 : Escape

	    System.out.println("번호\t이름\t직업 ");
	    System.out.print("행 단위 출력\n");
	    System.out.println("행 단위 출력");
	    System.out.println("우리는 \"개발자\" 입니다.");
	    System.out.println("봄\\여름\\가을\\겨울");

	    // 출력 예시
	    // 방윤서
	    // 게임 클라이언트 프로그래머


	    // ex 7 : Float Type and Double Type

	    // float var1 = 3.14;	
	    // Compile Error(Type mismatch)
	    float var10 = 3.14f;
	    double var11 = 3.14;		

	    float var12 = 0.1234567890123456789f;
	    double var13 = 0.1234567890123456789;
		
	    System.out.println("var10 : " + var10);
	    System.out.println("var11 : " + var11);
	    System.out.println("var12 : " + var12);
	    System.out.println("var13 : " + var13);
		
	    // Using e
	    double var14 = 3e6;
	    float var15 = 3e6F;
	    double var16 = 2e-3;
	    System.out.println("var14 : " + var14);
	    System.out.println("var15 : " + var15);
	    System.out.println("var16 : " + var16);

	    // 출력 예시
	    // var10 : 3.14
	    // var11 : 3.14
	    // var12 : 0.12345679
	    // var13 : 0.12345678901234568
	    // var14 : 3000000.0
	    // var15 : 3000000.0
	    // var16 : 0.002


	    // ex 7 : Boolean

	    boolean stop = true;
	    if(stop) {
		    System.out.println("중지합니다.");
	    } else {
		    System.out.println("시작합니다.");
	    }

	    // 출력 예시
	    // 중지합니다.
    }
}
