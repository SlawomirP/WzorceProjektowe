package builderExpl;

import models.FamilyHouse;
import observersExpl.ObservableTempValue;

public class Main {
    public static void main(String[] args) throws InterruptedException {








//
    }

    private static void observePattern() throws InterruptedException {
        //to zostaje zamienione, tworzymy obiekt klasy
//        Observable observableValue = new Observable(){
//            @Override
//            public void notifyObservers(Object arg) {
//                super.setChanged(); // sprzwdzenie zmiany
//                super.notifyObservers(arg); // powiadomienie
//            }
//        };
        ObservableTempValue observableValue = new ObservableTempValue();

        // zastepujemy lambdami
        observableValue.addObserver((o, arg) -> System.out.println("1 " + arg.toString()));
        observableValue.addObserver((o, arg) -> System.out.println("2 " + arg.toString()));
        observableValue.addObserver((o, arg) -> System.out.println("3 " + arg.toString()));

        //napisanie malej symulacji jak by to mialo wygladac w programie
        while (true) {
            Thread.sleep(500); // co pol sec sprawdzi stan
            //tu dodamy cos zeby zmieniala sie randomowo temp
            observableValue.setValue((int) (observableValue.getOldTemp() +
                    Math.random() * 6 - 2));

        }
    }
    private static void creationPatterns() {
        //UTWORZENIE OBIEKTU PRZY POMOCY BUILDERA

        House house = new House.HouseBuilder()
                .setAdress("ul. Dluga")
                .setDoorsNumber(3)
                .setWindowsNumber(10)
                .build();


        //STATYCZNE METODY WYTWORZCZE ---------
        //np to jest typ prymitywny i nie mamy przez to dostepu
        //do roznych metod jakie mialby obiekt boolean
        boolean isTrue = true;

        // tworzymy obiekt boolean z gotowego booleana
        //valueOf to metoda statyczna
        // na podstawie to met from
        //z innego to of
        //value of wartosc z ...
        Boolean.valueOf(isTrue);

        //poprostu piszemy, podkresli, klikamy i dorabiamy metode
        FamilyHouse.from(house);

        //przypisujemy do zmiannej
        FamilyHouse familyHouse = FamilyHouse.from(house);

//        Logger.getInstance(). tutaj wywolujemy metody z Loggera
    }
}
