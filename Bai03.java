package Lab1;
import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap nhiet do (oF): ");
        double doF = scanner.nextDouble();

        double doC = (doF - 32) / 1.8;

        System.out.println("Nhiet đo tuong ung (oC): " + doC);

        scanner.close();
    }
}

