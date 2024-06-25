import java.util.InputMismatchException;
import java.util.Scanner;

public class MainBuku05 {
    public static void main(String[] args) {
        StackBuku05 stackBuku = new StackBuku05(10);

        stackBuku.push(new Buku05("Pemrograman Java", "John Doe", 2020));
        stackBuku.push(new Buku05("Algoritma dan Struktur Data", "Jane Doe", 2019));
        stackBuku.push(new Buku05("Jaringan Komputer", "Alice", 2018));
        stackBuku.push(new Buku05("Basis Data", "Bob", 2017));

        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Lihat Buku");
            System.out.println("4. Cetak Semua Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            try {
                pilihan = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                scanner.next();
                continue;
            }

            switch (pilihan) {
                case 1:
                    tambahBuku(stackBuku, scanner);
                    break;
                case 2:
                    hapusBuku(stackBuku);
                    break;
                case 3:
                    lihatBuku(stackBuku, scanner);
                    break;
                case 4:
                    stackBuku.cetakSemuaBuku();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }

    private static void tambahBuku(StackBuku05 stackBuku, Scanner scanner) {
        scanner.nextLine();
        System.out.print("Masukkan Judul: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan Pengarang: ");
        String pengarang = scanner.nextLine();

        int tahunTerbit = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print("Masukkan Tahun Terbit: ");
            try {
                tahunTerbit = scanner.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                scanner.next();
            }
        }

        stackBuku.push(new Buku05(judul, pengarang, tahunTerbit));
        System.out.println("Buku berhasil ditambahkan.");
    }

    private static void hapusBuku(StackBuku05 stackBuku) {
        Buku05 buku = stackBuku.pop();
        if (buku != null) {
            System.out.println("Buku " + buku.getJudul() + " berhasil dihapus.");
        }
    }

    private static void lihatBuku(StackBuku05 stackBuku, Scanner scanner) {
        scanner.nextLine();
        System.out.print("Masukkan Judul buku yang akan dilihat: ");
        String judul = scanner.nextLine();
        Buku05 bukuDitemukan = null;
        for (int i = 0; i <= stackBuku.top; i++) {
            if (stackBuku.stack[i].getJudul().equals(judul)) {
                bukuDitemukan = stackBuku.stack[i];
                break;
            }
        }
        if (bukuDitemukan != null) {
            System.out.println(bukuDitemukan);
        } else {
            System.out.println("Buku dengan judul tersebut tidak ditemukan.");
        }
    }
}