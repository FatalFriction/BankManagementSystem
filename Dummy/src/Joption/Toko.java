package Joption;

public class Toko {
    private String Nama;
    private int Berdiri;
    private int Barang;
    private String JenisToko;

    public Toko(String nama, String jenisToko, int berdiri, int barang) {
        this.Nama = nama;
        this.Berdiri = berdiri;
        this.Barang = barang;
        this.JenisToko = jenisToko;
    }

    public Toko(Toko toko)
    {
        this.Nama = toko.Nama;
        this.Barang = toko.Barang;
        this.JenisToko = toko.JenisToko;
        this.Berdiri = toko.Berdiri;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public int getBerdiri() {
        return Berdiri;
    }

    public void setBerdiri(int berdiri) {
        this.Berdiri = berdiri;
    }

    public int getBarang() {
        return Barang;
    }

    public void setBarang(int barang) {
        this.Barang = barang;
    }

    public String getJenisToko() {
        return JenisToko;
    }

    public void setJenisToko(String jenisToko) {
        this.JenisToko = jenisToko;
    }

    @Override
    public String toString() {
        return "Informasi Toko:\n" + "Nama Toko: " + Nama + "\nTahun Toko Berdiri: " + Berdiri + "\nJumlah Barang Di Toko: " + Barang
                + "\nJenis Toko: " + JenisToko;
    }

}
