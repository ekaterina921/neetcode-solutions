package OOP;

public abstract class AbstractClass {
    Integer var1;
    public String str = "I am an abstract class";
    public AbstractClass(Integer var1){
        this.var1 = var1;
    }


    public void fly(){
        System.out.println("Abstract flight");
    };

}
