import java.util.TreeSet;

public class themphantuvaotreeset {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        // them phân tử vào treeset
        set.add("cây");
        set.add("hoa");
        set.add(" lá");
        set.add("cành");
        System.out.println(" danh sach sau khi thêm "+set);
        // kích thước
        int size = set.size();
        System.out.println( " kích thước có trong treeset là : "+size);
        // xóa phần tử 
        boolean isRemoved = set.remove("cây");
        if (isRemoved) {
            System.out.println("Phần tử 'cây' đã được xóa.");
        } else {
            System.out.println("Phần tử 'cay' không tồn tại trong danh sách.");
        }

        // Hiển thị danh sách sau khi xóa
        System.out.println("Danh sách sau khi xóa phần tử: " + set);
        // xóa tất cả 
        set.clear();
        System.out.println(" danh sách sau khi xóa là : "+ set);
    }
}
