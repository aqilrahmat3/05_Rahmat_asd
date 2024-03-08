import java.util.ArrayList;
import java.util.Scanner;

class Barang {
    String kode;
    String nama;
    int harga;
    int stok;

    public Barang(String kode, String nama, int harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkanInfo() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }
}

class TransaksiBarang {
    ArrayList<Barang> barangs = new ArrayList<>();

    public void tambahBarang(Barang barang) {
        barangs.add(barang);
    }

    public void tampilkanBarang() {
        for (Barang barang : barangs) {
            barang.tampilkanInfo();
            System.out.println();
        }
    }

    public void tampilkanBarangPembelian(ArrayList<String> kodeBarang) {
        for (String kode : kodeBarang) {
            for (Barang barang : barangs) {
                if (barang.kode.equals(kode)) {
                    barang.tampilkanInfo();
                    System.out.println();
                }
            }
        }
    }

    public void melakukanPembelian(ArrayList<String> kodeBarang, int[] jumlahPembelian) {
        for (int i = 0; i < kodeBarang.size(); i++) {
            String kode = kodeBarang.get(i);
            int jumlah = jumlahPembelian[i];
            for (Barang barang : barangs) {
                if (barang.kode.equals(kode)) {
                    if (barang.stok >= jumlah) {
                        barang.stok -= jumlah;
                    } else {
                        System.out.println("Stok " + barang.nama + " tidak mencukupi!");
                    }
                }
            }
        }
    }
}

public class MainBarang {
    public static void main(String[] args) {

        Barang barang1 = new Barang("K01", "Sabun", 1000, 5);
        Barang barang2 = new Barang("K02", "Pasta Gigi", 2000, 10);
        Barang barang3 = new Barang("K03", "Biore", 3000, 23);
        Barang barang4 = new Barang("K04", "Shampoo", 4000, 55);
        Barang barang5 = new Barang("K05", "Sikat Gigi", 5000, 65);

        TransaksiBarang transaksi = new TransaksiBarang();
        transaksi.tambahBarang(barang1);
        transaksi.tambahBarang(barang2);
        transaksi.tambahBarang(barang3);
        transaksi.tambahBarang(barang4);
        transaksi.tambahBarang(barang5);

        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("======== TOKO MAJU MUNDUR CANTIK ========");
            System.out.println("1. Tampilkan Barang");
            System.out.println("2. Tampilkan Barang Pembelian");
            System.out.println("3. Melakukan Pembelian");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("=== Daftar Barang ===");
                    transaksi.tampilkanBarang();
                    break;
                case 2:
                    System.out.println("=== Barang Pembelian ===");
                    ArrayList<String> kodeBarang = new ArrayList<>();
                    System.out.println("Masukkan kode barang (pisahkan dengan spasi):");
                    String[] inputKodeBarang = scanner.nextLine().split(" ");
                    for (String kode : inputKodeBarang) {
                        kodeBarang.add(kode);
                    }
                    transaksi.tampilkanBarangPembelian(kodeBarang);
                    break;
                case 3:
                    System.out.println("=== Melakukan Pembelian ===");
                    System.out.println("Masukkan kode barang (pisahkan dengan spasi):");
                    String[] inputKodePembelian = scanner.nextLine().split(" ");
                    System.out.println("Masukkan jumlah pembelian (pisahkan dengan spasi):");
                    String[] inputJumlahPembelian = scanner.nextLine().split(" ");

                    ArrayList<String> kodePembelian = new ArrayList<>();
                    int[] jumlahPembelian = new int[inputJumlahPembelian.length];
                    for (int i = 0; i < inputKodePembelian.length; i++) {
                        kodePembelian.add(inputKodePembelian[i]);
                        jumlahPembelian[i] = Integer.parseInt(inputJumlahPembelian[i]);
                    }

                    transaksi.melakukanPembelian(kodePembelian, jumlahPembelian);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
