public class Buku05 {

    String judul, pengarang;
    int halaman, stok, harga;

    Buku05(){
        
    }
    Buku05(String jud, String pg, int hal, int stock, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stock;
        harga = har;
    }
    void tampilInformasi() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah halaman : " + halaman);
        System.out.println("Sisa stok : " + stok);
        System.out.println("Harga : Rp " + harga);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    void terjual(int jml) {
       if (stok > 0) {
        stok -= jml;
        System.out.println(jml + " Buku terjual.");
    } else {
        System.out.println("Maaf, stok habis. Tidak bisa melakukan penjualan.");
    }
}

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }
}