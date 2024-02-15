import java.util.Scanner;
public class demkitu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int demkitu = 0;
        String chuoi;
        char kitu;
        do{
            System.out.println(" nhap chuoi:");
            chuoi = scanner.nextLine();
        }
        while (chuoi.length()>80);
        System.out.println("nhap ki tu can dem:");
        kitu = scanner.next().charAt(0);
        for (int i=0;i<chuoi.length();i++)
        {
            if(kitu == chuoi.charAt(i))
            demkitu++;
        }
        System.out.println( " so lan xuat hien " + kitu + " la :"+ kitu+" lan" );
    }
}
