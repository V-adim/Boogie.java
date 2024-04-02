package dancers;

public class Boogie extends Dancer{
    public Boogie (String name, int age, boolean CanDo) {

        super(name,age,CanDo);
    }
    @Override
    public void dance () {
        System.out.println(Hello() + "Я танцую БУГИ...");
    }
}
