public class function {
    public static void h (String a){
       System.out.println(a);
        info(a);
        info(String.valueOf(123458));
    }
    public static int act (Integer a,Integer b){
        int c=a*b;
        System.out.println(c);
        return c;
    }

    public static void info (String word) {
        System.out.println(word);
    }
    public static void main (String[] args){
        int c=act(400,300);
        info("kharim");
        info("i want to find him");
        info("it's not easy");
        act(5,100);
        h("HELPPPP!!!!");
        act(1000,78);
        info(String.valueOf(c));
    }


    }


