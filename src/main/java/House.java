public class House {

    private String adress;
    private Integer floorsNumber;
    private Integer doorsNumber;
    private Integer windowsNumber;

    public House() {
        //USUWAMY TO Z KONSTRUKTORA I ZAMIAST TEGO DAJEMY SETTERY DO POL
//        this.adress = adress;
//        this.floorsNumber = floorsNumber;
//        this.doorsNumber = doorsNumber;
//        this.windowsNumber = windowsNumber;
    }

    // W TYCH SETERACH DAJEMY ZAMIAST VOID TO TYP zwracany HOUSE
    // A NIZEJ POPROSTU RETURN THIS
    public House setAdress(String adress) {
        return this;
    }

    public House setFloorsNumber(Integer floorsNumber) {
        return this;
    }

    public House setDoorsNumber(Integer doorsNumber) {
        return this;
    }

    public House setWindowsNumber(Integer windowsNumber) {
        return this;
    }

    //NAPISANIE METODY WYTWORZENIA, z polami ktore ustawiamy metodami
    public House createHouse() {
        return new House(adress, floorsNumber, doorsNumber, windowsNumber);
    }

    //STWORZENIE BRAKUJACEGO KONSTRUKTORA

    public House(String adress, Integer floorsNumber, Integer doorsNumber, Integer windowsNumber) {
        this.adress = adress;
        this.floorsNumber = floorsNumber;
        this.doorsNumber = doorsNumber;
        this.windowsNumber = windowsNumber;
    }

    // POTEM W MAINIE TWORZYMY OBIEKT HOUSE
}



