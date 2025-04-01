package Lab1;
import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ho va ten: ");
        String chuoi = scanner.nextLine().trim();

        String[] phanTach = chuoi.split(" ");
        String ho = phanTach[0];
        String ten = phanTach[phanTach.length - 1];
        String tenDem = "";

        for (int i = 1; i < phanTach.length - 1; i++) {
            tenDem += phanTach[i] + " ";
        }

        System.out.println("Ho: " + ho);
        System.out.println("Ten dem: " + tenDem.trim());
        System.out.println("Ten cuoi: " + ten);

        scanner.close();
    }
}
