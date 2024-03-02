import java.util.Scanner;

public class MethodPattern {

    static void pattern(int num) {
        if (num <= 0) {
            System.out.print(num + " ");
            return;
        }

        System.out.print(num + " ");
        pattern(num - 5);
        System.out.print(num + " ");
    }


    public static void main(String[] args) {
        // GİRİLEN SAYIYI 0 VEYA NEGATİF OLANA KADAR EKSİLTİP SIFIR VEYA NEGATİF OLDUĞUNDA SEİYİ AYNALAR
        // Kullanıcıdan serinin ilk basşlangıç noktası istenir.
        int startingLimit;

        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin başlangıç değerini giriniz: ");
        startingLimit = input.nextInt();

        pattern(startingLimit);
    }
}
