package strategyExpl;

import decoratorExpl.Payable;

public class Employee implements TravelStrategy, JobStrategy,BreakfastStrategy, LivingStrategy, Payable {
    public TravelStrategy travelStrategy;
    public JobStrategy jobStrategy;
    public BreakfastStrategy breakfastStrategy;
    public SemiHouseLivingStrategy livingStrategy;

    private int salary = 0;

    @Override
    public void goToWork() {
        travelStrategy.goToWork();
    }


    @Override
    public void doYourJob() {
            jobStrategy.doYourJob();
        }


    @Override
    public void eatYourBreakfast() {
        breakfastStrategy.eatYourBreakfast();

    }

    @Override
    public void living() {
        livingStrategy.living();
    }
    @Override
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
