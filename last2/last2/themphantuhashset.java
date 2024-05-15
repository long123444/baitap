import java.util.HashSet;
public class themphantuhashset {
    public static void main(String[] args) {
        // Tạo một HashSet
        HashSet<String> set = new HashSet<>();

        // Thêm các phần tử vào HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        System.out.println("Danh sách sau khi thêm phần tử: " + set);

        // Thêm phần tử vào HashSet (phần tử đã tồn tại sẽ không được thêm vào lần nữa)
        boolean isAdded = set.add("Banana");
        System.out.println("Thêm Banana lần nữa, thành công? " + isAdded);
        System.out.println("Danh sách sau khi thêm Banana lần nữa: " + set);

        // Thêm phần tử mới vào HashSet
        set.add("Date");
        System.out.println("Danh sách sau khi thêm Date: " + set);

        // Kiểm tra kích thước của HashSet
        int size = set.size();
        System.out.println("Kích thước của HashSet: " + size);

        // Kiểm tra xem HashSet có chứa một phần tử cụ thể hay không
        boolean containsCherry = set.contains("Cherry");
        System.out.println("HashSet có chứa Cherry không? " + containsCherry);

        // Xóa một phần tử khỏi HashSet
        set.remove("Apple");
        System.out.println("Danh sách sau khi xóa Apple: " + set);

        // Duyệt qua các phần tử trong HashSet
        System.out.println("Duyệt qua các phần tử trong HashSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Xóa tất cả các phần tử trong HashSet
        set.clear();
        System.out.println("Danh sách sau khi xóa tất cả các phần tử: " + set);
    }
}
