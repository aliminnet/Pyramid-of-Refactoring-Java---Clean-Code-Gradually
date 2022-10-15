package pl.refactoring.interpreter.basement;

public class AndSpec implements Spec{
    private Spec first;
    private Spec second;

    public AndSpec(Spec first, Spec second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isSatisfiedBy(RealEstate estate) {
        return first.isSatisfiedBy(estate) && second.isSatisfiedBy(estate);
    }
}
