import java.util.ArrayList;

public class arraylist {
    public static void main (String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Вася");
        names.add("Коля");
        names.add("Петя");
        names.add("Саша");
        names.add("Андрей");
        for (String el : names) {
            System.out.println(el);
        }
        System.out.println("конец первой части");
        names.add(2, "ПЁТР");
        for (String el : names) {
            System.out.println(el);
        }
        System.out.println("Добавили: ");
        System.out.println(names.get(2));
        names.remove(2);
        System.out.println("Удалили: ПЁТР");
        for (String el : names) {
            System.out.println(el);
        }
        System.out.println("ЧИСТИМ ВСЕ");
        names.clear();
        for (String el : names) {
            System.out.println(el);
        }
    }
}
