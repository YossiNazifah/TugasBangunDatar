package bangundatar;

public class Segitiga extends BangunDatar {
    int alas, tinggi, sisi, keliling;
    float luas;
    
    public Segitiga(float luas, int alas, int tinggi) {
        this.luas = luas;
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    Segitiga() {
        
    }

    public float getLuas() {
        return luas;
    }

    public void setLuas(float luas) {
        this.luas = luas;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    void hitungLuas() {
        luas = 0;
        alas = 5;
        tinggi = 7;
        luas = (float) (0.5 * (alas * tinggi));
        System.out.println(luas);
    }

    @Override
    void hitungKeliling() {
        sisi = 6;
        keliling = sisi * sisi * sisi;
        System.out.println(keliling);
    }
    
    
}
