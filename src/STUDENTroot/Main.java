package STUDENTroot;

import java.util.Arrays;

import static java.awt.Color.black;

public class Main {
    public static void main (String[] args){
//        ООП: классы и объекты.
        Transport bmw = new Transport();
        bmw.speed = 250.5f;
        bmw.weight = 2500;
        bmw.color = "White";
        bmw.coordinate = new int[] {111,11,1};
        
        Transport truck = new Transport();
        truck.speed = 120.5f;
        truck.weight = 5400;
        truck.color = "Red";
        truck.coordinate = new int[] {100,100,0};

        System.out.println("Truck coordinate: " + Arrays.toString(truck.coordinate));

        System.out.println("Truck speed: " + truck.speed);
        System.out.println("BMW speed: " + bmw.speed);
        System.out.println("пробуем использовать функцию");

        truck.SetValues (100.2f,1999,"black", new int[] {111,101,77},true);
        System.out.println("Truck speed: " + truck.speed);
        System.out.println("Truck weight: " + truck.weight);
        System.out.println("Truck color: " + truck.color);
        System.out.println("Truck coordinate: " + Arrays.toString(truck.coordinate));

        System.out.println("это нифига не функция ");

        String aaa = truck.GetValues();

        System.out.println("TRUCK \n"+aaa);
        String bbb = bmw.GetValues();
        System.out.println("BMW \n"+bbb);

        System.out.println("хоть что-то вернули и устали");

        System.out.println("    пробуем переписать метод про координаты  из видео");

        String res1 = truck.GetValues();
        System.out.println(res1);
        System.out.println("   ПЕРЕПИСАТЬ НЕ ПОЛУЧИЛОСЬ");

        Truck Belaz = new Truck(99f,2000, "red",new int[]{111,222,333},true);

       Belaz.SetValues(99f,2000, "red",new int[]{111,222,333},true);
        System.out.println(Belaz.GetValues());
        if (Belaz.IsLoaded == true) {
            System.out.println("ЗАГРУЖЕН");
        }
        else {
            System.out.println("ПУСТОЙ");
        }
        }



    }

