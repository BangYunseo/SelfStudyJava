package sec01.exam02;

public class VariableUseExample {
	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
    // int형 변수 hour과 minute를 선언 후 각각 3과 5로 초기화
    
		System.out.println(hour + "시간 " + minute + "분");

		int totalMinute = (hour*60) + minute;
    // int형 변수 totalMinute를 선언 후 시간을 min으로 환산
		System.out.println("총 " + totalMinute + "분");
	}
}

// 출력 예시
// 3시간 5분
// 총 185분
