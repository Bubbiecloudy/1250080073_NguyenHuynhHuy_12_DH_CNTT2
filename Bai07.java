package Lab1;
import java.util.Scanner;

public class Bai07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap diem mon Ly: ");
        double ly = scanner.nextDouble();
        
        System.out.print("Nhap diem mon Hoa: ");
        double hoa = scanner.nextDouble();
        
        System.out.print("Nhap diem mon Sinh: ");
        double sinh = scanner.nextDouble();
        
        System.out.print("Nhap diem mon Toan: ");
        double toan = scanner.nextDouble();
        
        System.out.print("Nhap diem mon May tinh: ");
        double mt = scanner.nextDouble();
        
        double tongDiem = ly + hoa + sinh + toan + mt;
        double tyLePhanTram = (tongDiem / 50) * 100;
        
        System.out.println("Ty le phan tram: " + tyLePhanTram + "%");

        String hang;
        if (tyLePhanTram > 90) {
            hang = "Hang A";
        } else if (tyLePhanTram > 80) {
            hang = "Hang B";
        } else if (tyLePhanTram > 70) {
            hang = "Hang C";
        } else if (tyLePhanTram > 60) {
            hang = "Hang D";
        } else if (tyLePhanTram > 40) {
            hang = "Hang E";
        } else {
            hang = "Hang F";
        }

        System.out.println("Hoc sinh xep hang: " + hang);
    }
}
