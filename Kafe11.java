import java.util.Scanner;
public class Kafe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;

        System.out.println("Masukkan Menu: ");
        menu = sc.nextLine();
        System.out.println("Masukkan Ukuran Cup: ");
        ukuranCup = sc.next().charAt(0);
        System.out.println("Masukkan Jumlah: ");
        jumlah = sc.nextInt();
        System.out.println("Masukkan Keanggotaan (True/False): ");
        keanggotaan = sc.nextBoolean();

        double hargaMenu = 0;

        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
            case "teh":
            hargaMenu = 7000;
            case "coklat":
            hargaMenu = 20000;
                break;
            default: 
            System.out.println("Menu tidak tersedia");
        }

        double totalHarga = hargaMenu * jumlah;

        switch (ukuranCup) {
            case 'S':
                break;
                case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
                case 'L':
                totalHarga += 0.4 * totalHarga;
                break;
            default: 
            System.out.println("Ukuran Cup tidak tersedia");
        }

        double diskon = keanggotaan ? 0 : 0.1;
        double nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Item Pembelian: " + jumlah + " " + menu + " Dengan Ukuran Cup " + ukuranCup);
        System.out.println("Nominal Bayar: " + nominalBayar);
    }
}
