import java.util.Scanner;

public class RecursivePrime {
    static boolean isPrime(int number, int dividing) {
        // Eğer bölen sayı 1'e eşitse, asal sayıdır.
        if (dividing == 1) {
            return true;
        } else {
            // Eğer bölen sayı 1'e eşit değilse ve number'a bölünüyorsa, asal değildir.
            if (number % dividing == 0) {
                return false;
            } else {
                // Aksi durumda, sayıyı bir önceki bölenle kontrol et.
                return isPrime(number, dividing - 1);
            }
        }
    }

    public static void main(String[] args) {
        // GİRİLEN SAYININ ASAL SAYI OLUP OLMADUĞI RECURSİVE METOT İLE KONTROL EDİLİR
        // Kullanıcıdan sayı istenir
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println(number + " sayısı ASAL değildir !");
        } else {
            // Sayının asal olup olmadığını kontrol ederken, 2'den (sayının yarısına kadar olan) bölenlerin kontrolü yeterlidir.
            boolean isPrime = isPrime(number, number / 2);
            if (isPrime) {
                System.out.println(number + " sayısı asal sayıdır !");
            } else {
                System.out.println(number + " sayısı asal sayı değildir !");
            }
        }
    }
}
