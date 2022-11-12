public class Segitiga extends Bangun_Datar {
    
    private float alas;
    private float tinggi;
    
    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    float getLuas() {
        return (float) 0.5 * alas * tinggi;
    }
     
}
