package �ּ���_CARE;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyCase implements Company {

	ArrayList<String> namelist = new ArrayList<String>();
	ArrayList<String> ranklist = new ArrayList<String>();
	ArrayList<String> basicpaylist = new ArrayList<String>();
	ArrayList<String> extrapaylist = new ArrayList<String>();
	ArrayList<String> tarifflist = new ArrayList<String>();
	ArrayList<String> salarylist = new ArrayList<String>();

	int j;

	@Override
	public void saveWorker(String name, String rank, String basicpay, String extrapay) {
		namelist.add(name);
		ranklist.add(rank);
		basicpaylist.add(basicpay);
		extrapaylist.add(extrapay);
		if (Integer.parseInt(basicpay) <= 2000000) {
			tarifflist.add("0.01");
		} else if (Integer.parseInt(basicpay) <= 4000000) {
			tarifflist.add("0.02");
		} else if (Integer.parseInt(basicpay) > 4000000) {
			tarifflist.add("0.03");
		}
		int a = Integer.parseInt(basicpay);
		int b = Integer.parseInt(extrapay);
		double c = Double.parseDouble((tarifflist.get(namelist.indexOf(name))));
		double salay = a + b - (a + b) * c;
		salarylist.add(Integer.toString((int)(salay)));
	}

	@Override
	public void modify(String name) {
		if(namelist.indexOf(name) == -1) {
			System.out.println("ã���ô� ������ �������� �ʽ��ϴ�.");
		}
		else {
		for (String a : namelist) {
			if (a.equals(name)) {
				int j = namelist.indexOf(name);

				Scanner sc1 = new Scanner(System.in);
				System.out.println("������ ���� : ");
				String rank = sc1.next();
				ranklist.add(j, rank);

				System.out.println("������ �⺻�� : ");
				String basicpay = sc1.next();
				basicpaylist.add(j, basicpay);

				System.out.println("������ ���� : ");
				String extrapay = sc1.next();
				extrapaylist.add(j, extrapay);
				
				if (Integer.parseInt(basicpay) <= 2000000) {
					tarifflist.add(j,"0.01");
				} else if (Integer.parseInt(basicpay) <= 4000000) {
					tarifflist.add(j,"0.02");
				} else if (Integer.parseInt(basicpay) > 4000000) {
					tarifflist.add(j,"0.03");
				}
				int d = Integer.parseInt(basicpay);
				int e = Integer.parseInt(extrapay);
				double f = Double.parseDouble((tarifflist.get(namelist.indexOf(name))));
				double salay_1 = d + e - (d + e) * f;
				salarylist.add(j,Integer.toString((int)(salay_1)));
			}

		}
		}

	}

	@Override
	public void search(String name) {
		j = namelist.indexOf(name);
		if(j == -1) {
			System.out.println("ã���ô� ������ �������� �ʽ��ϴ�.");
		}
		else {
		outputTitle();
		System.out.println(namelist.get(j) + "\t" + ranklist.get(j) + "\t\t" + basicpaylist.get(j) + "\t\t"
				+ extrapaylist.get(j) + "\t\t" + tarifflist.get(j) + "\t\t" + salarylist.get(j));
		}
	}

	@Override
	public void outputTitle() {
		System.out.println("�̸�\t\t����\t\t�⺻��\t\t\t����\t\t\t����\t\t\t����");

	}

	@Override
	public void output() {
		for (int j = 0; j < 1; j++) {
			outputTitle();
			for (int i = 0; i < namelist.size(); i++) {
				System.out.println(namelist.get(i) + "\t" + ranklist.get(i) + "\t\t" + basicpaylist.get(i) + "\t\t"
						+ extrapaylist.get(i) + "\t\t" + tarifflist.get(i) + "\t\t" + salarylist.get(i));
			}
		}

	}

}
