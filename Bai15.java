import java.util.Scanner;

public class TachNgayThangNam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ngay (dd/mm/yyyy): ");
        String ngay = scanner.nextLine().trim();

        String[] phanTach = ngay.split("/");
        System.out.println("Ngay: " + phanTach[0]);
        System.out.println("Thang: " + phanTach[1]);
        System.out.println("Nam: " + phanTach[2]);

        scanner.close();
    }
}


