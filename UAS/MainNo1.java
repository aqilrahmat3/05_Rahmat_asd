public class MainNo1 {
    public static void main(String[] args) {
        // Membuat objek BarangRental
        BarangRentalNo1 barang1 = new BarangRentalNo1("B1234", "Avanza", "Mobil", 2019, 200000);
        BarangRentalNo1 barang2 = new BarangRentalNo1("B5678", "Xenia", "Mobil", 2020, 180000);
        
        // Membuat objek TransaksiRental
        TransaksiRentalNo1 transaksi1 = new TransaksiRentalNo1("John Doe", 5, barang1);
        TransaksiRentalNo1 transaksi2 = new TransaksiRentalNo1("Jane Smith", 3, barang2);

        // Membuat double linked list untuk menyimpan transaksi rental
        DoubleLinkedListNo1 listTransaksi = new DoubleLinkedListNo1();
        listTransaksi.addLast(transaksi1);
        listTransaksi.addLast(transaksi2);

        // Menampilkan daftar transaksi
        listTransaksi.printList();
    }
}
