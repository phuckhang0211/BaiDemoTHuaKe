package baiDemoThuake;

public class testTK {
        public static void main(String[] args){
            hinhHoc h1 = new hinhVuong("Hinh vuong 1", 20.5);
            System.out.println("Dien tich hinh vuong "+h1.getDienTich());
            hinhHoc h2 = new hinhChuNhat("Hinh chu nhat 1", 20, 5);
            System.out.println("Dien tich hinh vuong "+h2.getDienTich());

        }
}
