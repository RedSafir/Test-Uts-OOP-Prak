package latihan;

public class Barang {
    // variable
    private String namaBrg;
    private double hargaBrg;
    private int jumBar;
    private double totHargaBrg;
    private tipe tipeBarang;

    enum tipe {Makanan, Minuman, nonKonsumsi}
    
    // constructor
        public Barang(String namaBrg, double hargaBrg, int jumBar, tipe tipeBarang) {
        this.namaBrg = namaBrg;
        this.hargaBrg = hargaBrg;
        this.jumBar = jumBar;
        this.tipeBarang = tipeBarang;
    }

    // Getter
    public int getJumBar() {
        return jumBar;
    }

    public String getNamaBrg() {
        return namaBrg;
    }

    public double getHargaBrg() {
        return hargaBrg;
    }

    public double getTotHargaBrg() {
        return totHargaBrg = hargaBrg * jumBar;
    }

    public tipe getTipeBarang() {
        return tipeBarang;
    }

    // Setter
    public void setJumBar(int jumBar) {
        this.jumBar = jumBar;
    }
}
