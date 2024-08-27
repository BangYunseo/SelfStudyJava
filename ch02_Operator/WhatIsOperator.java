import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception{ // ex 3 ~ ex 5로 인한 throws Exception 작성
	    // ex 1 : Sign Operator
      int x = -100;
      int result1 = +x;
      int result2 = -x;
      System.out.println("result1 = " + result1);
      System.out.println("result2 = " + result2);
		
      byte b = 100;
      // byte result3 = -b;  //컴파일 에러 
      int result3 = -b; 
      System.out.println("result3 = " + result3);
	    
	    // 출력 예시
	    // result1 = -100
      // result2 = 100
      // result3 = -100

	    
	    // ex 2 : Increase Decrease Operator

	    int x = 10;
      int y = 10;
      int z;
		
      System.out.println("-----------------------");
      x++;
      ++x;
      System.out.println("x = " + x);		

      System.out.println("-----------------------");		
      y--;
      --y;
      System.out.println("y = " + y);		

      System.out.println("-----------------------");		
      z = x++;
      System.out.println("z = " + z);
      System.out.println("x = " + x);
		
      System.out.println("-----------------------");		
      z = ++x;
      System.out.println("z = " + z);
      System.out.println("x = " + x);
		
      System.out.println("-----------------------");				
      z = ++x + y++;
      System.out.println("z = " + z);
      System.out.println("x = " + x);
      System.out.println("y = " + y);

	    // 출력 예시
	    // -----------------------
      // x = 12
      // -----------------------
      // y = 8
      // -----------------------
      // z = 12
      // x = 13
      // -----------------------
      // z = 14
      // x = 14
      // -----------------------
      // z = 23
      // x = 15
      // y = 9


	    // ex 3 : Deny Logic Operator

	    boolean play = true;
      System.out.println(play);

      play = !play;
      System.out.println(play);

      play = !play;
      System.out.println(play);
      
	    // 출력 예시
	    // true
      // false
      // true
      

	    // ex 4 : Arithmetic Operator
	    
	    int v1 = 5;
      int v2 = 2;
		
      int result1 = v1 + v2;
      System.out.println("result1 = " + result1);
		
      int result2 = v1 - v2;
      System.out.println("result2 = " + result2);
		
      int result3 = v1 * v2;
      System.out.println("result3 = " + result3);
		
      int result4 = v1 / v2;
      System.out.println("result4 = " + result4);
		
      int result5 = v1 % v2;
      System.out.println("result5 = " + result5);
		
      double result6 = (double) v1 / v2;
      System.out.println("result6 = " + result6);	

	    // 출력 예시
	    // result1 = 7
      // result2 = 3
      // result3 = 10
      // result4 = 2
      // result5 = 1
      // result6 = 2.5


      // ex 5 : Char Operator

      char c1 = 'A' + 1;
      char c2 = 'A';
      
      //char c3 = c2 + 1;    //컴파일 에러
      System.out.println("c1 : " + c1);
      System.out.println("c2 : " + c2);

      // 출력 예시
      // c1 : B
      // c2 : A


      // ex 6 : String Concat

      String str1 = "JDK" + 6.0;
      String str2 = str1 + ".VER";
      System.out.println(str2);
		
      String str3 = "JDK" + 3 + 3.0;
      String str4 = 3 + 3.0 + "JDK";
      System.out.println(str3);
      System.out.println(str4);

      // 출력 예시
      // JDK6.0.VER
      // JDK33.0
      /// 6.0JDK

      
      // ex 7 : Compare Operator

      int num1 = 10;
      int num2 = 10;
		
      boolean result1 = (num1 == num2); 
      boolean result2 = (num1 != num2); 
      boolean result3 = (num1 <= num2);
		
      System.out.println("result1 = " + result1);
      System.out.println("result2 = " + result2);
      System.out.println("result3 = " + result3);
		
      char char1 = 'A';
      char char2 = 'B';
      
      boolean result4 = (char1 < char2);
      System.out.println("result4 = " + result4);	

      // 출력 예시
      // result1 = true
      // result2 = false
      // result3 = true
      // result4 = true


      // ex 8 : Compare Operator 2

      // 출력 예시
      // true
      // false
      // true
      // true


      // ex 9 : Logical Operator
      int charCode = 'A';		
      if( (charCode>=65) & (charCode<=90) ) {
        System.out.println("대문자");
      }
      if( (charCode>=97) && (charCode<=122) ) {
        System.out.println("소문자");
      }
      if( !(charCode<48) && !(charCode>57) ) {
        System.out.println("0~9 숫자");
      }
      
      int value = 6;
      if( (value%2==0) | (value%3==0) ) {
        System.out.println("2 또는 3의 배수");
      }

      // 출력 예시
      // 대문자
      // 2 또는 3의 배수
    

      
	    // ex 10 : Assignment Operator
	    
	    int result = 0;
      
      result += 10;
      System.out.println("result = " + result);		
      
      result -= 5;
      System.out.println("result = " + result);		
		
      result *= 3;
      System.out.println("result = " + result);		
      
      result /= 5;
      System.out.println("result = " + result);		
		
      result %= 3;
      System.out.println("result = " + result);	

	    // 출력 예시
	    // result = 10
      // result = 5
      // result = 15
      // result = 3
      // result = 0


      // ex 11 : Conditional Operation
      int score = 85;
      char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
      System.out.println(score + "점은 " + grade + "등급입니다.");

      // 출력 예시 
      // 85점은 B등급입니다.
    }
}
