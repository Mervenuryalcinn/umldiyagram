public class Bina extends Konut{
    private int numberOfFloors;

    public void setNumberOfFloors(int numberOfFloors) {

        this.numberOfFloors = numberOfFloors;
    }

    public int getNumberOfFloors() {

        return numberOfFloors;
    }

    public Bina(String address,int numberOfFloors) {
         // Üst sınıfın (Konut) kurucu metodunu çağırarak adres bilgisini ayarlamak için
        super(address);
         // numberOfFloors alanını kurucu metod aracılığıyla ayarlamak için
        this.numberOfFloors=numberOfFloors;



    }
    @Override
    void displayInfo(){ //Bilgileri görüntüleme demektir.
         // Üst sınıfın (Konut) displayInfo metodunu çağırarak adres bilgisini görüntüle
        super.displayInfo();
         // Bina sınıfına ait kat sayısı bilgisini görüntüle
        System.out.println("kat sayısı " +numberOfFloors);

    }
}
