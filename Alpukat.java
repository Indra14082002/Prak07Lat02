public class Alpukat extends buah {

    @Override
    public void TampilInfo(){
        System.out.println("Informasi Data Harga Buah");
        System.out.println("Nama Buah: " + this.getNAMA());
        System.out.println("Harga    : " + this.getHarga());
        System.out.println("warna    : " + this.getWARNA());
    }

}
