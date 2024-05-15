import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class hienthiphantumax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Nhập vào các phần tử (nhập số âm để dừng):");

        while (true) {
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            list.add(number);
        }

        if (list.isEmpty()) {
            System.out.println("Danh sách rỗng, không có phần tử lớn nhất.");
        } else {
            int max = Collections.max(list);
            System.out.println("Phần tử lớn nhất trong ArrayList là: " + max);
        }

        scanner.close();
    }
}


