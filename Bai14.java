package Lab1;
import java.util.Scanner;

public class Bai14 {
    public static void tachHoTen(String chuoi) {
        chuoi = chuoi.trim();

        String ho = "";
        String tenDem = "";
        String tenCuoi = "";

        String[] phanTach = chuoi.split(" ");

        if (phanTach.length == 1) {
            ho = phanTach[0];
        } else if (phanTach.length == 2) {
            ho = phanTach[0];
            tenCuoi = phanTach[1];
        } else {
            ho = phanTach[0];
            for (int i = 1; i < phanTach.length - 1; i++) {
                tenDem += phanTach[i] + " ";
            }
            tenCuoi = phanTach[phanTach.length - 1];
        }

        System.out.println("Ho: " + ho);
        System.out.println("Ten dem: " + tenDem.trim());
        System.out.println("Ten cuoi: " + tenCuoi);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ho va ten: ");
        String chuoi = scanner.nextLine();

        tachHoTen(chuoi);
    }
}
