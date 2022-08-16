package birdStrExpl;

public class Bird implements EatStrategy, TravelStrategyB, SleepStrategy {
    public EatStrategy eatStrategy;
    public TravelStrategyB travelStrategyB;
    public SleepStrategy sleepStrategy;

    @Override
    public void eat() {
    eatStrategy.eat();
    }

    @Override
    public void sleep() {
    sleepStrategy.sleep();
    }

    @Override
    public void movement() {
    travelStrategyB.movement();
    }
}
