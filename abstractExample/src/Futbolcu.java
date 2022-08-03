public class Futbolcu extends Sporcu{
    @Override
    public void bilgiAl() {
        System.out.println("Maaşı: 26.000.000 $");
        System.out.println("Kulübü: Manchester United FC");
        System.out.println("Başarı: Üst üste 5 Ballon Dor");

    }

    @Override
    public void yazdir() {
        this.bilgiAl();
    }
}
