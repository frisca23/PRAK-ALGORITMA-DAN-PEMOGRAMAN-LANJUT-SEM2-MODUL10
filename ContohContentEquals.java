public class ContohContentEquals {
    public static void main(String[] args) {
        String str1 = "Hello, Frisca!";
        String str2 = "hello, frisca!";
        boolean equals = str1.contentEquals(str2);
        System.out.println(equals);
    }
}