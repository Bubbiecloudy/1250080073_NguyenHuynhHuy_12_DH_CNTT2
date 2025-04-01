package Lab1;
import java.util.Scanner;

public class Bai06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap canh a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhap canh b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Nhap canh c: ");
        double c = scanner.nextDouble();
        
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Ba canh tren tao thanh mot tam giac hop le.");
        } else {
            System.out.println("Ba canh tren khong tao thanh mot tam giac hop le.");
        }
    }
}

