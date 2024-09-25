import java.util.Scanner;

public class KategoriUsia11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usia;

        System.out.println("Masukkan Usia Anda: ");
        usia = sc.nextInt();

        if (usia<0) {
            System.out.println(" Usia yang anda masukkan TIDAK VALID ");
        }
        else if (usia>=0 && usia<=12) {
            System.out.println(" Anda di Kategorikan Usia Sebagai Anak ");
        }
        else if (usia>=13 && usia<=19) {
            System.out.println(" Anda di Kategorikan Usia Sebagai Remaja ");
        }
        else if (usia>=20 && usia<=64) {
            System.out.println(" Anda di Kategorikan Usia Sebagai Dewasa ");
        }
        else if (usia>=65) {
            System.out.println(" Anda di Kategorikan Usia Sebagai Lansia ");
        }
    }
}