import java.util.Scanner;

public class MainHotel05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        
        HotelService05 list = new HotelService05();
        
        Hotel05 h1 = new Hotel05("Ijen Suites", "Malang", 1500000, (byte) 10);
        Hotel05 h2 = new Hotel05("Grand Mercure", "Malang", 2000000, (byte) 9);
        Hotel05 h3 = new Hotel05("Golden Tulip", "Batu", 1300000, (byte) 8);
      
        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);   
       
        System.out.println("Data hotel sebelum sorting:");
        list.tampil();

        System.out.println("======================================================");

        System.out.println("Data hotel setelah sorting desc berdasarkan bintang:");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data hotel setelah sorting desc berdasarkan harga:");
        list.bubbleSort2();
        list.tampil();

        System.out.println("=====================================================");

        System.out.println("Data hotel setelah sorting desc berdasarkan bintang:");
        list.selectionSort();
        list.tampil();

        System.out.println("Data hotel setelah sorting desc berdasarkan harga:");
        list.selectionSort2();
        list.tampil();
   
        sc05.close();
    }
}