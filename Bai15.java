package Lab1;
import java.util.Scanner;

public class Bai15 {
    public static void tachNgayThangNam(String ngay) {
        ngay = ngay.trim();

        int ngaySo = 0, thangSo = 0, namSo = 0;

        String[] phanTach = ngay.split("/");

        for (int i = 0; i < phanTach.length; i++) {
            if (i == 0) {
                ngaySo = Integer.parseInt(phanTach[i]);
            } else if (i == 1) {
                thangSo = Integer.parseInt(phanTach[i]);
            } else if (i == 2) {
                namSo = Integer.parseInt(phanTach[i]);
            }
        }

        System.out.println("Ngay: " + ngaySo);
        System.out.println("Thang: " + thangSo);
        System.out.println("Nam: " + namSo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ngay (dd/mm/yyyy): ");
        String ngay = scanner.nextLine();

        tachNgayThangNam(ngay);
    }
}

