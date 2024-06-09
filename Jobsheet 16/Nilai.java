public class Nilai {
    double nilai;
    String kode, kdMatkul, nimMhs;

    public Nilai(String kode, double nilai, String kdMatkul, String nimMhs) {
        this.nilai = nilai;
        this.kode = kode;
        this.kdMatkul = kdMatkul;
        this.nimMhs = nimMhs;
    }

    void tampil() {
        System.out.printf("%d", nilai);
    }
}