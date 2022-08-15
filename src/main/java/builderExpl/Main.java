package builderExpl;

import models.FamilyHouse;

import java.util.Observable;
import java.util.Observer;

public class Main {
    public static void main(String[] args) {

        //WZORCE CZYNNOŚCIOWE
//potrzebujemy obiektu obserwowanego i obiektu/ow obserwujacych
        //najpierw obiekt obserwowany, stworzymy klase anonimowa
        //ta metode mozna dac w osobna klase tak samo jak obserwatorow
        //ale w zasiegu tej klasy
        Observable observableValue = new Observable(){
        //metoda rozglaszajaca, crt+O i nadpisujemy metode notifyObservers
            @Override
            public void notifyObservers(Object arg) {
                //bonusowo super.setChanges do odnotowania zmiany
                super.setChanged();
                super.notifyObservers(arg);
            }
        };

        //tutaj obserwatorzy
        observableValue.addObserver(new Observer(){
            //ta metoda wywola sie jak zmianie ulegnie obserwowany
            //ta i ta nizej wywolaja sie po kolei, jak z listy
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("1 " + arg.toString());
            }
        });
        observableValue.addObserver(new Observer(){
            //ta metoda wywola sie jak zmianie ulegnie obserwowany
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("2 " + arg.toString());
            }
        });

        //obserwatora mozna zrobic tez na lambdzie
        observableValue.addObserver((o, arg) -> System.out.println("3 " + arg.toString()));

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
