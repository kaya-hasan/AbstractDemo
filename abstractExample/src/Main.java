public class Main {
    public static void main(String[] args) {
        System.out.println("Basketbolcu: ");
        Basketbolcu basketbolcu = new Basketbolcu();
        basketbolcu.yazdir();


        System.out.println("----------------------");
        System.out.println("Futbolcu: ");
        Futbolcu futbolcu = new Futbolcu();
        futbolcu.yazdir();

        System.out.println("----------------------");
        System.out.println("Voleybolcu: ");
        Voleybolcu voleybolcu = new Voleybolcu();
        voleybolcu.yazdir();
    }
}