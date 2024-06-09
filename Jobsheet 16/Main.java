import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    ListNilai ln =new ListNilai();

    Mahasiswa m1 = new Mahasiswa("20001", "Thalhah", "021xxx");
    Mahasiswa m2 = new Mahasiswa("20002", "Zubair", "021xxx");
    Mahasiswa m3 = new Mahasiswa("20003", "Abdur-Rahman", "021xxx");
    Mahasiswa m4 = new Mahasiswa("20004", "Sa'ad", "021xxx");
    Mahasiswa m5 = new Mahasiswa("20005", "Sa'ad", "021xxx");
    Mahasiswa m6 = new Mahasiswa("20006", "Ubaidah", "021xxx");
    ln.inputDataMahasiswa(m1, m2, m3, m4, m5, m6);

    MataKuliah mt11 = new MataKuliah("00001", "Internet "+ "of Things",3);
    MataKuliah mt12 = new MataKuliah("00002", "Algoritma " + "dan Struktur Data", 2);
    MataKuliah mt13 = new MataKuliah("00003", "Algoritma " + "dan Struktur Data", 2);
    MataKuliah mt14 = new MataKuliah("00004", "Praktikum " + "Algoritma dan Struktur Data", 3);
    MataKuliah mt15 = new MataKuliah("00005", "Praktikum " + "Algoritma dan Pemrograman", 3);
    ln.inputDataMataKuliah(mt11, mt12, mt13, mt14, mt15);

    Scanner sc = new Scanner(System.in);
    System.out.println("================================================");
    System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
    System.out.println("================================================");
    boolean isTrue = true;
    while (isTrue){
        
    System.out.println("\n1. Input Nilai");
    System.out.println("2. Tampil Nilai");
    System.out.println("3. Mencari Nilai Mahasiswa");
    System.out.println("4. Urut Data Nilai");
    System.out.println("5. Mengahapus data pertama");
    System.out.println("6. Keluar");
    System.out.println("********************************************");
    System.out.print("Pilih : ");
    int choice = sc.nextInt();
    switch (choice) {
        
        case 1:
        System.out.println("Masukkan data");
        System.out.print("Kode : ");
        String kd = sc.next();
        System.out.print("Nilai : ");
        double inputNilai = sc.nextDouble();

        System.out.println("DAFTAR MAHASISWA");
        System.out.println("*****************************************");
        System.out.printf("%-10s %-15s %s\n",
        "NIM", "Nama", "Telp");
        ln.tampilDataMahasiswa();
        System.out.println("Pilih mahasiswa by nim: ");
        String tempNim = sc.next();
        
        System.out.println("DAFTAR MATA KULIAH");
        System.out.println("***********************");
        System.out.printf("%-10s %-40s %s\n",
        "Kode","Mata Kuliah","SKS");
        
        ln.tampilDataMataKuliah();
        System.out.print("Pilih MK by kode: ");
        String tempKd = sc.next();
        
        Nilai temp = new Nilai(kd, inputNilai,
        tempKd, tempNim);
        ln.inputNilaiMahasiswa(temp);
        break;

        case 2:
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("***********************");
        System.out.printf("%-10s %-15s %-40s %-10s %s\n",
        "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
        ln.tampilListNilai();
        break;

        case 3:
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("***********************");
        System.out.printf("%-10s %-15s %-40s %-10s %s\n",
        "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
        ln.tampilListNilai();
        System.out.print("Masukkan data mahasiswa[nim]: ");
        String tempNIM = sc.next();
        int indexSearch = ln.linearSearchNilaiMahasiswa(tempNIM);
        int indexMatkul = 0;
        for(int i = 0; i < ln.matkul.size(); i++){
            if(ln.listNilai.get(indexSearch).
                kdMatkul.equals(ln.matkul.get(i).kode)){
            indexMatkul = i;
                break;
            }
        }
        System.out.printf("%-10s %-15s %-40s %-10s %s\n",
        "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
        System.out.printf("%-10s %-15s %-40s %-10d %.2f\n",
        ln.mhs.get(indexSearch).nim,
        ln.mhs.get(indexSearch).nama,
        ln.matkul.get(indexMatkul).namaMatkul,
        ln.matkul.get(indexMatkul).sks,
        ln.listNilai.get(indexSearch).nilai);
        System.out.println("Total SKS "+ ln.matkul.get(indexMatkul).sks+" telah diambil");
        break;
        
        case 4:
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("***********************");
        System.out.printf("%-10s %-15s %-40s %-10s %s\n",
"NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
        ln.sortingData();
        ln.tampilListNilai();
        break;
        
        case 5:
        System.out.println("Data berhasil dihapus");
        ln.removeList();
        break;

        case 6:
        isTrue = false;
        break;
        default:
        System.out.println("Inputan salah");
    }
    }
}
}