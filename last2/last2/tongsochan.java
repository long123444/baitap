public class tongsochan {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 10};
        int sum = 0;
        for( int num : array) {
            sum = sum+num;
        }
        System.out.println("Kết quả là:"+sum);
    }
}
