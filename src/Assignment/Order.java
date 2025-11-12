package Assignment;

public class Order {
    private String id;
    private Voucher voucher;
    private Handphone handphone;
    private int jumlah;
    private static int counterV = 1;
    private static int counterH = 1;
    
    public Order(Voucher voucher, int jumlah) {
        this.id = "OV" + counterV + "-" + Voucher.total;
        counterV++;
        this.voucher = voucher;
        this.jumlah = jumlah;
    }
    
    public Order(Handphone handphone, int jumlah) {
        this.id = "OH" + counterH + "-" + Handphone.total;
        counterH++;
        this.handphone = handphone;
        this.jumlah = jumlah;
    }
    
    public String getId() { return id; }
    public Voucher getVoucher() { return voucher; }
    public Handphone getHandphone() { return handphone; }
    public int getJumlah() { return jumlah; }
}
