public abstract class Konut {
    String address;


    Konut(String address){

        this.address =address;
    }
    void displayInfo(){ //Bilgileri görüntüleme demektir.

        System.out.println("Konut Bilgileri: " + address);

    }

}
