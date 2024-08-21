package baiDemoThuake;

public class hinhVuong extends hinhHoc{
    private double canh;

    public double getCanh(){
        return canh;
    }
    public void setCanh(double canh){
        this.canh = canh;
    }
    public hinhVuong(){
    }
    public hinhVuong(String tenHinh){
        super(tenHinh);
    }
    public HinhVuong(String tenHinh, double canh) {
        super (tenHinh);
        this.tenHinh =  tenHinh;
        this.canh = canh;
    }
    public double getDienTich(){
        return getCanh()*getCanh();
    }
}
