//@author 20101061 Putu Indra Cahyadi

public class Prak07Lat02 {
    public static void main(String[] args) {
        buah B = new buah();

        B.setNAMA("Salak");
        B.setWARNA("Cokelat");
        B.setHarga(15000);
        B.TampilInfo();

        Alpukat A = new Alpukat();
        A.setNAMA("Alpukat Susu");
        A.setWARNA("Hijau");
        A.setHarga(20000);
        A.TampilInfo();
    }
}
