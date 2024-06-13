public class TransaksiRentalNo1 {
    private static int nextKodeTransaksi = 1; // Untuk auto increment kodeTransaksi
    private int kodeTransaksi;
    private String namaPeminjam;
    private int lamaPinjam;
    private double totalBiaya;
    private BarangRentalNo1 barangRental;

    public TransaksiRentalNo1(String namaPeminjam, int lamaPinjam, BarangRentalNo1 barangRental) {
        this.kodeTransaksi = nextKodeTransaksi++;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.barangRental = barangRental;
        hitungTotalBiaya();
    }

    private void hitungTotalBiaya() {
        // Biaya total = biaya sewa per hari * lama pinjam
        this.totalBiaya = barangRental.getBiayaSewa() * lamaPinjam;
    }

    // Getter untuk kodeTransaksi (tidak ada setter karena diatur otomatis)
    public int getKodeTransaksi() {
        return kodeTransaksi;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public void setNamaPeminjam(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }

    public int getLamaPinjam() {
        return lamaPinjam;
    }

    public void setLamaPinjam(int lamaPinjam) {
        this.lamaPinjam = lamaPinjam;
        hitungTotalBiaya(); // Perhitungan ulang total biaya jika lama pinjam diubah
    }

    public double getTotalBiaya() {
        return totalBiaya;
    }

    public BarangRentalNo1 getBarangRental() {
        return barangRental;
    }

    public void setBarangRental(BarangRentalNo1 barangRental) {
        this.barangRental = barangRental;
        hitungTotalBiaya(); // Perhitungan ulang total biaya jika barang rental diubah
    }
}
