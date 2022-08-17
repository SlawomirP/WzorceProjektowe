package apiFacade;

import adapterExpl.OfficialTrippingEmployee;
import builderExpl.House;
import decoratorExpl.DeadlineBonus;
import decoratorExpl.FreqBonus;
import decoratorExpl.Payable;
import decoratorExpl.SpecialBonus;
import strategyExpl.BikeTravelStrategy;
import strategyExpl.CarTravelStrategy;
import strategyExpl.DoctorJobStrategy;
import strategyExpl.Employee;
import strategyExpl.SandwichBreakfastStrategy;
import strategyExpl.SemiHouseLivingStrategy;

public class ApiFacade {


    public Employee createDoctor(int i) {
        //STRATEGIA
        //plan: (bez napisanych klas i metod)
        Employee mike = new Employee();
        mike.setSalary(i);

        mike.travelStrategy = new BikeTravelStrategy();
        mike.jobStrategy = new DoctorJobStrategy();
        mike.breakfastStrategy = new SandwichBreakfastStrategy();





        //wzorzec ADAPTER implementacja

        OfficialTrippingEmployee otMike = new OfficialTrippingEmployee(mike);
        otMike.goToClient();







        return mike;
    }

    public void pushDoctorToJob(Employee mike) {
        mike.goToWork();
        mike.doYourJob();
        mike.eatYourBreakfast();

        mike.travelStrategy = new CarTravelStrategy();

        mike.livingStrategy = new SemiHouseLivingStrategy();
        mike.living();

    }

    public int countSalary(Employee mike) {
        System.out.println("zarobki " + mike.getSalary());
        System.out.println("zarobki " + new FreqBonus(new DeadlineBonus(new SpecialBonus(mike))).getSalary());

        Payable employee = mike;
        if(mike.getSalary() > 8000){
            employee = new SpecialBonus(employee);
        }
        if(mike.travelStrategy instanceof BikeTravelStrategy){
            employee = new FreqBonus(employee);
        }


        return employee.getSalary();
    }

    public void giveFreeHouseToBestFreqEmployee(Employee mike) {
        System.out.println(mike.toString() + "dostaje dom" + new House.HouseBuilder()
                .setAdress("ul. Dluga")
                .setDoorsNumber(3)
                .setWindowsNumber(10)
                .build().toString());
    }
}
