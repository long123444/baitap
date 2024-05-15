import java.util.HashMap;

public class hienthimap {
    public static void main(String[] args) {
          HashMap <String , String> hashmap = new HashMap<>();
          hashmap.put(" táo"," vàng");
          hashmap.put(" chuối ", "xanh");
          hashmap.put("dâu", " đỏ");
          System.out.println(" hiên thi ra màn hình "+hashmap);
            // xóa phần tử
            hashmap.clear();
            System.out.println(" sau khi xóa còn lại là :"+ hashmap);
    }
}
