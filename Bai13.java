package Lab1;
import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String chuoi = scanner.nextLine();

        String[] tu = chuoi.split(" ");

        int soTu = tu.length;

        System.out.println("So tu trong chuoi: " + soTu);

        scanner.close();
    }
}

