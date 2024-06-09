import java.util.Comparator;
public class MhsComparator05 implements Comparator<Mahasiswa05> {
    
        public int compare(Mahasiswa05 mhs1, Mahasiswa05 mhs2) {
            if (mhs1.nim == mhs2.nim) {
                return 0;
            } else {
    
                return -1;
            }
        }
    
        @Override
        public Comparator<Mahasiswa05> reversed() {
            return Comparator.super.reversed();
        }
}