public class Bina extends Konut{
    private int numberOfFloors;

    public void setNumberOfFloors(int numberOfFloors) {

        this.numberOfFloors = numberOfFloors;
    }

    public int getNumberOfFloors() {

        return numberOfFloors;
    }

    public Bina(String address,int numberOfFloors) {
        super(address);
        this.numberOfFloors=numberOfFloors;



    }
    @Override
    void displayInfo(){ //Bilgileri görüntüleme demektir.
        super.displayInfo();
        System.out.println("kat sayısı " +numberOfFloors);

    }
}
