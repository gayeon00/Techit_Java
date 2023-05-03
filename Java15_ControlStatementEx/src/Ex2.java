
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 여기에 있는 모든 문제들은 출력 예시와 똑같이 출력해주세요
		
		// 문제1)
		// 1 2 3
		// 4 5 6
		// 7 8 9
//		// System.out.print("1 ");
//		// System.out.print("2 ");
//		// System.out.print("3 ");
//		
//		for(int i = 0 ; i < 3 ; i++) {
//			System.out.printf("%d ", 1 + i);
//		}
//		
//		System.out.println();
//		
//		// System.out.print("4 ");
//		// System.out.print("5 ");
//		// System.out.print("6 ");
//		
//		for(int i = 0 ; i < 3 ; i++) {
//			System.out.printf("%d ", 4 + i);
//		}
//		
//		System.out.println();
//		
//		// System.out.print("7 ");
//		// System.out.print("8 ");
//		// System.out.print("9 ");
//		
//		for(int i = 0 ; i < 3 ; i++) {
//			System.out.printf("%d ", 7 + i);
//		}
//		
//		System.out.println();
		
		for(int k  = 0 ; k < 3 ; k++) {
			int a1 = 1 + (3 * k);
			
			for(int i = 0 ; i < 3 ; i++) {
				System.out.printf("%d ", a1 + i);
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------");
		
		// 문제2)
		// 3 2 1
		// 6 5 4 
		// 9 8 7
		
//		// System.out.print("3 ");
//		// System.out.print("2 ");
//		// System.out.print("1 ");
//		
//		for(int i = 0 ; i < 3 ; i++) {
//			int a1 = 3 - i;
//			System.out.printf("%d ", a1);
//		}
//		
//		System.out.println();
//		
//		// System.out.print("6 ");
//		// System.out.print("5 ");
//		// System.out.print("4 ");
//		
//		for(int i = 0 ; i < 3 ; i++) {
//			int a1 = 6 - i;
//			System.out.printf("%d ", a1);
//		}
//		
//		System.out.println();
//		
//		// System.out.print("9 ");
//		// System.out.print("8 ");
//		// System.out.print("7 ");
//		
//		for(int i = 0 ; i < 3 ; i++) {
//			int a1 = 9 - i;
//			System.out.printf("%d ", a1);
//		}
//		
//		System.out.println();
		
		for(int k = 0 ; k < 3 ; k++) {
			
			int a2 = 3 + (3 * k);
			
			for(int i = 0 ; i < 3 ; i++) {
				int a1 = a2 - i;
				System.out.printf("%d ", a1);
			}
			
			System.out.println();
		}
		
		System.out.println("------------------------------");
		
		// 문제3)
		// 1 4 7
		// 2 5 8
		// 3 6 9
		
		for(int k = 0 ; k < 3 ; k++) {
			
			int a2 = 1 + k;
			
			for(int i = 0 ; i < 3 ; i++) {
				int a1 = a2 + (3 * i);
				System.out.printf("%d ", a1);
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		
		for(int i = 0 ; i < 3 ; i++) {
			System.out.printf("%d %d %d\n", 1 + i, 4 + i, 7 + i);
		}
		
		System.out.println("-------------------------");
		
		// 문제4)
		// *
		// * *
		// * * *
		
		// System.out.print("* ");
		
//		for(int i = 0 ; i < 1 ; i++) {
//			System.out.print("* ");
//		}
//		
//		System.out.println();
//		
//		// System.out.print("* ");
//		// System.out.print("* ");
//		
//		for(int i = 0 ; i < 2 ; i++) {
//			System.out.print("* ");
//		}
//		
//		System.out.println();
//		
//		// System.out.print("* ");
//		// System.out.print("* ");
//		// System.out.print("* ");
//		
//		for(int i = 0 ; i < 3 ; i++) {
//			System.out.print("* ");
//		}
//		
//		System.out.println();
		
		for(int k = 0 ; k < 3 ; k++) {
			
			int a1 = 1 + k;
			
			for(int i = 0 ; i < a1 ; i++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		System.out.println("-----------------------");
		
		// 문제5)
		//     *
		//   * *
		// * * *
		
//		// System.out.print("  ");
//		// System.out.print("  ");
//		// System.out.print("* ");
//		
//		for(int i = 0 ; i < 3 ; i++) {
//			if(i < 2) {
//				System.out.print("  ");
//			} else {
//				System.out.print("* ");
//			}
//		}
//		System.out.println();
//		
//		// System.out.print("  ");
//		// System.out.print("* ");
//		// System.out.print("* ");
//		
//		for(int i = 0 ; i < 3 ; i++) {
//			if(i < 1) {
//				System.out.print("  ");
//			} else {
//				System.out.print("* ");
//			}
//		}
//		
//		System.out.println();
//		
//		// System.out.print("* ");
//		// System.out.print("* ");
//		// System.out.print("* ");
//		
//		for(int i = 0 ; i < 3 ; i++) {
//			if(i < 0) {
//				System.out.print("  ");
//			} else {
//				System.out.print("* ");
//			}
//		}
//		
//		System.out.println();
		
		for(int k = 0 ; k < 3 ; k++) {
			
			int a1 = 2 - k;
			
			for(int i = 0 ; i < 3 ; i++) {
				if(i < a1) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		System.out.println("----------------------------");
		
		// 문제6)
		// *   *
		//   *
		// *   *
		
//		// System.out.print("* ");
//		// System.out.print("  ");
//		// System.out.print("* ");
//		
//		for(int i = 0 ; i < 3 ; i++) {
//			if(i % 2 == 0) {
//				System.out.print("* ");
//			} else {
//				System.out.print("  ");
//			}
//		}
//		System.out.println();
//		
//		// System.out.print("  ");
//		// System.out.print("* ");
//		// System.out.print("  ");
//		
//		for(int i = 0 ; i < 3 ; i++) {
//			if(i % 2 == 1) {
//				System.out.print("* ");
//			} else {
//				System.out.print("  ");
//			}
//		}
//		
//		System.out.println();
//		
//		// System.out.print("* ");
//		// System.out.print("  ");
//		// System.out.print("* ");
//		
//		for(int i = 0 ; i < 3 ; i++) {
//			if(i % 2 == 0) {
//				System.out.print("* ");
//			} else {
//				System.out.print("  ");
//			}
//		}
//		
//		System.out.println();
		
		
		for(int k = 0 ; k < 3 ; k++) {
			
			int a1 = k % 2;
			
			for(int i = 0 ; i < 3 ; i++) {
				if(i % 2 == a1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}  

}







