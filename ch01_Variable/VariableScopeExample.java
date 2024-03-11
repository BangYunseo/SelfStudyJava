package sec01.exam04;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
    // int형 변수 v1 선언 및 15로 초기화
		if(v1 > 10) {  // v1이 10보다 클 때 실행하는 if문
			int v2;            // int형 지역 변수 v2 선언
			v2 = v1 - 10;      // v2의 값을 v1 - 10 = 15 - 10 = 5로 저장
		}
		// int v3 = v1 + v2 + 5;  
    // 위와 같은 명령어를 실행시킬 경우 오류가 발생
    // Why? v2가 지역 변수이기 때문에 if문의 밖에서 실행될 수 없음
	}
}

// 출력 예시
