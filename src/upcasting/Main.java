package upcasting;

public class Main {
    public static void main(String[] args) {
        Pekerja pekerja = new Pekerja();
        pekerja.tanyaIdentitas();

        // contoh upcasting
        pekerja = new CEO();
        pekerja.tanyaIdentitas();

        // contoh upcasting
        Karyawan karyawan = new Karyawan();
        pekerja = (Pekerja) karyawan;
        pekerja.tanyaIdentitas();
    }
}






