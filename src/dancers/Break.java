package dancers;

public class Break extends Dancer {
    public Break (String name, int age, boolean CanDo) {
        super(name,age, CanDo);
    }
    @Override
    public void dance () {
        System.out.println(Hello() + "Я танцую БРЭЙК...");
    }
}
