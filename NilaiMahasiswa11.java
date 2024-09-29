import java.util.Scanner;

public class NilaiMahasiswa11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        char kelas = sc.next().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        int absen = sc.nextInt();

        System.out.print("Masukkan nilai kuis: ");
        double nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        double nilaiUjian = sc.nextDouble();

        double nilaiAkhir = (nilaiKuis * 0.3) + (nilaiTugas * 0.3) + (nilaiUjian * 0.4);

        char nilaiHuruf;
        String kualifikasi;

        if (nilaiAkhir >= 85) {
            nilaiHuruf = 'A';
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir >= 75) {
            nilaiHuruf = 'B';
            kualifikasi = "Baik";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = 'C';
            kualifikasi = "Cukup";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = 'D';
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = 'E';
            kualifikasi = "Sangat Kurang";
        }

        System.out.println("\nMahasiswa dengan nama " + nama + " (NIM " + nim + ") kelas " + kelas + " nomor absen " + absen);
        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
    }
}
