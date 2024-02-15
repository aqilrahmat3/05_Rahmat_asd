public class Fungsi05 {
    static int[][] stock = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };
    
    static int[] harga = {75000, 50000, 60000, 10000};
    public static void main(String[] args) {
        for (int i = 0; i < stock.Length; i++) {
            int pendapatan = hitungPendapatan(stock[i]);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Pendapatan Cabang RoyalGarden " + (i + 1) +": Rp " + pendapatan);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        stockCabang();
        System.out.println();
        kurangiStock();
    } 
    public static int hitungPendapatan(int[] stock) {
        int pendapatan = 0;
        for (int i = 0; i < stock.Lenght; i++) {
            pendapatan += stock[i] * harga[i];
        }
        return pendapatan;
    }
    public static void stocCabang() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Menampilkan Stock");
        for (int j = 0; j < stock.Length; j++) {
            int cabangTerpilih = j;
            int[] stockBarang = stock[cabangTerpilih];

            System.out.print("Total Stock Cabang RoyalGarden " + (cabangTerpilih + i) + ": ");
            for (int i = 0; i < stockCabang.Length; i++) {
                System.out.print(stockCabang[i] + " ");
            }
            System.out.print();

        }
    }
    public static void kurangiStock() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Pengurangan Stock");
        for (int i = 0; i < stock.Length; i++) {
            int cabangTerpilih = i;
            int[] stockCabang = stock[cabangTerpilih];
            int[] pengurangan = {1, 2, 0, 5};
            
            System.out.print("Total Stock Cabang RoyalGarden " + (cabangTerpilih + i) + ": ");
            for (int j = 0; j < stockCabang.Length; j++) {
                stockCabang[j] -= pengurangan [j];
                System.out.print(stockCabang[j] + " ");
            }
        }
    }
}