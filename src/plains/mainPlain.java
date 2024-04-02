package plains;

public class mainPlain {
    public static void main (String[] args){
        plain MIG = new plain();
        MIG.SetValues(10000, 5000, "black", new int[]{123,223,323});

        MIG.ShowValues();

        plain IL = new plain();
        IL.SetValues(9999,9999,"WHITE",new int[]{454,455,456});
        IL.ShowValues();


    }

}
