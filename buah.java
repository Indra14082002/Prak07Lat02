public class buah {
    private String NAMA, WARNA;
    private double Harga;

    public void setNAMA(String N){
        this.NAMA = N;
    }
    protected String getNAMA(){
        return this.NAMA;
    }
    public void setWARNA(String color){
        this.WARNA = color;
    }
    public String getWARNA(){
        return this.WARNA;
    }
    public void setHarga(double H){
        this.Harga = H;
    }
    public double getHarga(){
        return this.Harga;
    }

    public void TampilInfo(){
        System.out.println("Informasi Data Harga Buah");
        System.out.println("Nama Buah: "+this.NAMA);
        System.out.println("Harga    : "+this.Harga);
        System.out.println("warna    : "+this.WARNA);

    }
}
