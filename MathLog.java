import java.util.Scanner;
public class MathLog {
    public static void main(String[] args) {
        // Menghitung logaritma natural dari 10
        double log10 = Math.log(10.0);
        System.out.println("Logaritma natural 10: " + log10);

        // Menghitung logaritma natural dari 2
        double log2 = Math.log(2.0);
        System.out.println("Logaritma natural 2: " + log2);

        // Mendapatkan masukan pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        double number = scanner.nextDouble();

        // Menghitung logaritma natural angka masukan
        double logNumber = Math.log(number);
        System.out.println("Logaritma natural " + number + ": " + logNumber);
    }
}
