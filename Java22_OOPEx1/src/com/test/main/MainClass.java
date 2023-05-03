package com.test.main;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// Avg 객체 생성
		Avg avg = new Avg();
		// 학생 수 만큼 객체를 생성한다.
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		// 입력받는다.
		s1.inputStudentInfo(scanner);
		s2.inputStudentInfo(scanner);
		s3.inputStudentInfo(scanner);
		
		// 학생 정보를 출력한다
		s1.printStudentInfo();
		s2.printStudentInfo();
		s3.printStudentInfo();
		
		// 과목별 총점과 평균을 구해 출력한다.
		avg.printPointTotal(s1, s2, s3);
		avg.printPointAvg();
	}

}

class Avg{
	// 학생수
	int studentCount = 3;
	// 국어 총점
	int koreanTotal;
	// 영어총점
	int englishTotal;
	// 수학총점
	int mathTotal;
	
	// 과목별 총점을 구하고 출력하는 메서드
	public void printPointTotal(Student s1, Student s2, Student s3) {
		koreanTotal = s1.korean + s2.korean + s3.korean;
		englishTotal = s1.english + s2.english + s3.english;
		mathTotal = s1.math + s2.math + s3.math;
		
		System.out.printf("국어 총점 : %d\n", koreanTotal);
		System.out.printf("영어 총점 : %d\n", englishTotal);
		System.out.printf("수학 총점 : %d\n", mathTotal);
	}
	
	// 과목별 평균을 구하고 출력하는 메서드
	public void printPointAvg() {
		int koreanAvg = koreanTotal / studentCount;
		int englishAvg = englishTotal / studentCount;
		int mathAvg = mathTotal / studentCount;
		
		System.out.printf("국어 평균 : %d\n", koreanAvg);
		System.out.printf("영어 평균 : %d\n", englishAvg);
		System.out.printf("수학 평균 : %d\n", mathAvg);
	}
}

// 학생 클래스
class Student{
	// 이름
	String name;
	// 학년
	int grade;
	// 국어
	int korean;
	// 영어
	int english;
	// 수학
	int math;
	// 학생의 정보를 출력하는 메서드
	public void printStudentInfo() {
		System.out.printf("이름 : %s\n", name);
		System.out.printf("학년 : %d\n", grade);
		System.out.printf("국어 : %d\n", korean);
		System.out.printf("영어 : %d\n", english);
		System.out.printf("수학 : %d\n", math);
	}
	
	// 학생의 정보를 입력받는 메서드
	public void inputStudentInfo(Scanner scanner) {
		// 입력받는다
		System.out.print("이름 : ");
		name = scanner.next();
		System.out.print("학년 : ");
		grade = scanner.nextInt();
		System.out.print("국어 : ");
		korean = scanner.nextInt();
		System.out.print("영어 : ");
		english = scanner.nextInt();
		System.out.print("수학 : ");
		math = scanner.nextInt();
	}
}







