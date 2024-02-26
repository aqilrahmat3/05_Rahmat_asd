public class BukuMain05 {

    public static void main(String[] args) {

        Buku05 bk05 = new Buku05();
        bk05.judul = "Today Ends Tomorrow Comes";
        bk05.pengarang = "Denada Pratiwi";
        bk05.halaman = 198;
        bk05.stok = 13;
        bk05.harga = 71000;

        bk05.tampilInformasi();
        bk05.terjual(5);
        bk05.gantiHarga(60000);
        bk05.tampilInformasi();

        Buku05 bk052 = new Buku05("Self Reward","Maherra Ayesha", 160, 29, 59000);
        bk052.terjual(11);
        bk052.tampilInformasi();

        Buku05 bkrahmat = new Buku05("Makna yang dalam", "AqilRahmat", 150, 20, 45000);
        bkrahmat.tampilInformasi();

    }    
}