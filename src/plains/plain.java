package plains;

public class plain {
    private int speed;
    private int weight;
    private String color;
    private int[] coordinates;

    public void SetValues (int speed, int _weight, String _color, int[] _coordinates){
        this.speed = speed;
        weight = _weight;
        color = _color;
        coordinates = _coordinates;

    }
    public void ShowValues (){
        String info = "Object speed: " + speed + "\n" + "Object weight: " + weight +"\n" + "Object color:" + color ;
        System.out.println(info);

    }

}

