package LAB3_2;
import java.util.Date; 
import java.text.SimpleDateFormat;
import java.util.Scanner;
class Hanghoa {
    Scanner sc= new Scanner(System.in);
    protected String mahang,tenhang,nhasanxuat;
    protected int gia;
    Hanghoa(){
        System.out.println("Nhap ma hang: ");
        mahang=sc.nextLine();
        System.out.println("Nhap ten sam pham: ");
        tenhang=sc.nextLine();
        System.out.println("Nhap ten nha san xuat: ");
        nhasanxuat=sc.nextLine();
        System.out.println("Nhap gia tien: ");
        gia=sc.nextInt();
    }
    Hanghoa(String mahang,String tenhang,String nhasanxuat,int gia ){
        this.tenhang=tenhang;
        this.mahang=mahang;
        this.nhasanxuat=nhasanxuat;
        this.gia=gia;
    }
}
 class hangthucpham extends Hanghoa {
    
    private String ngayhh;
    private String ngaysx;
    hangthucpham(){
      
        Scanner gg = new Scanner(System.in);
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nhap ngay san xuat");
        ngaysx = formatter.format(date);
        System.out.println("Nhap ngay het han");
        ngayhh = formatter.format(date);
    }
    hangthucpham(String mahang,String tenhang,String nhasanxuat,int gia, String ngaysx, String ngayhh ){
        super(mahang,tenhang,nhasanxuat,gia);
        this.ngaysx=ngaysx;
        this.ngayhh=ngayhh;
    }
    public void xuattt1(){
        System.out.println("Ma san pham: "+mahang+"\tTen san pham: "+tenhang+"Nha san xuat: "+nhasanxuat+"Gia thanh: "+gia+"Ngay san xuat: "+ngaysx+"Ngay het han"+ngayhh+"\t");
    }

}
public class bai2{
    public static void main(String[]args){
       hangthucpham a= new hangthucpham();
       a.xuattt1();

    }
}