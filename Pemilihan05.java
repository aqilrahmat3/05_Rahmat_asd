import java.util.Scanner;

public class Pemilihan05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai tugas: ");
        double tugas = input.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        double kuis = input.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double uts = input.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double uas = input.nextDouble();

        double nilaiAkhir = hitungNilaiAkhir(tugas, kuis, uts, uas);
        if (nilaiAkhir == -1) {
            System.out.println("Nilai tidak valid");
        } else {
            String nilaiHuruf = konversiNilaiHuruf(nilaiAkhir);
            String keterangan = nilaiHuruf.equals("D") || nilaiHuruf.equals("E") ? "TIDAK LULUS" : "SELAMAT ANDA LULUS";
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("Keterangan: " + keterangan);
        }

        input.close();
    }

    public static double hitungNilaiAkhir(double tugas, double kuis, double uts, double uas) {
        // Cek apakah nilai berada dalam rentang 0-100
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            return -1;
        }

        // Hitung nilai akhir
        double nilaiAkhir = 0.2 * tugas + 0.2 * kuis + 0.3 * uts + 0.3 * uas;
        return nilaiAkhir;
    }

    public static String konversiNilaiHuruf(double nilaiAkhir) {
        if (nilaiAkhir >= 80) {
            return "A";
        } else if (nilaiAkhir >= 75) {
            return "B+";
        } else if (nilaiAkhir >= 70) {
            return "B";
        } else if (nilaiAkhir >= 65) {
            return "C+";
        } else if (nilaiAkhir >= 60) {
            return "C";
        } else {
            return "D";
        }
    }
}

