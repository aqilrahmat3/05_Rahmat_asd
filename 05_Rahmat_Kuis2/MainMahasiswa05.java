import java.util.Scanner;
public class MainMahasiswa05 {
    public static void main(String[] args) {

        Mahasiswa05.mahasiswaList.add(new Mahasiswa05("111", "Aqil Rahmat", "14-07-2005"));
        Mahasiswa05.mahasiswaList.add(new Mahasiswa05("112", "Rheza Chandra", "08-11-2004"));
        Mahasiswa05.mahasiswaList.add(new Mahasiswa05("113", "James Tanzil", "14-02-2005"));
        Mahasiswa05.mahasiswaList.add(new Mahasiswa05("114", "Raka Herza", "21-04-2003"));

        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Lihat Mahasiswa");
            System.out.println("4. Cetak Semua Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    Mahasiswa05.tambahMahasiswa(scanner);
                    break;
                case 2:
                    Mahasiswa05.hapusMahasiswa(scanner);
                    break;
                case 3:
                    Mahasiswa05.lihatMahasiswa(scanner);
                    break;
                case 4:
                    Mahasiswa05.cetakSemuaMahasiswa();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }
}