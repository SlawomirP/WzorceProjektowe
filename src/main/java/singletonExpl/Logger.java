package singletonExpl;

public class Logger {
    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        //ta metoda za chwile zostanie stworzona (SingletonHolder)
        return SingletonHolder.INSTANCE; // Bill Pugh
    }

    public void logToConsole(){}


    //to jest klasa wewnetrzna z jednym polem (SingletonHolder)
    private static class SingletonHolder{
        private static final Logger INSTANCE = new Logger();
    }
}
