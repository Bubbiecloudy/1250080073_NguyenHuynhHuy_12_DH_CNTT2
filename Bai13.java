package Lab1;
import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String chuoi = scanner.nextLine();

        int soTu = 0;
        boolean isWord = false;

        for (int i = 0; i < chuoi.length(); i++) {
            char c = chuoi.charAt(i);

            if (c != ' ' && !isWord) {
                soTu++;
                isWord = true;
            }
            if (c == ' ') {
                isWord = false;
            }
        }

        System.out.println("So tu trong chuoi: " + soTu);
    }
}
