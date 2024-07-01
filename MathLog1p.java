import java.util.Scanner;
public class MathLog1p {
    public static void main(String[] args) {
        // Menghitung log1p dari 0.5
        double log1p05 = Math.log1p(0.5);
        System.out.println("Log1p dari 0.5: " + log1p05);

        // Menghitung log1p dari 1
        double log1p1 = Math.log1p(1.0);
        System.out.println("Log1p dari 1: " + log1p1);

        // Mendapatkan masukan pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        double number = scanner.nextDouble();

        // Menghitung log1p dari angka masukan
        double log1pNumber = Math.log1p(number);
        System.out.println("Log1p dari " + number + ": " + log1pNumber);
    }
}
