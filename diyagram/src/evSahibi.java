import java.util.ArrayList;
import java.util.List;

public class evSahibi{
    Bina binaName;
    String name;
    String soyisim;
    Daire daire;
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

    public void addApartment(Daire daire) {

        daireler.add(daire);

    }
}





