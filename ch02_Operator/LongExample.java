package sec02.exam03;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;		
		long var2 = 20L;		
    
		// long var3 = 1000000000000;
    // L이 붙어있지 않으면 범위를 벗어난 숫자로 판단
    
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	} 
}

// 출력 예시
// 10
// 20
// 1000000000000
