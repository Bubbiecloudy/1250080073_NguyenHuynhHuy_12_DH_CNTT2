package Lab1;
import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chieu rong: ");
        double chieuRong = scanner.nextDouble();

        System.out.print("Nhap chieu dai: ");
        double chieuDai = scanner.nextDouble();

        double dienTich = chieuRong * chieuDai;

        System.out.println("Dien tich hinh chu nhat la: " + dienTich);
    }
}


