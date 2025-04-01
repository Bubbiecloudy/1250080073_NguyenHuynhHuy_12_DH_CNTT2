package Lab1;
import java.util.Scanner;

public class Bai08 {
    
    public static int firstNum(int n) {
        while (n >= 10) {
            n = n / 10;
        }
        return n;
    }

    public static int lastNum(int n) {
        return n % 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap mot so nguyen: ");
        int num = scanner.nextInt();
        
        int chuSoDauTien = firstNum(num);
        System.out.println("Chu su đau tien cua so " + num + " la: " + chuSoDauTien);
        
        int chuSoTanCung = lastNum(num);
        System.out.println("Chu so tan cung cua so " + num + " la: " + chuSoTanCung);
    }
}

