import java.util.ArrayList;
import java.util.Scanner;

public class Mahasiswa05{
    private String nim;
    private String nama;
    private String tglLahir;

    static ArrayList<Mahasiswa05> mahasiswaList = new ArrayList<>();

    public Mahasiswa05() {
    }

    public Mahasiswa05(String nim, String nama, String tglLahir) {
        this.nim = nim;
        this.nama = nama;
        this.tglLahir = tglLahir;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String tampil() {
        return "Mahasiswa{" +
                "nim='" + nim + '\'' +
                ", nama='" + nama + '\'' +
                ", tglLahir='" + tglLahir + '\'' +
                '}';
    }

    public static void tambahMahasiswa(Scanner scanner) {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.next();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.next();
        scanner.nextLine();
        System.out.print("Masukkan Tanggal Lahir: ");
        String tglLahir = scanner.next();
        mahasiswaList.add(new Mahasiswa05(nim, nama, tglLahir));
        System.out.println("Mahasiswa berhasil ditambahkan.");
    }

    public static void hapusMahasiswa(Scanner scanner) {
        System.out.print("Masukkan NIM mahasiswa yang akan dihapus: ");
        String nim = scanner.next();
        Mahasiswa05 mhsHapus = null;
        for (Mahasiswa05 mhs : mahasiswaList) {
            if (mhs.getNim().equals(nim)) {
                mhsHapus = mhs;
                break;
            }
        }
        if (mhsHapus != null) {
            mahasiswaList.remove(mhsHapus);
            System.out.println("Mahasiswa berhasil dihapus.");
        } else {
            System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
        }
    }

    public static void lihatMahasiswa(Scanner scanner) {
        System.out.print("Masukkan NIM mahasiswa yang akan dilihat: ");
        String nim = scanner.next();
        for (Mahasiswa05 mhs : mahasiswaList) {
            if (mhs.getNim().equals(nim)) {
                System.out.println(mhs);
                return;
            }
        }
        System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
    }

    public static void cetakSemuaMahasiswa() {
        for (Mahasiswa05 mhs : mahasiswaList) {
            System.out.println(mhs);
        }
    }
}