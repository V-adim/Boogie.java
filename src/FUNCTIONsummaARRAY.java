public class FUNCTIONsummaARRAY {
    public static void main (String[] args){
        String[] names = new String[]{"sdw","sed","dfx","sdw","dwd"};
        System.out.println(names[1]);
        int q=letSum(names);
        System.out.println("СУММА ДЛИН ВСЕХ ИМЕН 1:  "+q);
        String[] names2=new String[]{"Вася","Коля","Петя","Саша","Слава"};
        int w=letSum(names2);

        System.out.println("СУММА ДЛИН ВСЕХ ИМЕН 2:  "+w);

    }

    public static int letSum (String[] arr){
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            String a = arr[i];
            int b = a.length();
            sum +=b;}

            return sum;

    }
}
