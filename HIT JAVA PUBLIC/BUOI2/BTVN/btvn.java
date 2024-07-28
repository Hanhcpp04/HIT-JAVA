package BUOI2.BTVN;

import java.util.Scanner;

public class btvn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ban kinh  r: ");
        double r = scanner.nextDouble();
        if (r > 0 && r < 1000) {
            double pi = 3.14;
            
           
            double chuVi = 2 * pi * r;
            double dienTich = pi * r * r;
            
          
            System.out.printf("%.3f %.3f%n", chuVi, dienTich);
        } else {
            System.out.println("R phai thuoc khoang 0 < r < 1000.");
        }
        scanner.close();
    }
}

