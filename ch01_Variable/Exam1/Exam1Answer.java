import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
      String name = "김자바";
      int age = 30;
      String tel1 = "010", tel2 = "123", tel3 = "4567";
      // 전화번호 그룹 별 저장
      
      System.out.println("이름 : " + name);
      System.out.print("나이 : " + age + "\n");
      System.out.printf("전화 : %1$s-%2$s-%3$s", tel1, tel2, tel3);
      // printf를 통한 출력
    }
}
