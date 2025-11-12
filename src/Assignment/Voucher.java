package Assignment;

public class Voucher extends Barang {
    private double pajak;
    public static int total = 0;
    
    public Voucher(int id, String nama, double harga, int stok, double pajak) {
        super(id, nama, harga, stok);
        this.pajak = pajak;
        total++;
    }
    
    public double getHargaJual() {
        return harga + (harga * pajak);
    }
    
    @Override
    public String toString() {
        return "ID       : V" + id + "\nNama : " + nama + "\nNominal : " + (int)harga + "\nStok : " + stok + "\nHarga : " + (int)getHargaJual();
    }
}
