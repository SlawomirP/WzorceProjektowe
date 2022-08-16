package strategyExpl;

public class Employee implements TravelStrategy, JobStrategy,BreakfastStrategy, LivingStrategy{
    public TravelStrategy travelStrategy;
    public JobStrategy jobStrategy;
    public BreakfastStrategy breakfastStrategy;
    public SemiHouseLivingStrategy livingStrategy;

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
}
