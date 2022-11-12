public class Lingkaran extends Bangun_Datar {
    
    float jari_jari;
    
    public Lingkaran(float jari_jari) {
        this.jari_jari = jari_jari;
    }

    @Override
    float getLuas() {
        return (float) Math.PI * jari_jari * jari_jari;
    }
}
