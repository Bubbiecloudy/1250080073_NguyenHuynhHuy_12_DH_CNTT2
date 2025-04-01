package Lab1;
import java.util.Scanner;

public class Bai11 {

    public static int daoNguocSo(int n) {
        int daoNguoc = 0;
        while (n != 0) {
            daoNguoc = daoNguoc * 10 + n % 10;
            n = n / 10;
        }
        return daoNguoc;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap mot so nguyen: ");
        int so = scanner.nextInt();

        int soDaoNguoc = daoNguocSo(so);
        System.out.println("So dao nguoc cua so " + so + " la: " + soDaoNguoc);
    }
}

