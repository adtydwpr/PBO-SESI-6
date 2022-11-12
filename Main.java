public class Main {

    public static void Main(String[] args) {
        
        Bangun_Datar Segitiga = new SegiTiga(12,20);
        Bangun_Datar Lingkaran = new Lingkaran(60);

        System.out.println("Luas dari Bangun_Datar Segitiga : " + Segitiga.getLuas());
        System.out.println("Luas dari Bangun_Datar Lingkaran : " + Lingkaran.getLuas());
    }
}
