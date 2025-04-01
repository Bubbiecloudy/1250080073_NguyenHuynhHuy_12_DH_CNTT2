package Lab1;
import java.util.Scanner;

public class Bai13 {
    public static int demSoTu(String chuoi) {
        int dem = 0;
        boolean trongTu = false;

        for (int i = 0; i < chuoi.length(); i++) {
            char kiTu = chuoi.charAt(i);

            if (kiTu == ' ') {
                trongTu = false;
            } else {
                if (!trongTu) {
                    dem++;
                    trongTu = true;
                }
            }
        }

        return dem;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String chuoi = scanner.nextLine();

        int soTu = demSoTu(chuoi);
        System.out.println("So tu trong chuoi: " + soTu);
    }
}

