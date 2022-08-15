package builderExpl;

import models.FamilyHouse;

import java.util.Observable;
import java.util.Observer;

public class Main {
    public static void main(String[] args) {

        //WZORCE CZYNNOŚCIOWE
//potrzebujemy obiektu obserwowanego i obiektu/ow obserwujacych
        //najpierw obiekt obserwowany, stworzymy klase anonimowa
        Observable observableValue = new Observable(){
        //metoda rozglaszajaca
        };

        //tutaj obserwatorzy
        observableValue.addObserver(new Observer(){
            //ta metoda wywola sie jak zmianie ulegnie obserwowany
            //ta i ta nizej wywolaja sie po kolei, jak z listy
            @Override
            public void update(Observable o, Object arg) {
            }
        });
        observableValue.addObserver(new Observer(){
            //ta metoda wywola sie jak zmianie ulegnie obserwowany
            @Override
            public void update(Observable o, Object arg) {
            }
        });

        // metoda ktora poinformuje obserwatorow ze cos sie zmienilo
        //argumentem metody jest obiekt tak ze mozna wrzucic wszystko
        observableValue.notifyObservers(54);

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
