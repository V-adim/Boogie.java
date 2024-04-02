public class Arrays {



    public static void main(String args[]){
        int ar [] = new int[10];
        for (int i = 0; i<ar.length;i++){
            ar[i]=i*17;
            System.out.println("i = " + i + "\nэлемент = " + ar[i]);
        }
        String ar1[]= {"вася","коля","петя"};
        for (String str:ar1){
            System.out.println(str);
        }
        int[][] ar2 = {{5,4,27,34,2,3},{34,23}};


       for (int i=0;i<ar2.length;i++) {
       for (int j=0;j<ar2[i].length;j++) {
           System.out.print(ar2[i][j]+"  ");
       }
           System.out.println("\n");
       }
       }

    }


