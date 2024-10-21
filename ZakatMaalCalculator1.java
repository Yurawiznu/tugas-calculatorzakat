import java.util.Scanner;
public class ZakatMaalCalculator1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            System.out.println("Pilih zakat yang ingin dihitung:");
            System.out.println("1. Zakat Maal (2.5% dari harta)");
            System.out.println("2. Zakat Fitrah (per orang)");
            System.out.print("Masukkan pilihan Anda (1 atau 2): ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah harta yang dimiliki: ");
                    double harta = input.nextDouble();
                    double zakatMaal = harta * 2.5 / 100;
                    System.out.printf("Jumlah zakat maal yang harus dibayarkan: Rp %.2f%n", zakatMaal);
                    break;

                case 2:
                    System.out.print("Masukkan jumlah orang yang harus dibayarkan zakat fitrah: ");
                    int jumlahOrang = input.nextInt();
                    double zakatFitrah = jumlahOrang * 30000;
                    System.out.printf("Jumlah zakat fitrah yang harus dibayarkan: Rp %.2f%n", zakatFitrah);
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1 atau 2.");
                    break;
            }

            System.out.print("Apakah Anda ingin menghitung zakat lagi? (YA/Tidak): ");
            ulang = input.next().charAt(0);
        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Terima kasih sudah menggunakan kalkulator zakat!");

        input.close();
    }
}
