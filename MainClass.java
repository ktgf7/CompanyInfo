package �ּ���_CARE;


import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		CompanyBasics samsung = new CompanyBasics();
		CompanyCase com = new CompanyCase();

		while (true) {
			System.out.println("1. ���");
			System.out.println("2. ���");
			System.out.println("3. ����");
			System.out.println("4. �˻�");
			System.out.println("5. ����");

			Scanner sc = new Scanner(System.in);
			System.out.println("�޴� ���� : ");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.println("�̸� �Է� : ");
				samsung.setName(sc.next());
				System.out.println("���� �Է� : ");
				samsung.setRank(sc.next());
				System.out.println("�⺻�� �Է� : ");
				samsung.setBasicpay(sc.next());
				System.out.println("���� �Է� : ");
				samsung.setExtrapay(sc.next());

				com.saveWorker(samsung.getName(), samsung.getRank(), samsung.getBasicpay(), samsung.getExtrapay());

			} else if (num == 2) {
				com.output();

			} else if (num == 3) {
				System.out.println("������ ���� �̸� : ");
				String name = sc.next();
				com.modify(name);

			} else if (num == 4) {
				System.out.println("ã�� ���� �̸� : ");
				String name = sc.next();
				com.search(name);
			} else if (num == 5) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}

	}

}
