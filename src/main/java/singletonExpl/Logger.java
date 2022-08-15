package singletonExpl;

public class Logger {
    //TO ROZWIAZANIE JEST SREDNIO BEZPIECZNE, NP
    //JEZELI ZOSTANIE WYWOLANY PRZEZ 2 WĄTKI
    //UWAGA !!! pole prywatne klasy w ktorej jestesmy
    private static Logger instance;

    //aby Loggera nie mozna bylo utworzyc w innym miejscu
    //niz ta klasa to dodajemy
    private Logger() {
    }

    //publiczny dostep i zwraca nam Loggera getter
    public static Logger getInstance() {
        //jezeli instacja jest pusta to tworzy nowa i
        //zwraca ta nowa jezeli jest cos w instancji
        //to poprostu ja zwraca
        if (Logger.instance == null) {
            instance = new Logger(); // to decyduje ze to wzorzec kreacyjny
            return instance;
        } else {
            return instance;
        }
    }
    //wywolujemy w mainie

    //dalej jeszcze moze byc dodatkowa logika
    //metody i inne ktore wywolujemy przez komende w mainie
}
