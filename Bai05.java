package Lab1;
import java.util.Scanner;

public class Bai05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        int a = scanner.nextInt();
        
        System.out.print("Nhap so thu hai: ");
        int b = scanner.nextInt();
        
        System.out.print("Nhap so thu ba: ");
        int c = scanner.nextInt();

        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        System.out.println("So nho nhat la: " + min);

        scanner.close();
    }
}

