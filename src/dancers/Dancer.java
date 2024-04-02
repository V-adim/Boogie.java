package dancers;

public class Dancer implements ILights{
    protected String name;
    protected int age;
   private boolean CanDo;

    public Dancer (String name, int age, boolean CanDo) {
        this.name = name;
        this.age = age;
        this.CanDo = CanDo;
    }

    public String Hello() {
        return "Привет! Я " + name + ". Мне " + age + "лет.";
    }
    public void dance (){
        System.out.println(Hello() + "Я танцую как все...");
    }
    @Override
    public void DoSalto (){
        if (CanDo == true)
            System.out.println("Может крутить сальто");

        else
            System.out.println("Сальто не умеет");
    };

}


