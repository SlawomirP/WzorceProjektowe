package builderExpl;

import adapterExpl.OfficialTrippingEmployee;
import apiFacade.ApiFacade;
import birdStrExpl.Bird;
import birdStrExpl.FlyTravelStrategy;
import birdStrExpl.MouseEatStrategy;
import birdStrExpl.TreeSleepStrategy;
import decoratorExpl.DeadlineBonus;
import decoratorExpl.FreqBonus;
import decoratorExpl.Payable;
import decoratorExpl.SpecialBonus;
import models.FamilyHouse;
import observersExpl.ObservableTempValue;
import strategyExpl.BikeTravelStrategy;
import strategyExpl.CarTravelStrategy;
import strategyExpl.DoctorJobStrategy;
import strategyExpl.Employee;
import strategyExpl.SandwichBreakfastStrategy;
import strategyExpl.SemiHouseLivingStrategy;

public class Main {
    public static void main(String[] args) throws InterruptedException {



        //TO ZOSTALO PRZENIESIONE DO METODY W KLASIE FACADE

//        //STRATEGIA
//        //plan: (bez napisanych klas i metod)
//        Employee mike = new Employee();
//
//        mike.travelStrategy = new BikeTravelStrategy();
//        mike.jobStrategy = new DoctorJobStrategy();
//        mike.breakfastStrategy = new SandwichBreakfastStrategy();
//
//        mike.goToWork();
//        mike.doYourJob();
//        mike.eatYourBreakfast();
//
//        mike.travelStrategy = new CarTravelStrategy();
//
//        mike.livingStrategy = new SemiHouseLivingStrategy();
//        mike.living();
//
//
//
//        //wzorzec ADAPTER implementacja
//
//        OfficialTrippingEmployee otMike = new OfficialTrippingEmployee(mike);
//        otMike.goToClient();
//
//        //WZORZEC DEKORATOR
//
//        mike.setSalary(10000);
//
//        System.out.println("zarobki " + mike.getSalary());
//        System.out.println("zarobki " + new FreqBonus(new DeadlineBonus(new SpecialBonus(mike))).getSalary());
//
//        Payable employee = mike;
//        if(mike.getSalary() > 8000){
//            employee = new SpecialBonus(employee);
//        }
//        if(mike.travelStrategy instanceof BikeTravelStrategy){
//            employee = new FreqBonus(employee);
//        }
//
//
//        System.out.println("zarobki " + employee.getSalary());



        //FASADA
        ApiFacade facade= new ApiFacade();
        Employee mike = facade.createDoctor(1000);
        facade.pushDoctorToJob(mike);
        facade.countSalary(mike);

        facade.giveFreeHouseToBestFreqEmployee(mike);


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

//        House house = new House.HouseBuilder()
//                .setAdress("ul. Dluga")
//                .setDoorsNumber(3)
//                .setWindowsNumber(10)
//                .build();


        //STATYCZNE METODY WYTWORZCZE ---------
        //np to jest typ prymitywny i nie mamy przez to dostepu
        //do roznych metod jakie mialby obiekt boolean
//        boolean isTrue = true;

        // tworzymy obiekt boolean z gotowego booleana
        //valueOf to metoda statyczna
        // na podstawie to met from
        //z innego to of
        //value of wartosc z ...
//        Boolean.valueOf(isTrue);

        //poprostu piszemy, podkresli, klikamy i dorabiamy metode
//        FamilyHouse.from(house);

        //przypisujemy do zmiannej
//        FamilyHouse familyHouse = FamilyHouse.from(house);

//        Logger.getInstance(). tutaj wywolujemy metody z Loggera
    }
}
