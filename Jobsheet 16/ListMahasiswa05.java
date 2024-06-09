import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListMahasiswa05 {
    List<Mahasiswa05> mahasiswas = new ArrayList<>();

        public void tambah(Mahasiswa05... mahasiswa) {
                mahasiswas.addAll(Arrays.asList(mahasiswa));
        }

        public void hapus(int index) {
                mahasiswas.remove(index);
        }

        public void update(int index, Mahasiswa05 mhs) {
                mahasiswas.set(index, mhs);
        }

        public void tampil() {
                mahasiswas.stream().forEach(mhs -> {
                        System.out.println("" + mhs.toString());
                });
        }

    void ascendingSort() {
        this.mahasiswas.sort((Mahasiswa05 d1, Mahasiswa05 d2) -> d1.nama.compareTo(d2.nama));
    }

    void descending() {
        this.mahasiswas.sort((Mahasiswa05 d1, Mahasiswa05 d2) -> d2.nama.compareTo(d1.nama));

    }
   
        int LinearSearch(String nim) {
                for(int i=0; i<mahasiswas.size(); i++) {
                        if(nim.equals(mahasiswas.get(i).nim)) {
                                return i;
                        }
                }
                return -1;
        }

        public static void main(String[] args) {
                ListMahasiswa05 lm = new ListMahasiswa05();
                Mahasiswa05 m = new Mahasiswa05("201234", "Noureen", "021xx1");
                Mahasiswa05 m1 = new Mahasiswa05("201235", "Akhleema", "021xx2");
                Mahasiswa05 m2 = new Mahasiswa05("201236", "Shannum", "021xx3");

                lm.tambah(m, m1, m2);

                lm.tampil();
        
                lm.update(lm.LinearSearch("201235"), new Mahasiswa05("201235", "Akhleema Lela", 
                "021xx2"));
                System.err.println("");
                lm.tampil();
               
        Mahasiswa05 key = new Mahasiswa05("201235", null, null);
        lm.update(Collections.binarySearch(lm.mahasiswas, key, new MhsComparator05()),
                new Mahasiswa05("201235", "Akhleema", "021xx2"));
        System.out.println("");
        lm.tampil();
        System.out.println("\n");

        System.out.println("Ascending : ");
        lm.ascendingSort();
        lm.tampil();

        System.out.println("\n");

        System.out.println("Descending : ");
        lm.descending();
        lm.tampil();
    }
}
