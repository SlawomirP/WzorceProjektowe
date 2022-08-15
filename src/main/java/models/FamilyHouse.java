package models;

import builderExpl.House;

public class FamilyHouse {

   String adress;
    private final Integer floorsNumber;
    Integer floorsNumbers;

    public FamilyHouse(String adress, Integer floorsNumber) {

        this.adress = adress;
        this.floorsNumber = floorsNumber;
    }

    //tworzymy ,etode ktora zwroci obiekt FamilyHouse utworzony z obiektu
    // klasy House, pola zostana wypelnione wartosciami pobranymi z
    //obiektu w parametrze za pomoca geterow
    //TO JEST TUTAJ NAJWAZNIEJSZE CZYLI STWORZENIE NOWEGO OBIEKTU
    //NA PODSTAWIE INNEGO I DANYMI Z NIEGO
    public static FamilyHouse from(House house) {
        return new FamilyHouse(house.getAdress(), house.getFloorsNumber());
    }
}
