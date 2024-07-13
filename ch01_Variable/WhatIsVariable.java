import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        int x = 3;
		int y = 5;
		System.out.println("x : " + x + ", y : " + y);

		int temp = x;
		x = y;
		y = temp;
		System.out.println("x : " + x + ", y : " + y);

		// 출력 예시
		// x : 3, y : 5
		// x : 5, y : 3


		// ex 2 : reset variable
		
		int value = 20;
		int res = value + 10;
		System.out.println("Variable was : " + res);

		// 출력 예시
		// 30


		// ex 3 : number variable

		int v1 = 15;
		if(v1 > 10) {
			int v2 = v1 - 10;
			System.out.println(v2);
		}

		
		// int v3 = v1 + v2 + 5;
		// impossible code : v2 was local variable. if you want to use v2, reset v2 out of if.

		// 출력 예시
		// 5


	    	// ex 4 : time converter variable
	    
		int h = 3, m = 5;
		System.out.println(h + "시간 " + m + "분");
		int total = h * 60 + m;
		System.out.println("총 " + total + "분");

		// 출력 예시
		// 3시간 5분
		// 총 185분
    }
}
