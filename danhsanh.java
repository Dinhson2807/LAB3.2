package LAB3_2_b2;

import java.util.Scanner;

public class danhsanh {
    Scanner sc = new Scanner(System.in);
int a;
int b[]=null;
public void nhapdsSanhSu(){
    hangsanhsu b[];
    do{
    System.out.print("Nhap so luong hang hoa: ");
    a = sc.nextInt();
 if(a<=0){
    System.out.print("Nhap sai, yeu cau nhap lai!!! Khong duoc <=0 ");
 }
}while(a<=0);
b = new hangsanhsu[a];
for(int i=0; i<a;i++){
System.out.print("hang hoa thu " + (i+1)+" : ");
  b[i] = new hangsanhsu();
}
}
public void indsDoSanhSu(){
    int b[] = null;
    hangsanhsu b[];
    hangsanhsu[][] hangsanhsu;
    b = hangsanhsu [a];
    for(int i=0; i<a;i++){
        System.out.print("hang hoa thu " + (i+1)+" : ");
          b[i].xuattt2();;
}
}
public void nhapdshangthucpham(){
    hangthucpham b[];
    do{
    System.out.print("Nhap so luong hang hoa: ");
    a = sc.nextInt();
 if(a<=0){
    System.out.print("Nhap sai, yeu cau nhap lai!!! Khong duoc <=0 ");
 }
}while(a<=0);
b = new hangthucpham[a];
for(int i=0; i<a;i++){
System.out.print("hang hoa thu " + (i+1)+" : ");
  b[i] = new hangthucpham();
}
}
public void indshangthucpham(){
    int b[] = null;
    hangthucpham b[];
    hangthucpham[][] hangthucpham;
    b = hangthucpham [a];
    for(int i=0; i<a;i++){
        System.out.print("hang hoa thu " + (i+1)+" : ");
          b[i].xuattt1();;
}
}
public void nhapdsDienmay(){
    hangdienmay b[];
    do{
    System.out.print("Nhap so luong hang hoa: ");
    a = sc.nextInt();
 if(a<=0){
    System.out.print("Nhap sai, yeu cau nhap lai!!! Khong duoc <=0 ");
 }
}while(a<=0);
b = new hangdienmay[a];
for(int i=0; i<a;i++){
System.out.print("hang hoa thu " + (i+1)+" : ");
  b[i] = new hangdienmay();
}
}
public void indsDoDiemmay(){
    int b[] = null;
    hangdienmay b[];
    hangdienmay[][] hangdienmay;
    b = hangdienmay[a];
    for(int i=0; i<a;i++){
        System.out.print("hang hoa thu " + (i+1)+" : ");
          b[i].xuattt3();;
}
}
}