package 최성원_CARE;


import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		CompanyBasics samsung = new CompanyBasics();
		CompanyCase com = new CompanyCase();

		while (true) {
			System.out.println("1. 등록");
			System.out.println("2. 출력");
			System.out.println("3. 수정");
			System.out.println("4. 검색");
			System.out.println("5. 종료");

			Scanner sc = new Scanner(System.in);
			System.out.println("메뉴 선택 : ");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.println("이름 입력 : ");
				samsung.setName(sc.next());
				System.out.println("직급 입력 : ");
				samsung.setRank(sc.next());
				System.out.println("기본급 입력 : ");
				samsung.setBasicpay(sc.next());
				System.out.println("수당 입력 : ");
				samsung.setExtrapay(sc.next());

				com.saveWorker(samsung.getName(), samsung.getRank(), samsung.getBasicpay(), samsung.getExtrapay());

			} else if (num == 2) {
				com.output();

			} else if (num == 3) {
				System.out.println("수정할 직원 이름 : ");
				String name = sc.next();
				com.modify(name);

			} else if (num == 4) {
				System.out.println("찾을 직원 이름 : ");
				String name = sc.next();
				com.search(name);
			} else if (num == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}

}
