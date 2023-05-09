package com.test.main;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

//7팀
//김현승, 나길주, 이채연, 최가연
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentManager sm = new StudentManager();
		System.out.println("학생 관리 프로그램을 가동합니다.");
		int command = 0;
		do {
			command = sm.inputCommand();
			if (command != 5) {
				sm.runProgram(command);
			}

		} while (command != 5);

		System.out.println("학생 관리 프로그램을 종료합니다.");

	}

}

class StudentManager {
	private Scanner scanner;
	private ArrayList<Student> students;
	private ArrayList<Student> printStudentList;

	public StudentManager() {
		scanner = new Scanner(System.in);
		students = new ArrayList<Student>();
		printStudentList = new ArrayList<>();
		
	}


	public int inputCommand() {
		System.out.println("---------------------------------------------");
		System.out.print("명령어를 입력해 주세요 - 1.학생정보 입력, 2.학생정보 검색, 3.과목별 총점 출력, 4. 과목별 평균 출력, 5.종료 : ");
		return scanner.nextInt();
	}

	public void runProgram(int command) {
		// TODO Auto-generated method stub
		switch (command) {
		case 1:
			// 학생 정보 입력
			enterStudentInfo();
			break;
		case 2:
			// 학생 정보 검색
			getStudentInfo();
			break;
		case 3:
			// 과목별 총점 출력
			printTotalScoreBySubject();
			break;
		case 4:
			// 과목별 평균 출력
			printAvgScoreBySubject();
			break;
		default:
			break;
		}
	}

	

	private void enterStudentInfo() {
		System.out.println(" ! 학생 정보 입력 ! ");
		// scanner로
		System.out.print("학생 이름 : ");
		String name = scanner.next();
		System.out.print("학년 : ");
		int grade = scanner.nextInt();
		System.out.print("국어 성적 : ");
		int korean = scanner.nextInt();
		System.out.print("영어 성적 : ");
		int english = scanner.nextInt();
		System.out.print("수학 성적 : ");
		int math = scanner.nextInt();

		String student = name+", "+grade+", "+korean+", "+english+", "+math+"\n";
		saveStudentData(student);
	}

	private void getStudentInfo() {
		loadStudentData();
		System.out.println(" ! 학생 정보 검색 ! ");
		System.out.print("검색할 학생 이름 : ");
		String name = scanner.next();
		searchStudentByName(name);
	}
	
	private void searchStudentByName(String name) {
		printStudentList.clear();
		
		// studentList 객체 만큼 반복
		for (Student student : students) {
			if (student.getName().equals(name)) {
				printStudentList.add(student);

			} else if (name.equals("모두")) {
				printStudentList.add(student);
			}

		}
		if (printStudentList.isEmpty()) { // 리스트가 비어있을 경우
			System.out.println("검색된 정보가 없습니다.");
		} else { // 리스트에 정보가 있을 경우
			for (Student student : printStudentList) {
				student.printStudentInfo();
			}
		}

	}

	private void printTotalScoreBySubject() {
		System.out.println(" ! 과목별 총점 출력 ! ");
		int kor_total = 0; // 국어 총점 변수
		int eng_total = 0; // 영어 총점 변수
		int math_total = 0; // 수학 총점 변수

		for (int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			// student에 studentList 리스트의 i번째 인덱스 값 가져오기.
			kor_total += student.getKorean();
			eng_total += student.getEnglish();
			math_total += student.getMath();
			// 각 total 값에 점수 적립.
		}

		System.out.printf("과목별 총점\n 국어 : %d, 영어 : %d, 수학 : %d\n", kor_total, eng_total, math_total);
	}

	private void printAvgScoreBySubject() {
		System.out.println(" ! 과목별 평균 출력 ! ");
		int num_student = students.size(); // 학생 수
		int kor_total = 0;
		int eng_total = 0;
		int math_total = 0;

		for (int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			kor_total += student.getKorean();
			eng_total += student.getEnglish();
			math_total += student.getMath();
		}

		int kor_avg = kor_total / num_student;
		int eng_avg = eng_total / num_student;
		int math_avg = math_total / num_student;
		// total값을 학생 수로 나눔.

		System.out.printf("과목별 평균\n 국어 : %d, 영어 : %d, 수학 : %d\n", kor_avg, eng_avg, math_avg);
	}

	private void saveStudentData(String student) {
		try {
			// 파일을 쓰기 위한 스트림을 생성한다.
            // 이미 파일이 있다면 기존 내용에 이어서 작성한다.
            // 파일이 없다면 파일을 생성해준다.
            FileOutputStream fos = new FileOutputStream("students.txt", true);
            
            // 쓰기할 데이터를 준비한다.
            String value1 = student;
            
            // 데이터를 바이트 형태로 가공한다.
            byte [] data1 = value1.getBytes();
            
            // 데이터를 쓴다.
            fos.write(data1);
            // 출력버퍼에 데이터가 남아 있을 수도 있기 때문에 
            fos.flush();
            // 닫아준다.
            fos.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	// printStudentList.txt파일에서 학생정보를 불러온다.
	private void loadStudentData() {
		try {
			// 입력 버퍼 사용
			BufferedReader reader = new BufferedReader(new FileReader("students.txt"));
			// line하나씩 일어온다.
			String line = null;
			// 줄 하나씩 읽는다.
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(", ");
				String name = parts[0];
				// parseInt -> string을 int로 변환하여 담음
				int grade = Integer.parseInt(parts[1]);
				int korean = Integer.parseInt(parts[2]);
				int english = Integer.parseInt(parts[3]);
				int math = Integer.parseInt(parts[4]);

				Student student = new Student(name, grade, korean, english, math);
				students.add(student);
			}
			reader.close();
		} catch (IOException e) {
			System.err.println("Error occurred: " + e.getMessage());
		}
	}

}

class Student {
	private String name;
	private int grade;
	private int korean;
	private int english;
	private int math;

	public Student(String name, int grade, int korean, int english, int math) {
		this.name = name;
		this.grade = grade;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}

	public void printStudentInfo() {
		System.out.printf("학생 이름 : %s\n", name);
		System.out.printf("학년 : %d\n", grade);
		System.out.printf("국어 점수 : %d\n", korean);
		System.out.printf("영어 점수 : %d\n", english);
		System.out.printf("수학 점수 : %d\n", math);
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public int getKorean() {
		return korean;
	}

	public int getEnglish() {
		return english;
	}

	public int getMath() {
		return math;
	}

}
