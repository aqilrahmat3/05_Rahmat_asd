import java.util.ArrayList;
import java.util.Scanner;

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
