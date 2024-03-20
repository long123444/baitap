package person;

import java.util.Scanner;

public class person {
    protected String name;
	protected String sex;
	protected String adrress;
	protected String ngaysinh;
		public void intputPerson(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap Ten :");
		this.name = scanner.nextLine();
		System.out.println("Nhap gioi tinh");
		this.sex = scanner.nextLine();
		System.out.println("Nhap dia chi");
		this.adrress = scanner.nextLine();
		System.out.println("Nhap ngay sinh");
		this.ngaysinh = scanner.nextLine();
	}
	public void showPerson(){
		System.out.println("Ho Ten : " +this.name + " Gioi Tinh : " +this.sex +" Dia chi : " +this.adrress +" Ngay sinh : " +this.ngaysinh);
	}
	}

