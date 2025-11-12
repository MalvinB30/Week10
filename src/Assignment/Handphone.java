package Assignment;

public class Handphone extends Barang {
    private String warna;
    public static int total = 0;
    
    public Handphone(int id, String nama, double harga, int stok, String warna) {
        super(id, nama, harga, stok);
        this.warna = warna;
        total++;
    }
    
    public String getWarna() { return warna; }
    
    @Override
    public String toString() {
        return "ID       : H" + id + "\nNama : " + nama + " " + warna + "\nStok : " + stok + "\nHarga : " + (int)harga;
    }
}
