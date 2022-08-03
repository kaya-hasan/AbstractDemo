public class Voleybolcu extends Sporcu{

    @Override
    public void bilgiAl() {
        System.out.println("Maaşı: Yılda 4.000.000 €");
        System.out.println("Kulübü: Vakıfbank");
        System.out.println("Başarı: Üst üste 5 şampiyonluk");
    }

    @Override
    public void yazdir() {
        this.bilgiAl();
    }
}
