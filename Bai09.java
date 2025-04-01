package Lab1;
import java.util.Scanner;

public class Bai09 {
    public static int tinhTongChuSo(int n) {
        int tong = 0;
        while (n > 0) {
            tong += n % 10;
            n = n / 10;
        }
        return tong;
    }

    public static int tinhTichChuSo(int n) {
        int tich = 1;
        while (n > 0) {
            tich *= n % 10;
            n = n / 10;
        }
        return tich;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap mot so nguyen: ");
        int so = scanner.nextInt();

        int tongChuSo = tinhTongChuSo(so);
        System.out.println("Tong cac chu so cua so " + so + " la: " + tongChuSo);

        int tichChuSo = tinhTichChuSo(so);
        System.out.println("Tich cac chu so cua so " + so + " la: " + tichChuSo);
    }
}

