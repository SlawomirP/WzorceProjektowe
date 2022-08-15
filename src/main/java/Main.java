public class Main {
    public static void main(String[] args) {

//UTWORZENIE OBIEKTU PRZY POMOCY BUILDERA

        House house = new House.HouseBuilder()
                .setAdress("ul. Dluga")
                .setDoorsNumber(3)
                .setWindowsNumber(10)
                .build();
    }
}
