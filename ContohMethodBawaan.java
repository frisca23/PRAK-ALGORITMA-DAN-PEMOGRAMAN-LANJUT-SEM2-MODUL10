public class ContohMethodBawaan {
    public static void main(String[] args) {
        String str = "Frisca Putri!";
        // Menggunakan metode length() untuk menghitung panjang string
        int panjang = str.length();
        System.out.println("Panjang string adalah: " + panjang);
        // Menggunakan metode substring() untuk mengambil substring dari string
        String substring = str.substring(0, 5);
        System.out.println("Substring pertama dari string adalah: " + substring);
        // Menggunakan metode toUpperCase() untuk mengonversi string menjadi huruf besar
        String hurufBesar = str.toUpperCase();
        System.out.println("String dalam huruf besar adalah: " + hurufBesar);
        // Menggunakan metode toLowerCase() untuk mengonversi string menjadi huruf kecil
        String hurufKecil = str.toLowerCase();
        System.out.println("String dalam huruf kecil adalah: " + hurufKecil);
    }
}