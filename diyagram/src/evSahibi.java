import java.util.ArrayList;
import java.util.List;

public class evSahibi{
     // Ev sahibinin bağlı olduğu bina
    Bina binaName;
    String name;
    String soyisim;
    Daire daire;
    // Ev sahibinin sahip olduğu dairelerin listesi
    ArrayList<Daire>daireler;



    public evSahibi(String name,String soyisim, Bina binaName) {
        this.binaName = binaName;
        this.name = name;
        this.soyisim=soyisim;
        daireler=new ArrayList<>();
    }

    public void displayInfo() { //Bilgileri görüntüleme demektir.
        System.out.println("Ev sahibi ismi: " + name+"\nEv sahibi soyisim: "+soyisim +
                "\nbinanın adresi: "+binaName.address+"\nBinanın katsayısı "+binaName.getNumberOfFloors());

    }
    //ev sahibinin sahip oldugu daireleri eklemek için
    public void addApartment(Daire daire) {

        daireler.add(daire);

    }
}





