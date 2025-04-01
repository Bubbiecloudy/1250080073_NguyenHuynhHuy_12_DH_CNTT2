package Lab1;
import java.util.Scanner;

public class Bai10 {
    public static int demSoChuSo(int n) {
        int dem = 0;
        while (n > 0) {
            dem++;
            n = n / 10;
        }
        return dem;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap mot so nguyen: ");
        int so = scanner.nextInt();

        int soChuSo = demSoChuSo(so);
        System.out.println("So chu so cua so " + so + " la: " + soChuSo);
    }
}


