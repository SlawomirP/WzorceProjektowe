package decoratorExpl;

public class DeadlineBonus extends Bonus{
    public DeadlineBonus(Payable payable) {
        super(payable);
    }

    @Override
    protected int getPaidBonus(int salary) {
        return (int) (salary * 0.1f);
    }
}
