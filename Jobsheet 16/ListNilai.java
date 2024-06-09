import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListNilai {
    List<Mahasiswa> mhs = new ArrayList<>();
    List<MataKuliah> matkul = new ArrayList<>();
    List<Nilai> listNilai = new ArrayList<>();

    public void inputDataMahasiswa(Mahasiswa... mahasiswas) {
        mhs.addAll(Arrays.asList(mahasiswas));
    }

    public void inputNilaiMahasiswa(Nilai n) {
        listNilai.add(n);
    }

    public void inputDataMataKuliah(MataKuliah... mk) {
        matkul.addAll(Arrays.asList(mk));
    }

    public void tampilDataMahasiswa() {
        mhs.stream().forEach(mhs -> {
        mhs.tampil();
    });
    }

    public void tampilDataMataKuliah() {
        matkul.stream().forEach(matkul -> {
        matkul.tampil();
    });
    }

    public void tampilListNilai() {
        for (int i = 0; i < listNilai.size(); i++) {
            int indexMhs = linearSearchMHS(listNilai.get(i).nimMhs);
            int indexMatkul = linearSearchMatkul(listNilai.get(i).kdMatkul);
                System.out.printf("%-10s %-12s %-10.2f\n",
                mhs.get(indexMhs).nama, matkul.get(indexMatkul).namaMatkul,
                listNilai.get(i).nilai);
        }
    }

    int linearSearchMHS(String nim) {
        for (int i = 0; i < mhs.size(); i++) {
            if (nim.equals(mhs.get(i).nim)) {
            return i;
        }
    }
    return -1;
    }

    int linearSearchMatkul(String kode) {
        for (int i = 0; i < matkul.size(); i++) {
            if (kode.equals(matkul.get(i).kode)) {
            return i;
        }
    }
    return -1;
    }

    int linearSearchNilaiMahasiswa(String nimMahasiswa) {
        for (int i = 0; i < listNilai.size(); i++) {
            if (nimMahasiswa.equals(listNilai.get(i).nimMhs)) {
            return i;
        }
    }
    return -1;
    }

    public void sortingData() {
        Collections.sort(listNilai, new Comparator<Nilai>() {
    public int compare(Nilai n1, Nilai n2) {
        return Double.compare(n1.nilai, n2.nilai);
    }
    });
    }

    public void removeList (){
        listNilai.remove(0);
    }
}