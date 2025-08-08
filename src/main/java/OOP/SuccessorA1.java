package OOP;

public class SuccessorA1 extends AbstractClass{
    Integer varA1;
    public SuccessorA1(Integer varA1){
        super(varA1);
    }

    @Override
    public void fly() {
        System.out.println("A concrete flight");;
    }
}
