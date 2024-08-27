import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String name = scanner.nextLine();
		
		System.out.print("패스워드 : ");
		String strPassword = scanner.nextLine();
		
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {
			if(password == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패 : PW ERROR");
			}
		} else {
			System.out.println("로그인 실패 : ID ERROR");
		}
	}
}
