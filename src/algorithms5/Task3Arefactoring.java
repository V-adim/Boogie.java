package algorithms5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class Task3Arefactoring {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k;
        String[][] songs = new String[n][];
        ArrayList<String> pList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            k = s.nextInt();

            songs[i] = new String[k];
            for (int j = 0; j < k; j++) {
                songs[i][j] = s.next();
            }
        }
        for (int i = 0; i < songs[0].length; i++) {
            if(n == 1){
                pList.add(songs[0][i]);
            }
        }

        for (int i = 0; i < songs.length - 1; i++) {
            for (int j = 0; j < songs[i].length; j++) {
                for (int l = 0; l < songs[i + 1].length; l++) {
                    if (Objects.equals(songs[i][j],songs[i + 1][l]) & !(pList.contains(songs[i][j]))){
                        pList.add(songs[i][j]);
                        break;
                    }
                }
            }
        }

        System.out.println(pList.size());
        Collections.sort(pList);
        for (String value : pList) {
            System.out.print(value + " ");
        }
    }
}
