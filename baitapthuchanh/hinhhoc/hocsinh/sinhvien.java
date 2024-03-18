package hinhhoc.hocsinh;
public class sinhvien ;
public static void main(String[] args) {
    public class HocSinh {
        public String HoTen;
        public String QueQuan;
        public String GioiTinh;
        public int masv;
        public int NamSinh;
        public int Tuoi;
        public void nhapThongTinHs(){
            Scanner sc = new Scanner(System.in);
            System.out.print("nhap Ho va Ten sinh vien : ");
            HoTen = sc.nextLine();
            System.out.print("nhap que quan sinh vien : ");
            QueQuan = sc.nextLine();
            System.out.print("nhap gioi tinh : ");
            GioiTinh = sc.nextLine();
            System.out.print("nhap nam sinh : ");
            NamSinh = sc.nextInt();   
            System.out.print("nhap ma sinh vien : ");
            masv = sc.nextInt();
        }
    }