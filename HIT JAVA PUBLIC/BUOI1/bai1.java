package BUOI1;

import java.util.*;

public class bai1 {
    static Scanner sc = new Scanner(System.in);
    public static void HoangAnhPrint(){
        System.out.println("Ha Hoang Anh \n"+"Hit java public 2024\n"+"Basic Java ");
        System.out.printf("%10s,%-5d\n","Hoang Anh",19);
    }
    public static void In4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tuoi cua ban : ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Tuoi cua ban la: "+a);
        System.out.println("Nhap ho ten cua ban : ");
        String s = sc.nextLine();
        System.out.println("Ten cua ban la : "+s);
        
    }
    public static void main(String[] args) {
        // // In dữ liệu
        // HoangAnhPrint();
        // // nhập dữ liệu
        // In4();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b ) {
            System.out.println(" a > b ");
            
        } else if (a == b ) {
            System.out.println("a=b");
            
        }else {
            System.out.println("a < b ");
        }
        float c = a/b;
        int d = a*b;
        int e = a-b;
        int f = a+ b;
        System.out.println(f+" "+e+" " + d+" "+c);



    }
 }