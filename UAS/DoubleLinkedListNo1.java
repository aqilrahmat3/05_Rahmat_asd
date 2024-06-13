public class DoubleLinkedListNo1 {
    private NodeNo1 head;
    private NodeNo1 tail;

    public DoubleLinkedListNo1() {
        this.head = null;
        this.tail = null;
    }

    // Method untuk menambahkan node baru di akhir daftar
    public void addLast(TransaksiRentalNo1 data) {
        NodeNo1 newNode = new NodeNo1(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Method untuk mencetak isi dari daftar
    public void printList() {
        NodeNo1 current = head;
        System.out.println("Daftar Transaksi Rental:");
        while (current != null) {
            System.out.println("Kode Transaksi: " + current.data.getKodeTransaksi());
            System.out.println("Nama Peminjam: " + current.data.getNamaPeminjam());
            System.out.println("Lama Pinjam (hari): " + current.data.getLamaPinjam());
            System.out.println("Total Biaya: " + current.data.getTotalBiaya());
            System.out.println("Barang yang Dirental: " + current.data.getBarangRental().getNamaKendaraan());
            System.out.println("Biaya Sewa per Hari: " + current.data.getBarangRental().getBiayaSewa());
            System.out.println("---------------------------------");
            current = current.next;
        }
    }
}
