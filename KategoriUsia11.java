import java.util.Scanner;

public class KategoriUsia11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int usia = -1;

            System.out.print("Masukkan usia Anda: ");
            if (sc.hasNextInt()) { 
                usia = sc.nextInt();
                if (usia < 0) {
                    System.out.println("Usia harus berupa angka positif. Silakan coba lagi.");
                }
            } else {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                sc.next(); 
            }

        String kategori = "";

        if (usia >= 0 && usia <= 12) {
            kategori = "Anak";
        } else if (usia >= 13 && usia <= 19) {
            kategori = "Remaja";
        } else if (usia >= 20 && usia <= 64) {
            kategori = "Dewasa";
        } else if (usia >= 65) {
            kategori = "Lansia";
        }

        System.out.println("Kategori usia: " + kategori);
    }
}
