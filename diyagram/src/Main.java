import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        Bina binaName=new Bina("Antakya/Hatay",3);
        evSahibi evSahibi = new evSahibi("Merve", "Yalçın",binaName);
        Daire daire1=new Daire(20,"Nilüfer/Bursa",1);
        Daire daire2=new Daire(21,"Merkez/Bursa",2);
        Daire daire3=new Daire(22,"İnegöl/Bursa",3);
        // Daire ile Ev Sahibi arasında bağlantı kur
        evSahibi.addApartment(daire1);
        evSahibi.addApartment(daire2);
        evSahibi.addApartment(daire3);

        // Kiraci oluştur
        Kiraci kiraci = new Kiraci("Esra", "0987654321", evSahibi);

        System.out.println("\nev sahibi ve binaları");
        // Ev Sahibi ile ilgili bilgileri göster
        evSahibi.displayInfo();
        System.out.println("\nbinanın bilgileri");
        binaName.displayInfo();
        System.out.println("\ndaireler");
        // Daire ile ilgili bilgileri göster
        daire1.displayInfo();
        daire2.displayInfo();
        daire3.displayInfo();
        System.out.println("\nkiraci");
        // Kiraci ile ilgili bilgileri göster
        kiraci.displayInfo();

    }
}
