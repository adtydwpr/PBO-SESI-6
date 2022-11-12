package PBOSESI6;

public abstract class Bangun_Datar {
    String warna;
    
    String getwarna() {
        return warna;
    }

    void setWarna(String warna) {
        this.warna = warna;
    }

    abstract float getLuas();
}
