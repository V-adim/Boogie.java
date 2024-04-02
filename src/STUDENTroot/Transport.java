package STUDENTroot;

import java.util.Arrays;

public class Transport {
    public float speed;
    public int weight;
    public String color;
    public int[] coordinate;
    public boolean IsLoaded;


    public Transport () {
        System.out.println("Object created.");
        System.out.println(Transport.class.getName());
    }
    public void SetValues(float _speed, int _weight, String _color, int[] _coordinate, boolean _IsLoaded) {
        speed = _speed;
        weight = _weight;
        color = _color;
        coordinate = _coordinate;
        IsLoaded = _IsLoaded;
    }

    public String GetValues() {
        String info = "Object speed: " + speed + "\n" + "Object weight: " + weight +"\n" + "Object color:" + color ;
        //             пробуем переписать метод про координаты  из видео
//         String infoCoordinates = "coordinates: /n";
//         for (int i=0;i<coordinate.length;i++){
//             infoCoordinates =+ coordinate[i]+"\n";
//         }
//        ПЕРЕПИСАТЬ НЕ ПОЛУЧИЛОСЬ
        return info;


    }
}
