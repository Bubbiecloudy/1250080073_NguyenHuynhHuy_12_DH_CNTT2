package Lab1;
import java.util.Scanner;

public class Bai12 {
    public static boolean kiemTraSoDoiXung(int n) {
        int soGoc = n;
        int daoNguoc = 0;

        while (n > 0) {
            daoNguoc = daoNguoc * 10 + n % 10;
            n = n / 10;
        }

        return soGoc == daoNguoc;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap mot so nguyen: ");
        int so = scanner.nextInt();

        if (kiemTraSoDoiXung(so)) {
            System.out.println("So " + so + " la so doi xung.");
        } else {
            System.out.println("So " + so + " khong phai la so doi xung.");
        }
    }
}


