package baiDemoThuake;

public class hinhChuNhat extends hinhHoc{
    private double chieuDai;
    private double chieuRong;
    public double getChieuDai(){
        return chieuDai;
        }
    public void setChieuDai(double chieuDai){
        this.chieuDai = chieuDai;
    }
    public double getChieuRong(){
        return chieuRong;
    }
    public void setChieuRong(double chieuRong){
        this.chieuRong = chieuRong;
    }
    public hinhChuNhat(String tenHinh, double d, double r){
        super (tenHinh);
        this.chieuDai = d;
        this.chieuRong = r;
    }
    public double getDienTich(){
        return getChieuDai()*getChieuRong();
    }
}
