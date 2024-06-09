import java.util.Scanner;

public class GraphMain05 {
    public static void main(String[] args) throws Exception {
        Scanner sc11 = new Scanner(System.in);
        GraphMatriks05 gdg = new GraphMatriks05(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();

        for (int i = 0; i < 4; i++) {
        System.out.println("Gedung " + (char) ('A' + i) + ":");
        System.out.println("  inDegree: " + gdg.inDegree(i));
        System.out.println("  outDegree: " + gdg.outDegree(i));
    }
       
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Update Jarak");
            System.out.println("7. Hitung Edge");
            System.out.println("8. Exit");
            System.out.print("Pilih menu: ");
            int menu = sc11.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan asal: ");
                    int asal = sc11.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    int tujuan = sc11.nextInt();
                    System.out.print("Masukkan jarak: ");
                    int jarak = sc11.nextInt();
                    gdg.makeEdge(asal, tujuan, jarak);
                    break;
                case 2:
                    System.out.print("Masukkan asal: ");
                    asal = sc11.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    tujuan = sc11.nextInt();
                    gdg.removeEdge(asal, tujuan);
                    break;
                case 3:
                    for (int i = 0; i < 4; i++) {
                        System.out.println("Gedung " + (char) ('A' + i) + ":");
                        System.out.println("  inDegree: " + gdg.inDegree(i));
                        System.out.println("  outDegree: " + gdg.outDegree(i));
                    }
                    break;
                case 4:
                    gdg.printGraph();
                    break;
                case 5:
                    System.out.print("Masukkan asal: ");
                    asal = sc11.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    tujuan = sc11.nextInt();
                    if (gdg.hasEdge(asal, tujuan)) {
                        System.out.println("Edge ada.");
                    } else {
                        System.out.println("Edge tidak ada.");
                    }
                    break;
                case 6:
                    System.out.print("Masukkan asal: ");
                    asal= sc11.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    tujuan= sc11.nextInt();
                    System.out.print("Masukkan jarak baru: ");
                    jarak = sc11.nextInt();
                    gdg.updateJarak(asal, tujuan, jarak);
                    break;
                case 7:
                    System.out.println("Jumlah edge dalam graf: " + gdg.hitungEdge());
                    break;
                case 8:
                    sc11.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}