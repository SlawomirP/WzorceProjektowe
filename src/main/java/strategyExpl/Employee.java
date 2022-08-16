package strategyExpl;

public class Employee implements TravelStrategy, JobStrategy,BreakfastStrategy{
    public TravelStrategy travelStrategy;
    public JobStrategy jobResponsibility;
    public BreakfastStrategy breakfast;

    @Override
    public void goToWork() {

    }

    @Override
    public void doYourJob() {

    }

    @Override
    public void eatYourBreakfast() {

    }
}
