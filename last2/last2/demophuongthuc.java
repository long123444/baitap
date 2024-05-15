import java.util.LinkedList;
public class demophuongthuc {
    public static void main(String[] args) {
        // Tạo một LinkedList
        LinkedList<String> list = new LinkedList<>();
        // Thêm các phần tử vào LinkedList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Danh sách sau khi thêm phần tử: " + list);

        // Thêm phần tử vào đầu danh sách
        list.addFirst("Mango");
        System.out.println("Danh sách sau khi thêm Mango vào đầu: " + list);

        // Thêm phần tử vào cuối danh sách
        list.addLast("Pineapple");
        System.out.println("Danh sách sau khi thêm Pineapple vào cuối: " + list);

        // Truy cập phần tử đầu tiên
        String firstElement = list.getFirst();
        System.out.println("Phần tử đầu tiên: " + firstElement);

        // Truy cập phần tử cuối cùng
        String lastElement = list.getLast();
        System.out.println("Phần tử cuối cùng: " + lastElement);

        // Xóa phần tử đầu tiên
        list.removeFirst();
        System.out.println("Danh sách sau khi xóa phần tử đầu tiên: " + list);

        // Xóa phần tử cuối cùng
        list.removeLast();
        System.out.println("Danh sách sau khi xóa phần tử cuối cùng: " + list);

        // Kiểm tra kích thước của danh sách
        int size = list.size();
        System.out.println("Kích thước của danh sách: " + size);

        // Xóa một phần tử theo giá trị
        list.remove("Banana");
        System.out.println("Danh sách sau khi xóa Banana: " + list);

        // Kiểm tra xem danh sách có chứa một phần tử cụ thể hay không
        boolean containsCherry = list.contains("Cherry");
        System.out.println("Danh sách có chứa Cherry không? " + containsCherry);
    }
}
