public class Kiraci{
    evSahibi evSahibi;
    String name;
    String phoneNumber;
    public Kiraci(String name,String phoneNumber,evSahibi evSahibi){
        this.name=name;
        this.evSahibi=evSahibi;
        this.phoneNumber=phoneNumber;
    }
    public void displayInfo(){
        // public evSahibi owner;//Bilgileri görüntüleme demektir.
        System.out.println("\nKiracının adı: " + name + "\ntelefonbilgisi: "+phoneNumber+"\n\nEv sahibinin bilgileri:");
        evSahibi.displayInfo();
    }
}
