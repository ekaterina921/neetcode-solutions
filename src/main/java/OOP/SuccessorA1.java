package OOP;

public class SuccessorA1 extends AbstractClass{
    Integer varA1;
    public String str = "I am a successor of abstract class";
    public SuccessorA1(Integer varA1){
        super(varA1);
    }

    @Override
    public void fly() {
        System.out.println("A concrete flight");;
    }

    public void explore(){
        System.out.println("I am exploring");
    }

}
