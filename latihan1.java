
public class latihan1 {
    public static void main(String[] args) {
        canner
        double beratPaket ,biayaPengiriman;

        if ( beratPaket <= 1) {
            biayaPengiriman = 5000;
        } else if ( beratPaket <=5) {
            biayaPengiriman = 10000;
        } else if ( beratPaket <= 10) {
            biayaPengiriman = 15000;
        } else {
            biayaPengiriman = 20000;
        }

        System.out.println("berat paket: " + beratPaket + "kg");
        System.out.println("biaya pengiriman: Rp" + biayaPengiriman);
    }
}