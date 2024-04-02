package dancers;

public class Main {
    public static void main (String[] args){
        Dancer vasya = new Dancer("ВАСЯ",15, false);
        vasya.dance();
        vasya.DoSalto();

        Dancer petya = new Break("Петя",14, true);
        petya.dance();
        petya.DoSalto();

        Dancer kolya = new Boogie("Коля",13, false);
        kolya.dance();
        kolya.DoSalto();

    }

}
