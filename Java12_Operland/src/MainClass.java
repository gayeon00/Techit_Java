
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 산술연산자
		// 사칙연산과 나머지를 구한다.
		// 더하기
		int a1 = 10 + 3;
		// 빼기
		int a2 = 10 - 3;
		// 곱하기
		int a3 = 10 * 3;
		// 나누기
		int a4 = 10 / 3;
		// 나머지
		int a5 = 10 % 3;
		
		double a6 = 10.0 / 3.0;
		
		System.out.printf("a1 : %d\n", a1);
		System.out.printf("a2 : %d\n", a2);
		System.out.printf("a3 : %d\n", a3);
		System.out.printf("a4 : %d\n", a4);
		System.out.printf("a5 : %d\n", a5);
		System.out.printf("a6 : %f\n", a6);
		
		double a7 = 10 / 3.0;
		double a8 = 10.0 / 3;
		System.out.printf("a7 : %f\n", a7);
		System.out.printf("a8 : %f\n", a8);
		
		// 최우선 연산자
		// . 은 객체, [ ]는 배열할 때 살펴보겠습니다....
		// ( ) : 수학과 같이 가장 먼저 계산을 할 부분을 설정한다.
		int b1 = 10 + 2 * 4;
		int b2 = (10 + 2) * 4;
		
		System.out.printf("b1 : %d\n", b1);
		System.out.printf("b2 : %d\n", b2);
		
		// 단항 연산자
		// ! : true를 false로 false를 true로 바꿔준다.
		boolean c1 = true;
		boolean c2 = !c1;
		boolean c3 = !c2;
		System.out.printf("c1 : %s\n", c1);
		System.out.printf("c2 : %s\n", c2);
		System.out.printf("c3 : %s\n", c3);
		
		// ~ : 비트 0을 1로, 비트 1을 0으로 변환해준다.
		int d1 = 100;
		System.out.printf("%32s\n", Integer.toBinaryString(d1));
		
		int d2 = ~d1;
		System.out.printf("%32s\n", Integer.toBinaryString(d2));
		
		int d3 = ~d1 + 1;
		System.out.println(d3);
		
		// 부호 연산자
		// + : 그대로, - : 양수를 음수로, 음수를 양수로
		int e1 = 100;
		int e2 = +e1;
		int e3 = -e1;
		
		System.out.printf("e1 : %d\n", e1);
		System.out.printf("e2 : %d\n", e2);
		System.out.printf("e3 : %d\n", e3);
		
		// 증감 연산자
		// 변수의 값을 추출하여 증가 혹은 감소 시키고 다시 변수에 저장한다.
		int f1 = 100;
		int f2 = 100;
		
		f1 = f1 + 1;
		++f2;
		
		System.out.printf("f1 : %d\n", f1);
		System.out.printf("f2 : %d\n", f2);
		
		f1 = f1 - 1;
		--f2;
		System.out.printf("f1 : %d\n", f1);
		System.out.printf("f2 : %d\n", f2);
		
		// 쉬프트 연산자
		// >> 비트를 오른쪽으로 지정한 만큼 이동한다. 
		// << 비트를 왼쪽으로 지정한 만큼 이동한다.
		// >>> 비트를 오른쪽으로 지정한 만큼 이동한다. 0으로 채워준다.
		
		int g1 = 100;
		System.out.printf("%32s\n", Integer.toBinaryString(g1));
		
		int g2 = g1 >> 1;
		int g3 = g1 >> 2;
		System.out.printf("%32s\n", Integer.toBinaryString(g2));
		System.out.printf("%32s\n", Integer.toBinaryString(g3));
		
		int g4 = g1 << 1;
		int g5 = g1 << 2;
		System.out.printf("%32s\n", Integer.toBinaryString(g4));
		System.out.printf("%32s\n", Integer.toBinaryString(g5));
		
		System.out.printf("g1 : %d\n", g1);
		System.out.printf("g1 >> 1 : %d\n", g1 >> 1);
		System.out.printf("g1 >> 2 : %d\n", g1 >> 2);
		System.out.printf("g1 << 1 : %d\n", g1 << 1);
		System.out.printf("g1 << 2 : %d\n", g1 << 2);
		
		// 비교연산자
		// 왼쪽의 값이 오른쪽에 대해 어떠한지
		int h1 = 100;
		
		System.out.printf("h1 > 50 : %s\n", h1 > 50);
		System.out.printf("h1 > 200 : %s\n", h1 > 200);
		System.out.printf("h1 < 200 : %s\n", h1 < 200);
		System.out.printf("h1 < 50 : %s\n", h1 < 50);
		System.out.printf("h1 >= 50 : %s\n", h1 >= 50);
		System.out.printf("h1 >= 100 : %s\n", h1 >= 100);
		System.out.printf("h1 >= 200 : %s\n", h1 >= 200);
		System.out.printf("h1 <= 200 : %s\n", h1 <= 200);
		System.out.printf("h1 <= 100 : %s\n", h1 <= 100);
		System.out.printf("h1 <= 50 : %s\n", h1 <= 50);
		System.out.printf("h1 == 100 : %s\n", h1 == 100);
		System.out.printf("h1 == 50 : %s\n", h1 == 50);
		System.out.printf("h1 != 50 : %s\n", h1 != 50);
		System.out.printf("h1 != 100 : %s\n", h1 != 100);
		
		// 논리 연산자
		// 연산자 좌우측의 비교연산자 수식의 결과를 가지고 연산을 하는 연산자
		boolean i1 = 10 > 2;      // true
		boolean i2 = 10 < 20;     // true
		boolean i3 = 10 > 20;     // false
		boolean i4 = 10 > 30;     // false
		
		// && (and)
		// 둘 다 true여야지만 결과가 true로 둘 중 하나라도 false면
		// 결과는 false이다.
		boolean i5 = i1 && i2;
		boolean i6 = i1 && i3;
		boolean i7 = i3 && i1;
		boolean i8 = i3 && i4;
		
		System.out.printf("%s && %s : %s\n", i1, i2, i5);
		System.out.printf("%s && %s : %s\n", i1, i3, i6);
		System.out.printf("%s && %s : %s\n", i3, i1, i7);
		System.out.printf("%s && %s : %s\n", i3, i4, i8);
		
		// || : 둘 다 false 여야지만 false이고 둘 중 하나라도 
		// true라면 결과는 true이다.
		boolean i9 = i1 || i2;
		boolean i10 = i1 || i3;
		boolean i11 = i3 || i1;
		boolean i12 = i3 || i4;
		
		System.out.printf("%s || %s : %s\n", i1, i2, i9);
		System.out.printf("%s || %s : %s\n", i1, i3, i10);
		System.out.printf("%s || %s : %s\n", i3, i1, i11);
		System.out.printf("%s || %s : %s\n", i3, i4, i12);
		
	}

}









