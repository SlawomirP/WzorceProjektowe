package strategyExpl;

public class DoctorJobStrategy implements JobStrategy {
    @Override
    public void doYourJob() {

        System.out.println("cure people");
    }
}
