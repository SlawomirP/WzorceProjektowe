package strategyExpl;

public class Employee implements TravelStrategy, JobStrategy,BreakfastStrategy{
    public TravelStrategy travelStrategy;
    public JobStrategy jobStrategy;
    public BreakfastStrategy breakfastStrategy;

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
}
