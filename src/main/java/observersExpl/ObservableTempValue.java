package observersExpl;

import java.util.Observable;

public class ObservableTempValue extends Observable {

    //zmienna do przechowania starej wartosci
    private int oldTemp = 0;

    //wklejamy wnetrze z klasy anonimowej, dzieki temu
    //ze mamy to w naszej metodzie mozna zmienic nazwe na
    //bardziej dla nas czytelna i mozna zmienic wnetrze
    //jezeli wiadomo ze to temp to mozna dac int
    public void setValue(int newTemp) { //trzeba tez zmienic nazwe metody do obserwacji
        //o ile sama sie nie zmienila shift+F6
        if (newTemp != oldTemp) {
            super.setChanged(); // sprzwdzenie zmiany, to flaga sterująca, wszyscy usłysza
            super.notifyObservers(newTemp); // powiadomienie
            oldTemp = newTemp; // aktualizuje temp
        }
    }

    //geter do starej temp
    public int getOldTemp() {
        return oldTemp;
    }
}
