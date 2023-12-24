public class Daire extends Konut{
    private int apartmentNumber;
    int apartmanFloors;

    public Daire(int apartmentNumber,String address,int apartmanFloors) {
        super(address);
        this.apartmentNumber=apartmentNumber;
        this.apartmanFloors=apartmanFloors;
    }

    public int compareTo(Daire daire) {
        if (this.apartmentNumber < daire.apartmentNumber) {
            return -1;
        } else if (this.apartmentNumber == daire.apartmentNumber) {
            return 0;
        } else {
            return 1;
        }
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }


    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Apartment Number:"+ apartmentNumber);

        //Bilgileri görüntüleme demektir.
        //   public int compareTo(Daire);
    }
}
