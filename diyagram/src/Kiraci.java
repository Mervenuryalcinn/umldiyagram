public class Kiraci{
    evSahibi evSahibi;
    String name;
    String phoneNumber;
    // Kiraci sınıfının kurucu metodu
    public Kiraci(String name,String phoneNumber,evSahibi evSahibi){
        this.name=name;
        this.evSahibi=evSahibi;
        this.phoneNumber=phoneNumber;
    }
    public void displayInfo(){
      //Bilgileri görüntüleme demektir.
         // Kiracının adı ve telefon numarası görüntülenir
        System.out.println("\nKiracının adı: " + name + "\ntelefonbilgisi: "+phoneNumber+"\n\nEv sahibinin bilgileri:");
          // Kiracının ev sahibinin bilgilerini görüntülemek için evSahibi sınıfının displayInfo metodu çağrılır
        evSahibi.displayInfo();
    }
}
