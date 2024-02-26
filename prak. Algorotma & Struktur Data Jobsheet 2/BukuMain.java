public class BukuMain {

    public static void main(String[] args) {
        Buku bk = new Buku();
        bk.judul = "Today Ends Tomorrow Comes";
        bk.pengarang = "Denanda Pratiwi";
        bk.halaman = 198;
        bk.stok = 13;
        bk.harga = 71000;
        System.out.println("===========================================");
        bk.tampilInformasi();
        bk.terjual(5);
        bk.gantiHarga(60000);
        bk.tampilInformasi();

        Buku05 bk2Buku11 = new Buku05("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2Buku11.terjual(11);
        bk2Buku11.tampilInformasi();

       int jumlahBukuTerjual = 5;
       double hargaFinal = bk.finalHarga(jumlahBukuTerjual);
       System.out.println("Harga setelah diskon: Rp. " + hargaFinal);
    }
}
