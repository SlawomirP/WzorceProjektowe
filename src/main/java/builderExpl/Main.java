package builderExpl;

import builderExpl.House;
import models.FamilyHouse;

public class Main {
    public static void main(String[] args) {

//UTWORZENIE OBIEKTU PRZY POMOCY BUILDERA

        House house = new House.HouseBuilder()
                .setAdress("ul. Dluga")
                .setDoorsNumber(3)
                .setWindowsNumber(10)
                .build();


        //STATYCZNE METODY WYTWORZCZE
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


    }
}
