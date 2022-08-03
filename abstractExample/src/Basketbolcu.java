public class Basketbolcu extends Sporcu{
    @Override
    public void bilgiAl() {
        System.out.println("Maaşı: 4.500.000 ₺");
        System.out.println("Kulübü: Anadolu Efes");
        System.out.println("Başarı: Euroleague Şampiyonluğu");
    }
    @Override
    public void yazdir() {
        this.bilgiAl();
    }
}
