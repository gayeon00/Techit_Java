
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// printf : 출력 형식을 설정하여 출력해준다.
		// %d : 정수, %f : 실수, %s : 문자열, %c : 문자
		
		System.out.printf("정수 : %d, 실수 : %f, 문자열 : %s, 문자 : %c\n", 
				100, 11.11, "안녕하세요", 'a');
		
		// 정수를 출력할 때 %f를 사용하는 경우
		// %f에 설정되는 값이 실수가 아니므로 오류가 발생한다.
		// System.out.printf("%f\n", 100);
		
		// 실수를 출력할 때 %d를 사용하는 경우
		// %d에 설정되는 값이 정수가 아니므로 오류가 발생한다.
		// System.out.printf("%d\n", 11.11);
		
		// 정수를 출력할 때 %c를 사용하는 경우
		// 지정된 정수에 해당하는 문자를 가져와 출력해준다.
		System.out.printf("%c\n", 65);
		
		// 문자를 출력할 때 %d를 사용하는 경우
		// 오류 발생
		// System.out.printf("%d\n", 'A');
		
		// %s를 사용하는 경우
		// %s에 설정될 값들을 문자열로 변환한 다음 출력해준다.
		System.out.printf("%s, %s, %s, %s\n", 100, 11.11, 'A', true);
		
		// 정수를 출력할 때 지정된 개수만큼 자리를 확보하고 우측 정렬로 출력한다.
		System.out.printf("%d\n", 100);
		System.out.printf("%d\n", 10000);
		System.out.printf("%10d\n", 100);
		System.out.printf("%10d\n", 10000);
		
		// 정수를 출력할 때 지정된 개수만큼 자리를 확보하고 우측 정렬로 출력한다.
		// 남은 공간은 0으로 채워준다.
		System.out.printf("%010d\n", 100);
		System.out.printf("%010d\n", 10000);
		
		// 실수를 출력할 때 정수자리와 소수점이하 자리의 개수를 설정해준다.
		// 10.2f -> 10자리를 확보하고 앞의 8자리를 정수자리, 뒤의 2자리를 소수점이하 자리수로
		// 사용한다.
		System.out.printf("%10.2f\n", 11111.1111);
		
		// 문자열
		// 10자리를 확보하고 우측 정렬로 출력한다.
		System.out.printf("%10s\n", "abc");
	}

}






