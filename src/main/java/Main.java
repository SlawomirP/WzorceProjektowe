public class Main {
    public static void main(String[] args) {

//        new House("ul dluga", 2, 3 , 12);
        // new House .setAdress      .setFloors    . .setDoorsNumber .setWindowNumber

        //STWORZENIE OBIEKTU Z BUDOWNICZEGO
        House house = new House()
                .setAdress("ul. Dluga")
                .setDoorsNumber(3)
                .setWindowsNumber(10)
                .createHouse();
    }
}
