package sec02.exam02;

public class ByteExample {
	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
    
		//byte var6 = 128; 
    // 128은 byte의 범위(-128 ~ 127)을 벗어나기 때문에 불가능
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
	} 
}

// 출력 예시
// -128
// -30
// 0
// 30
// 127
