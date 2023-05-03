// 하나의 Java파일에 클래스를 여러개 만드는 것과
// 각자 Java파일로 클래스를 만드는 것이 모두 동일하게
// 서로 다른 클래스 파일로 만들어진다.

// Package : Java에서 Java파일과 class파일들을 폴더 단위로 관리하기 위한
// 목적으로 사용한다. 
// Package에 포함되지 않은 파일들은 default package에 포함되어 있다고 한다.
// Package에 포함되어 있는 파일들은 상단 다음과 같이 작성해 줘야 한다.
// package 패키지명

// 같은 패키지에 있는 클래스들은 자유롭게 사용이 가능하지만
// 다른 패키지에 있는 클래스들은 import를 사용하여 클래스가 어떤 패키지에 있는지
// 알려줘야 한다.
import com.test.pkg1.TestClass10;
import com.test.pkg1.TestClass11;

// * 를 이용하면 지정된 패키지의 모든 클래스를 import 할 수 있다.
// 저는 별로 추천하지 않습니다......
import com.test.pkg2.*;

// 위에서 TestClass10은 com.test.pkg1에 있다고 명시하였기 때문에
// 패키지가 다르더라도 같은 이름의 클래스를 import 할 수 없다.
// import com.test.pkg3.TestClass10;

// pkg2와 pkg3에 각각 TestClass20이 있기 때문에
// TestClass20을 사용하는 곳에서 오류가 발생한다.
// import com.test.pkg3.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass1 t1 = new TestClass1();
		System.out.printf("t1 : %s\n", t1);
		
		TestClass2 t2 = new TestClass2();
		System.out.printf("t2 : %s\n", t2);
		
		TestClass10 t10 = new TestClass10();
		System.out.printf("t10 : %s\n", t10);
		
		TestClass11 t11 = new TestClass11();
		System.out.printf("t11 : %s\n", t11);
		
		TestClass20 t20 = new TestClass20();
		System.out.printf("t20 : %s\n", t20);
		
		TestClass21 t21 = new TestClass21();
		System.out.printf("t21 : %s\n", t21);
		
		// import 된 다른 패키지의 클래스와 동일한 이름의 클래스를
		// 사용할 때는 앞에 패키지명을 반드시 붙혀줘야 한다.
		com.test.pkg3.TestClass10 t100 = new com.test.pkg3.TestClass10();
		System.out.printf("t100 : %s\n", t100);
		
		com.test.pkg3.TestClass20 t200 = new com.test.pkg3.TestClass20();
		System.out.printf("t200 : %s\n", t200);
	
	}
}

class TestClass2{
	
}





